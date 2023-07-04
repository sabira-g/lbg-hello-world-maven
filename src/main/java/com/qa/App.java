package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("Sabs"));
        System.out.println(sayHelloToSomeone("Andrew"));
        System.out.println(sayHelloToSomeone("Rob"));
        System.out.println(sayHelloToSomeone("Mandeep"));
        System.out.println(sayHelloToSomeone("James"));
        System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Goodbye World!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
