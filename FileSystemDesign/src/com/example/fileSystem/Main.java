package com.example.fileSystem;

public class Main {
	public static void main(String[] args) {
		
		FileManager fileManager = new FileManager();
		
		fileManager.createDirectory("system-design");
		fileManager.createDirectory("system-design/lld");
		fileManager.createDirectory("system-design/lld/day1");
		fileManager.createFile("system-design/lld/day1/lldNotes.txt");
		fileManager.createFile("system-design/lld/day1/lld1.txt");
		fileManager.createFile("system-design/lld/day1/lld4.txt");
		fileManager.createDirectory("system-design/lld/day2");
//		
		fileManager.createDirectory("system-design/hld");
		fileManager.createDirectory("system-design/hld/day1");
		fileManager.createDirectory("system-design/hld/day2");
		fileManager.createFile("system-design/hld/day2/hldNotes.txt");
//		
		fileManager.ls("system-design/lld");
		
		// TODO: we can add rename and delete functionality
		
		fileManager.deleteDirectory("system-design/lld/day1");
		
		fileManager.ls("system-design/lld");
	}
}
