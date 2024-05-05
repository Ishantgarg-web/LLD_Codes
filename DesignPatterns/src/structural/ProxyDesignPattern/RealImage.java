package structural.ProxyDesignPattern;

public class RealImage implements IImage{
	
	private String fileName;
	
	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
		this.getImage();
	}

	public String getFileName() {
		return this.fileName;
	}

	@Override
	public void getImage() {
		System.out.println("getting from database");
	}

}
