import atr.TreeRewriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;
import org.junit.Test;
import parser.CmmLexer;
import parser.CmmParser;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import static org.junit.Assert.assertEquals;

/**
 * Integration tests for lexer and parser.
 *
 * Notes: Building separate unit tests for lexer and parser
 * seems like too much work for an academic project. Instead
 * I'll test them together. If you were to d
 */

public class TestParser {

    @Test
    public void test(){
        String input = "4 + 5";
        CharStream inputStream = CharStreams.fromString(input);
        CmmLexer lexer = new CmmLexer(inputStream);

        // create a parser that feeds off the tokens buffer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CmmParser parser = new CmmParser(tokens);

        CmmParser.ProgramContext actualParseTree = parser.program();


        var actualNode = new TreeRewriter(actualParseTree).rewrite();
        var gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String actualJson = gson.toJson(actualNode);

        // Expected JSON string
        String expected = """
                {
                  "label": "expression",
                  "line": 1,
                  "charPositionInLine": 0,
                  "startIndex": 0,
                  "stopIndex": 4,
                  "children": [
                    {
                      "label": "4",
                      "tokenType": 12,
                      "line": 1,
                      "charPositionInLine": 0,
                      "startIndex": 0,
                      "stopIndex": 0,
                      "children": []
                    },
                    {
                      "label": "+",
                      "tokenType": 8,
                      "line": 1,
                      "charPositionInLine": 2,
                      "startIndex": 2,
                      "stopIndex": 2,
                      "children": []
                    },
                    {
                      "label": "5",
                      "tokenType": 12,
                      "line": 1,
                      "charPositionInLine": 4,
                      "startIndex": 4,
                      "stopIndex": 4,
                      "children": []
                    }
                  ]
                }""";

        // Deserialize expected JSON back to object
        var expectedNode = gson.fromJson(expected, actualNode.getClass());

        // Compare the two objects
        String expectedJson = gson.toJson(expectedNode);

        System.out.println("Expected JSON:");
        System.out.println(expected);
        System.out.println("\nActual JSON:");
        System.out.println(actualJson);

        // Assert that they are equal
        assertEquals("Parse trees should match", expectedJson, actualJson);
    }


    @Test
    public void test2(){
//        ParseTreePattern pattern =
    }

}
