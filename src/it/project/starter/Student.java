package it.project.starter;

import java.util.Random;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void guessingAge(){
        Random randomObject = new Random();
        int randomIntegerAge = randomObject.nextInt(35);

        System.out.println("I generated the random number " + randomIntegerAge + " for student " + this.name);

        if(randomIntegerAge == this.age)
            System.out.println("The random value is equal to the student's age");
        else if(randomIntegerAge > this.age)
            System.out.println("The random value is bigger then the student's age");
        else if(randomIntegerAge < this.age)
            System.out.println("The random value is lower then the student's age");
    }
}
