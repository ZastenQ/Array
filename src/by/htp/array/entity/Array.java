package by.htp.array.entity;

public class Array {
	private int[] items;
	private static final int INITIAL_ARRAY_SIZE = 0;

	protected Array() {
		this.items = new int[INITIAL_ARRAY_SIZE];
	}

	protected Array(int arraySize) {
		this.items = new int[arraySize];
	}

	protected int[] getArray() {
		return items;
	}
}
