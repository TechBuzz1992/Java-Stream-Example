package com.javastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7);
		
		List<Integer> squareList = intList.stream().map(x -> x*x).collect(Collectors.toList());
		
		System.out.println(squareList);
		
		intList.stream().map(x -> x*x).forEach(y -> System.out.println(y));
		
		List<Integer> evenList = intList.stream().filter(x -> x%2==0).collect(Collectors.toList());
		
		System.out.println(evenList);
		
		intList.stream().filter(x -> x%2==0).map(y -> y*y).forEach(z-> System.out.println(z));
		
		int evenNumber  = intList.stream().filter(x->x%2==0).map(y->y*y).reduce(0, (ans,i) -> ans+i);
		
		System.out.println(evenNumber);

	}

}
