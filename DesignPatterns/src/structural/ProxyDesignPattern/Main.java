package structural.ProxyDesignPattern;

/**
 * 
 * @author ishant
 * -> structural design pattern
 * -> in this we will make a proxy class, that will get data from Real class and display to the client
 * 
 */

public class Main {
	public static void main(String[] args) {
		IImage image = new ProxyImage("sample.yt");
		image.getImage();
		image.getImage();
		image.getImage();
		image.getImage();
	}
}
