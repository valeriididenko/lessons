package org.hillel.lessons.lesson3;

public class Arrays2 {

    public static void main(String[] args) {
        int[][] intArray2D = new int[3][3];
        String[][] stringArray2D = {{"A", "B", "C"}, {"D", "E", "F"}};

        // Access by index
        String letterC = stringArray2D[0][2];
        String letterE = stringArray2D[1][1];
        System.out.println("Letter " + letterC);
        System.out.println("Letter " + letterE);
        System.out.println();

        // Print all using for with index
        for (int row = 0; row < stringArray2D.length; row++) {
            for (int col = 0; col <stringArray2D[row].length; col++) {
                System.out.println("stringArray2D[" + row + "][" + col + "] = " + stringArray2D[row][col]);
            }
        }
        System.out.println();

        // Print all using forEach
        for (String[] firstLevelArray : stringArray2D) {
            for (String letter : firstLevelArray) {
                System.out.print(letter + " ");
            }
            System.out.println();
        }
    }

}