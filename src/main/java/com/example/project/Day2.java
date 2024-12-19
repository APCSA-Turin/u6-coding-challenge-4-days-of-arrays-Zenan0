
package com.example.project;
import java.nio.file.SecureDirectoryStream;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String[][] niceOrNaughtyList = new String[2][names.length];
        Random numGenerator = new Random();
        for (int i = 0; i < names.length; i++) {
            int num = numGenerator.nextInt(2);
            niceOrNaughtyList[num][i] = names[i];
        }
        if (niceOrNaughtyList[0].equals(null)) {
            throw new IllegalArgumentException("Nice list should not be null");
        } else if (niceOrNaughtyList[1].equals(null)) {
            throw new IllegalArgumentException("Naughty list should not be null");
        }
        return niceOrNaughtyList; //you must return a two dimensional string array
    }

    public static void main(String[] args) {
        String[] strList = {"John", "Alex", "Lucy"};
        String[][] arr1 = Day2.nameSort(strList);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < strList.length; j++) {
                System.out.println(arr1[i][j]);
            }
        }
    }
}