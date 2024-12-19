package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        for (int i = 0; i < size; i++) {
          for (int j = 0; j < size; j++) {
            if (size / 2 == j || i == size / 2 || i == j || i + j == size - 1)  {
              grid[i][j] = "*";
            } else {
              grid[i][j] = " ";
            }
            
          }
        }
        // for (int i = 0; i < size; i++) {
        //   if (i == size / 2) {
        //     for (int j = 0; j < size; j++) {
        //       grid[i][j] = "*";
        //     }
        //   } else {
        //     grid[i][0] = "*";
        //     grid[i][size / 2] = "*";
        //     grid[i][size - i - 1] = "*";
        //   }
        // }
        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
        
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
      int size = 7;
      String[][] snowflake = generateSnowflake(size);
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          System.out.print(snowflake[i][j]);
        }
        System.out.println();
      }
    }
}
