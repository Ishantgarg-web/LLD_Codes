package structural.CompositeDesignPattern;

import java.util.List;

public class Directory implements FileSystem{
	
	private List<FileSystem> items;
	
	public List<FileSystem> getItems() {
		return items;
	}

	public Directory(List<FileSystem> items) {
		super();
		this.items = items;
	}

	@Override
	public int getSize() {
		int size=0;
		for (FileSystem item: items) {
			size = size+item.getSize();
		}
		return size;
	}

}
