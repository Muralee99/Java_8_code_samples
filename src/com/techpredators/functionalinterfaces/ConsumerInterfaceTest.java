package com.techpredators.functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerInterfaceTest {
 
    public static void main(String[] args) 
    {
    	//Referring method to the string type of Consumer Interface.
	    Consumer<String> consumer = ConsumerInterfaceTest::printStrings;
	    //com.techpredators.functionalinterfaces.ConsumerInterfaceTest$$Lambda$1/1599771323@1517365b
	    //No Explicit return value.
		consumer.accept("Java");
		consumer.accept("Dot Net");
		consumer.accept("Scala");
    } 
 
    private static void printStrings(String languageName) {
        System.out.println(languageName);
    }
}