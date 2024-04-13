package com.example.fileSystem;

import java.util.List;

public interface FileSystem {

	
	String getName();
	
	boolean isDirectory();
	
	List<FileSystem> getFileSystemList();
}
