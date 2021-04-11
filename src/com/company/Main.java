package com.company;

public class Main {

    public static void main(String[] args) {
        int month = 3;

        if (month == 12 | month >= 1 & month <= 2) {
            System.out.println("Зима");
        } else if (month >= 3 & month <= 5) {
            System.out.println("Весна");
        } else if (month >= 6 & month <= 8) {
            System.out.println("Лето");
        } else if (month >= 9 & month <= 11) {
            System.out.println("Осень");
        }

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[][] squareArray = new int[2][3];
        squareArray[0][0] = 1;
        squareArray[0][1] = 2;
        squareArray[0][2] = 3;
        squareArray[1][0] = 4;
        squareArray[1][1] = 5;
        squareArray[1][2] = 6;

        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] +"["+i+"]"+"["+j+"]"+ " ");
            }
            System.out.println();
        }
    }
}


