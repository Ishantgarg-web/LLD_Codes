package structural.CompositeDesignPattern;

public class File implements FileSystem{
	
	private String name;
	private int size;
	
	public File(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int getSize() {
		return this.size;
	}

}
