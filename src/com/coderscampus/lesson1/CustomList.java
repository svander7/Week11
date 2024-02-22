package com.coderscampus.lesson1;

public interface CustomList<T> {

	boolean add (T item);
	
	int getSize();
	
	T get(int index);
	

}
