package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

    public static Object lexemeToChar(String charLexeme) {
        try {
            return charLexeme.charAt(0);
        }
        catch(NumberFormatException e) {
            System.out.println(e);
        }
        return -1;
    }

    public static Object lexemeToReal(String lexeme) {
        try {
            return Float.parseFloat(lexeme);
        }
        catch(NumberFormatException e) {
            System.out.println(e);
        }
        return -1;
    }

    // TODO: Implement the lexemeToChar and lexemeToReal methods
	
}
