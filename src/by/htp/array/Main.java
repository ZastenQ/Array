package by.htp.array;

import by.htp.array.entity.Operation;

public class Main {

	public static void main(String[] args) {

		Operation operations = new Operation();
		operations.addInt(5);
		operations.addInt(-9);
		operations.addInt(23);
		operations.addInt(-2);
		operations.addInt(12);
		operations.addInt(345);
		operations.addInt(-57);
		operations.addInt(0);

		operations.sortArrayAsc();
		operations.sortArrayDesc();
		operations.getMax();
		operations.getMin();

		operations.addFromConsole();
	}
}
