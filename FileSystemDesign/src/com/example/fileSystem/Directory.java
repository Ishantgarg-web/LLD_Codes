package com.example.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

	String name;
	List<FileSystem> fileSystemList;
	
	public Directory(String name) {
		this.name = name;
		this.fileSystemList = new ArrayList<>();
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public boolean isDirectory() {
		return true;
	}

	@Override
	public List<FileSystem> getFileSystemList() {
		return this.fileSystemList;
	}

	@Override
	public void setNullName() {
		this.name = "null";
	}

	@Override
	public void setNullFileSystemList() {
		this.fileSystemList = null;
	}

	

	
}
