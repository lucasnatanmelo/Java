package services;

import java.util.List;

public class CalculationService {

	// This is a static method
	// List with generic type T
	// This list can be with any type
	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		} 

		// max starts in the first position
		T max = list.get(0);

		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
