package org.example;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		/*Math math = new Math();
		try {
			math.division(5, 0);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}*/

		CarRepository carRepository = new CarRepository(new ArrayList<>());
		System.out.println(carRepository.getCarById("1"));
	}
}