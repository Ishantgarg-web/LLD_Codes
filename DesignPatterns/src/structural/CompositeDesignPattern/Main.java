package structural.CompositeDesignPattern;

import java.util.Arrays;

/**
 * 
 * @author ishant
 * Composite Design Pattern: 
 * 	-> It is a structural design pattern.
 *  -> It follows tree like hierarchy structure where all leaf nodes can not have furthur objects whereas
 *  	all non-leaf nodes can have furthur objects.
 *  Here, FileSystem work as a abstraction, and in future if you need to append any other type(other than File
 *  or Directory) you can simple make a class that will implement the FileSystem and can use the properties of
 *  that.
 */

public class Main {
	public static void main(String[] args) {
		FileSystem file1 = new File("lld1.txt", 20);
		FileSystem file2 = new File("lld2.txt", 10);
		FileSystem file3 = new File("hld1.txt", 12);
		FileSystem file4 = new File("hld2.txt", 200);
		
		FileSystem dir1 = new Directory(Arrays.asList(file1, file2));
		FileSystem dir2 = new Directory(Arrays.asList(file3, file4));
		
		System.out.println(dir1.getSize());
		System.out.println(dir2.getSize());
	}
}
