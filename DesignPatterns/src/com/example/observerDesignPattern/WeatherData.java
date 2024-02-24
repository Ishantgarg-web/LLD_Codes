package com.example.observerDesignPattern;

public class WeatherData extends State{
	private int temperature;
	
	private int humidity;
	
	public WeatherData(int temp,int humi) {
		this.temperature = temp;
		this.humidity = humi;
	}
	
	@Override
	public String toString() {
		return "WeatherData [temperature=" + temperature + ", humidity=" + humidity + "]";
	}

	public int getTemperature() {
		return temperature;
	}

	public int getHumidity() {
		return humidity;
	}
	
	public void update(int newTemp, int newHumi) {
		WeatherData newWeather = new WeatherData(newTemp, newHumi);
		super.notifyObservers(newWeather);
	}
	
}
