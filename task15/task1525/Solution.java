package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {


    public static List<String> lines = new ArrayList<String>();

    static {
        try (BufferedReader read = new BufferedReader(new FileReader(Statics.FILE_NAME))) {
            while (read.ready()) {
                lines.add(read.readLine());
            }

        } catch (IOException e) {}


    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
