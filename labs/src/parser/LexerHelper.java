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

    public static Character lexemeToChar(String
                                                 charLexeme) {
        if (charLexeme.charAt(1) == '\\') {
            char c = charLexeme.charAt(2);
            if (c == 'n') return '\n';
            if (c == 't') return '\t';
            String asciiCode =
                    charLexeme.substring(2, charLexeme.length() -
                            1);
            return (char)
                    Integer.parseInt(asciiCode);
        }
        return charLexeme.charAt(1);
    }

    public static Double lexemeToReal(String lexeme) {
        try {
            return Double.parseDouble(lexeme);
        }
        catch(NumberFormatException e) {
            System.out.println(e);
        }
        return -1.0;
    }

}
