package com.java8Collection.streamExample;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example4UsingJava7 {
    public static void main(String args[]) {

        List<Student> list1 = Arrays.asList(
                new Student(1, "Sushant kandel", "9845736616", 40),
                new Student(5, "Kamal Aryal", "984554547", 29),
                new Student(3, "Avishek Roy", "984578512", 28),
                new Student(6, "Soumya Poudel", "98457853", 26),
                new Student(10, "Hari Prashad", "9875462154", 36));
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
    }
}
