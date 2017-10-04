package br.com.compiladores.top;

import java.io.File;
import java.nio.file.Paths;

public class Generator {
	public static void main(String[] args) {
		String rootPath = Paths.get("").toAbsolutePath().toString();
		String subPath = "/src/br/com/compiladores/top/";
		String fileName = "language.lex";

		String file = rootPath + subPath + fileName;
		System.out.println(file);

		File sourceCode = new File(file);
		jflex.Main.generate(sourceCode);

	}
}
