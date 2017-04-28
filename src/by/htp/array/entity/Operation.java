package by.htp.array.entity;

import java.util.Scanner;

public class Operation {
	private Array array;

	public Operation() {
		this.array = new Array();
	}

	public Array getArray() {
		return array;
	}

	public void setArray(Array newArray) {
		this.array = newArray;
	}

	// adding new integers
	public void addInt(int newInt) {
		Array tempArray = new Array(this.array.getArray().length + 1);
		for (int i = 0; i < this.array.getArray().length; i++) {
			tempArray.getArray()[i] = this.array.getArray()[i];
		}
		tempArray.getArray()[this.array.getArray().length] = newInt;
		this.setArray(tempArray);
	}

	// Ascending sorting
	public void sortArrayAsc() {
		Array sortedArray = new Array(this.array.getArray().length);
		for (int i = 0; i < sortedArray.getArray().length; i++) {
			sortedArray.getArray()[i] = this.array.getArray()[i];
		}
		int temp;
		for (int i = 0; i < sortedArray.getArray().length - 1; i++) {
			for (int j = i + 1; j < sortedArray.getArray().length; j++) {
				if (sortedArray.getArray()[i] > sortedArray.getArray()[j]) {
					temp = sortedArray.getArray()[i];
					sortedArray.getArray()[i] = sortedArray.getArray()[j];
					sortedArray.getArray()[j] = temp;
				}
			}
		}
		this.setArray(sortedArray);
	}

	// Descending sorting
	public void sortArrayDesc() {
		Array sortedArray = new Array(this.array.getArray().length);
		for (int i = 0; i < sortedArray.getArray().length; i++) {
			sortedArray.getArray()[i] = this.array.getArray()[i];
		}
		int temp;
		for (int i = 0; i < sortedArray.getArray().length - 1; i++) {
			for (int j = i + 1; j < sortedArray.getArray().length; j++) {
				if (sortedArray.getArray()[i] < sortedArray.getArray()[j]) {
					temp = sortedArray.getArray()[j];
					sortedArray.getArray()[j] = sortedArray.getArray()[i];
					sortedArray.getArray()[i] = temp;
				}
			}
		}
		this.setArray(sortedArray);
	}

	// calculate maximum number in array
	public int getMax() {
		int max = this.array.getArray()[0];
		for (int i = 1; i < this.array.getArray().length; i++) {
			if (this.array.getArray()[i] > max)
				max = this.array.getArray()[i];
		}
		return max;
	}

	// calculate minimum number in array
	public int getMin() {
		int min = this.array.getArray()[0];
		for (int i = 1; i < this.array.getArray().length; i++) {
			if (this.array.getArray()[i] < min)
				min = this.array.getArray()[i];
		}
		return min;
	}

	// adding integer number from console with validation
	public void addFromConsole() {
		Scanner input = new Scanner(System.in);
		boolean run = true;
		do {
			System.out.println("Type an integer number");
			while (!input.hasNextInt()) {
				System.out.println("It's not an integer number!");
				input.next();
			}
			this.addInt(input.nextInt());
			run = false;
		} while (run);
		input.close();
	}
}