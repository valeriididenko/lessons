package org.hillel.lessons.lesson3;

import java.util.Random;

public class Stack {

    public static void main(String[] args) {
        Random random = new Random();
        int humanAge = 10;

        boolean isCat = random.nextBoolean();
        if (isCat) {
            String catName = "Barsik";
            int catFactor = 4;
            int catAge = calculatePetAge(humanAge, catFactor);
            System.out.println(catName + " age is " + catAge + " years");
        } else {
            String dogName = "Rex";
            int dogFactor = 5;
            int dogAge = calculatePetAge(humanAge, dogFactor);
            System.out.println(dogName + " age is " + dogAge + " years");
        }

        System.out.println("Thanks!");
    }

    public static int calculatePetAge(int humanAge, int factor) {
        int result;
        if (humanAge < 1) {
            result = 0;
        } else if (humanAge == 1) {
            result = 15;
        } else if (humanAge == 2) {
            result = 24;
        } else {
            result = 24 + (humanAge - 2) * factor;
        }
        return result;
    }

}