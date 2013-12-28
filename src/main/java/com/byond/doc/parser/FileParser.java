package com.byond.doc.parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.regex.Pattern;

import com.byond.doc.model.ParseTree;

public class FileParser {
	private final Path inputFile;
	private static final Pattern END_COMMENT_REGEX = Pattern.compile("\\*\\*/^");
	private static final Pattern START_COMMENT_REGEX = Pattern.compile("/\\*\\*^");
	
	public FileParser(final Path inputFile) {
		this.inputFile = inputFile;
	}
	
	@SuppressWarnings("finally")
	public ParseTree parse()  {
		ParseTree result = new ParseTree();
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile.toFile()))) {
			String line = null;
			StringBuilder builder = null;
			while ((line = reader.readLine()) != null) {
				if (builder != null) {
					if (END_COMMENT_REGEX.matcher(line).matches()) {
						String docContent = builder.toString();
						builder = null;
						DocContentParser contentParser = new DocContentParser(docContent);
						contentParser.parse(result);
					} else {
						builder.append(line);
						builder.append('\n');
					}
				} else if (START_COMMENT_REGEX.matcher(line).matches()) {
					builder = new StringBuilder();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO: Log out exception here, as debug.
		} finally {
			return result;
		}
	}
}
