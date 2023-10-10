package org.example;

import java.util.List;

public class CarRepository {
	private final List<Car> cars;

	public CarRepository(List<Car> cars) {
		this.cars = cars;
	}

	public List<Car> getCars() {
		return cars;
	}

	public Car getCarById(String id) {
		return cars.stream()
				.filter(car -> car.id().equals(id))
				.findFirst()
				.orElseThrow(() -> new CarNotFoundException());
	}

	public void addCar(Car car) {
		cars.add(car);
	}
}
