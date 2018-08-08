package com.techpredators.functionalinterfaces;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierInterfaceTest {
	public static void main(String args[]) {

		Supplier<String> stringSupplier = () -> new String("I am String");
		System.out.println("String in stringSupplier is ::" + stringSupplier.get() + "::");

		// Constructor
		Supplier<String> stringEmpty = String::new;
		System.out.println("EmptyStr is::" + stringEmpty.get() + "::");

		// Custom method
		Supplier<Date> date = SupplierInterfaceTest::returnSystemDate;
		Date systemDate = date.get();
		System.out.println("systemDate::" + systemDate);
	}

	public static Date returnSystemDate() {
		return new Date();
	}
}
