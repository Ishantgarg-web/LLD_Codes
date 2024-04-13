package com.example.fileSystem;

import java.util.List;

public class File implements FileSystem{

	private String name;
	private String content;
	
	public File(String name, String content) {
		this.name = name;
		this.content = content;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public boolean isDirectory() {
		return false;
	}

	@Override
	public List<FileSystem> getFileSystemList() {
		return null;
	}
	
	@Override
	public void setNullName() {
		this.name = null;
	}

	@Override
	public void setNullFileSystemList() {
		return;
	}
}
