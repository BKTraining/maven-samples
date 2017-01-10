package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

 /**
   * This is a greeting method
   * @param someone is the name of the person
   */
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
