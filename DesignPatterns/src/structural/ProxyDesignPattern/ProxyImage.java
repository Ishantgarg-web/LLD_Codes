package structural.ProxyDesignPattern;

public class ProxyImage implements IImage{

	private RealImage realImage;
	private String fileName;
	
	public RealImage getRealImage() {
		return realImage;
	}

	public ProxyImage(String fileName) {
		super();
//		this.realImage = realImage;
		this.fileName = fileName;
	}

	@Override
	public void getImage() {
		if(realImage == null) {
			realImage = new RealImage(fileName);
			return;
		}
		System.out.println("getting image from cache");
	}

}
