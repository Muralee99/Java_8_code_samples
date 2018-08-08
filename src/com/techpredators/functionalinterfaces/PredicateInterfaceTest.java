package com.techpredators.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateInterfaceTest {
	public static void main(String[] args)
	 {
	     Predicate<Integer> lesserthan = i -> (i < 18); 

	     System.out.println(lesserthan.test(10)); 
	 }
}
