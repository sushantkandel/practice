package com.exception;

public class MultipleCatchAndAirthmaticException {
    public static void main(String args[]){
       try {
           int a[] = new int[5];
           a[5] = 100 / 0;
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("ArrayIndexOutOfBoundException Occur");
       }
       catch (ArithmeticException e){
           System.out.println("AirthmaticException occur");
       }
       catch (Exception e){
           System.out.println("Parent exception occur");
       }

System.out.println("Rest of the code occur");


    }
}
