package com.example.fileSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileManager {
	
	private Directory root;
	
	public FileManager() {
		this.root = new Directory("root");
	}
	
	public void createDirectory(String path) {
		/**
		 * path will be given as: system-design/lld
		 * 
		 * 1. we will check if given path present in root dir or not.
		 * if present, then we simply return else we will create this new directory.
		 */
		List<FileSystem> rootFileSystem = this.root.fileSystemList;
		String p[] = path.split("/");
		// p is: ["system-design","lld"]
		int i=0;
		while(i<p.length-1) {
			for(FileSystem fileSystem: rootFileSystem) {
				if(fileSystem.getName().equals(p[i]) && fileSystem.isDirectory()) {
					// it means, we find out this string
					rootFileSystem = fileSystem.getFileSystemList();
					i++;
				}
			}
		}
		// it means we reach the end of the path, and here we will create directory here.
		FileSystem newDir = new Directory(p[i]);
		rootFileSystem.add(newDir);
		System.out.println("Directory is created successfully");
	}
	
	public void createFile(String path) {
		/**
		 * Here, path will be as: "system-design/lld/notes1.txt"
		 * 1st we will go to the last dir in the given path i.e, lld
		 * and there we will create new file.
		 */
		String p[]=path.split("/");
		List<FileSystem> rootFileSystem = this.root.fileSystemList;
		int i=0;
		while(i<p.length-1) {
			for(FileSystem fileSystem: rootFileSystem) {
				if(fileSystem.getName().equals(p[i]) && fileSystem.isDirectory()) {
					// it means, we find out this string
					rootFileSystem = fileSystem.getFileSystemList();
					i++;
				}
			}
		}
		// Here, we will add the file to this rootFileSystem
		FileSystem  newFile = new File(p[i], "abc");
		rootFileSystem.add(newFile);
		System.out.println("File is created successfully");
	}
	
	public void ls(String path) {
		List<FileSystem> rootFileSystem = this.root.fileSystemList;
		String p[]=path.split("/");
		int i=0;
		while(i<p.length) {
			for (FileSystem fs: rootFileSystem) {
				if(fs.isDirectory() && fs.getName().equals(p[i])) {
					rootFileSystem = fs.getFileSystemList();
					i++;
					break;
				}
			}
		}
		// finally, we print the items of this rootFileSystem.
		if(rootFileSystem.isEmpty()) {
			System.out.println("Empty directory");
		}
		for(FileSystem fs: rootFileSystem) {
			System.out.println("FileSystem is: "+fs.getName()+" and isDirectory: "+fs.isDirectory());
		}
	}
	
}
