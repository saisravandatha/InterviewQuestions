package com.interview.streams;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReadingAndWriting {

	public static void main(String[] args) {
		try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\srava\\OneDrive\\Desktop\\input.txt"))) {
			FileWriter writer = new FileWriter("C:\\Users\\srava\\OneDrive\\Desktop\\newFile.txt");
			writer.write("Hi Man");
			writer.close();
		    stream.map(e -> e.toUpperCase()).forEach(System.out::println);;
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		
	}

}
