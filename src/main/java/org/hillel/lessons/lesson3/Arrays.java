package org.hillel.lessons.lesson3;

import java.util.Random;

public class Arrays {

    public static void main(String[] args) {
        String s = "lol ok an kek o";
        String[] words = s.split(" ");
        int[] lengthArray = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean contains = false;
            int wordLength = word.length();
            for (int length : lengthArray) {
                if (length == wordLength) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                lengthArray[i] = wordLength;
            }
        }

        for (int i : lengthArray) {
            System.out.println(i);
        }

//
//        int maxLength = 0;
//        for (int length : lengthArray) {
//            if (length != 0) {
//                if (length > maxLength) {
//                    maxLength = length;
//                }
//
//                int counter = 0;
//                for (String word : words) {
//                    if (word.length() == length) {
//                        counter++;
//                    }
//                }
//                System.out.println("We have " + counter + " strings of length " + length);
//            }
//        }
//
//        if (maxLength > 0) {
//            for (int length : lengthArray) {
//                if (length == maxLength) {
//                    System.out.print("The longest words are: ");
//                    for (String word : words) {
//                        if (word.length() == length) {
//                            System.out.print(word + " ");
//                        }
//                    }
//                }
//            }
//        }



//        Random random = new Random();
//        int max = 0;
//        int min = 100;
//        for (int i = 0; i < 10; i++) {
//            int rowMax = random.nextInt(100);
//            int rowMin = random.nextInt(5);
//            if (rowMax > max) {
//                max = rowMax;
//            }
//            if (rowMin < min) {
//                min = rowMin;
//            }
//            System.out.println("Row[" + i + "]: max=" + rowMax + "    min=" + rowMin);
//        }
//        System.out.println();
//        System.out.println("Array max: " + max);
//        System.out.println("Array min: " + min);
    }

}