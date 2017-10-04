package br.com.compiladores.top;

import java.io.IOException;
import java.io.StringReader;

public class LanguageSextaFase {
public static void main(String[] args) throws IOException {
	//String expr = "if 2 + 3 + a then";
	String expr = "a + b * c / d";
	LexicalAnalyzer lexical = new LexicalAnalyzer(new StringReader(expr));
	lexical.yylex();
}
}
