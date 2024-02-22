package com.coderscampus.lesson1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	// Test - Driven Development Methodology
	// Step 1 - Write a failing test
	// Step 2 - Write the business logic to make the test past
	// Step 3 - Refactor your code (rinse and repeat)
	
	@Test
	void should_add_one_item_to_list() {
		
		// Use the three A's (Arrange, Act, Assert)
		
		// Arrange
		CustomList<Integer> customList = new CustomArrayList<>();
		
		//Act
		customList.add(10);
		Integer expectedResult = customList.get(0);
		Integer expectedSize = customList.getSize();
		
		// Assert
		// What do we expect to happen?
		// I expect the Integer 10 to be in my list
		assertEquals(10, expectedResult);
		assertEquals(1, expectedSize);
		
	}

}
