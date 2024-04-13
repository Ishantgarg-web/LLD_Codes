package com.example.fileSystem;

import java.util.List;

public interface FileSystem {

	void setNullName();
	
	void setNullFileSystemList();
	
	String getName();
	
	boolean isDirectory();
	
	List<FileSystem> getFileSystemList();
}
