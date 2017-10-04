package br.com.compiladores.top;

import java.io.IOException;
import java.io.StringReader;

public class LanguageSextaFase {
public static void main(String[] args) throws IOException {
	//String expr = "if 2 + 3 + a then";
	//String expr = "se 2 + 3 + a * b";
	String expr = "a + b * c / d enquanto se";
	LexicalAnalyzer lexical = new LexicalAnalyzer(new StringReader(expr));
	lexical.yylex();
}
}
