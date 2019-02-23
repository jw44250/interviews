package com.google.interview;

// You are standing in the parking lot and there are cars are parked.
// Each car has unique ID for example E, T Etc,
// Using 0 which is empty spat and the output should look at this  A Q E T C W 0 
// Input is char[] cars = { 'E', 'A', 'C', 'Q', '0', 'W', 'T' };
public class Test {

	public static void main(String[] args) {

		// Input 
		char[] cars = { 'E', 'A', 'C', 'Q', '0', 'W', 'T' };
		char[] parkedCars = parkedCars(cars);
		
		// output  A Q E T C W 0 
		for (int i = 0; i < parkedCars.length; i++) {
			
			System.out.print(parkedCars[i] + " ");
		}
	}

	private static char[] parkedCars(char [] cars) {

		if(null == cars || cars.length ==0) {
			return null;
		}

		int len = cars.length - 1;

		char[] updated = new char[cars.length];

		int count = 0;

		int carPosition = 0;

		for (int i = 0; i < cars.length; i++) {

			char movedCar = 0;

			updated[i] = cars[i];

			if (cars[i] == '0') {

				if (count == 0) {

					movedCar = cars[i];
					cars[i] = cars[len];
					carPosition = i;

					cars[len] = movedCar;

					count++;
				} else {

					while (count == carPosition) {

					}

					char currentCar = cars[carPosition];
					movedCar = cars[carPosition - 2];

					cars[carPosition] = movedCar;

					cars[carPosition - 2] = currentCar;

					currentCar = cars[carPosition - 2];
					movedCar = cars[carPosition - 1];

					cars[carPosition - 1] = currentCar;
					cars[carPosition - 2] = movedCar;

					currentCar = cars[carPosition - 2];

					currentCar = cars[carPosition - 4];

					movedCar = cars[carPosition - 2];

					cars[carPosition - 2] = currentCar;

					cars[carPosition - 4] = movedCar;

					movedCar = cars[0];

					currentCar = cars[carPosition - 3];

					cars[0] = currentCar;

					cars[carPosition - 3] = movedCar;
				}
			}

		}

	
		return cars;
	}
}
