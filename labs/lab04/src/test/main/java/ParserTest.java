package main.java;

import org.antlr.v4.runtime.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import parser.CmmLexer;
import parser.CmmParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.fail;

/**
 * Black box testing for the parser.
 * Tests that valid programs parse without errors.
 */
public class ParserTest {

    public static class TestProgram {
        public final String name;
        public final String content;
        public final Path path;

        public TestProgram(String name, String content, Path path) {
            this.name = name;
            this.content = content;
            this.path = path;
        }
    }

    public static List<TestProgram> collectTestPrograms(String directory) throws IOException {
        try (Stream<Path> paths = Files.walk(Paths.get(directory))) {
            return paths
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".cmm"))
                    .sorted()
                    .map(path -> {
                        try {
                            String content = Files.readString(path);
                            String name = path.getFileName().toString();
                            return new TestProgram(name, content, path);
                        } catch (IOException e) {
                            throw new RuntimeException("Failed to read file: " + path, e);
                        }
                    })

                    .collect(Collectors.toList());
        }
    }

    public static void testLexerAndParser(String input) {
        CharStream inputStream = CharStreams.fromString(input);
        CmmLexer lexer = new CmmLexer(inputStream);

        // Collect lexer errors
        List<String> lexerErrors = new ArrayList<>();
        lexer.removeErrorListeners();
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg, RecognitionException e) {
                lexerErrors.add(String.format("Lexer error at line %d:%d - %s", line, charPositionInLine, msg));
            }
        });

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CmmParser parser = new CmmParser(tokens);

        // Collect parser errors
        List<String> parserErrors = new ArrayList<>();
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg, RecognitionException e) {
                parserErrors.add(String.format("Parser error at line %d:%d - %s", line, charPositionInLine, msg));
            }
        });

        // Parse the program
        parser.program();

        // Check for errors
        if (!lexerErrors.isEmpty() || !parserErrors.isEmpty()) {
            StringBuilder errorMessage = new StringBuilder();
            errorMessage.append("Parsing failed with the following errors:\n\n");

            if (!lexerErrors.isEmpty()) {
                errorMessage.append("Lexer Errors:\n");
                for (String error : lexerErrors) {
                    errorMessage.append("  - ").append(error).append("\n");
                }
            }

            if (!parserErrors.isEmpty()) {
                errorMessage.append("Parser Errors:\n");
                for (String error : parserErrors) {
                    errorMessage.append("  - ").append(error).append("\n");
                }
            }

            errorMessage.append("\nInput program:\n").append(input);

            fail(errorMessage.toString());
        }
    }

    @Test
    public void testSimpleProgram() {
        String input = """
                int a;
                
                void main() {
                }
                """;
        testLexerAndParser(input);
    }

    @Test
    public void testPrograms() throws IOException {
        String programsDir = "src/test/main/java/programs";

        int i = 0;
        for (TestProgram program : collectTestPrograms(programsDir)) {
            try {
                System.out.println("Testing program " + i + ": " + program.name);
                testLexerAndParser(program.content);
                i++;
            } catch (AssertionError e) {
                System.out.println("========= FAILED: " + program.name + " (" + program.path + ") ===================");
                System.out.println(program.content);
                System.out.println("========= Error ===================");
                System.out.println(e.getMessage());
                fail("Test failed for program: " + program.name + "\n" + e.getMessage());
            }
        }
        System.out.println("\nAll " + i + " programs passed!");
    }
}