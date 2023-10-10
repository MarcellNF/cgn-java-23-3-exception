package org.example;

public class CarNotFoundException extends RuntimeException{
	public CarNotFoundException() {
		super("Car not found");
	}

	public CarNotFoundException(String message) {
		super(message);
	}
}
