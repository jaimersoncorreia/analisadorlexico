package br.com.compiladores.top;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import javax.swing.JFileChooser;

public class LanguageTop {
	public static void main(String[] args) throws IOException {
		String expr = "";

		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showDialog(null, "Selecionar");

		if (returnVal == 0) {
			 expr = (new LanguageTop().readFile(fc.getSelectedFile()));
		}
		LexicalAnalyzer lexical = new LexicalAnalyzer(new StringReader(expr));
		lexical.yylex();
	}

	public String readFile(File filePath) {
		StringBuffer sb = new StringBuffer();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String ScurrentLine;
			while ((ScurrentLine = br.readLine()) != null) {
				sb.append(ScurrentLine + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
