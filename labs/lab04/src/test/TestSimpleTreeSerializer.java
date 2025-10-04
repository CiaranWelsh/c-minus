import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import parser.CmmLexer;
import parser.CmmParser;


public class TestSimpleTreeSerializer {

    @Test
    public void test(){
        String inputString = "4 + 5";
        CharStream inputStream = CharStreams.fromString(inputString);
        CmmLexer lexer = new CmmLexer(inputStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CmmParser parser = new CmmParser(tokens);
        CmmParser.ProgramContext tree = parser.program();

        SimpleTreeSerializer simpleTreeSerializer = new SimpleTreeSerializer(tree);
    }
}
