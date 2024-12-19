package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        if (name.equals(null) || name.equals("")) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        Random num = new Random();
        int nums = num.nextInt(5);
        return elf_names[nums] + " " + name;  
    }
}