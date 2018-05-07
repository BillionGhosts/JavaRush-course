package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readFile = new BufferedReader(new InputStreamReader(new FileInputStream(read.readLine())));
        read.close();
        ArrayList<Integer> b = new ArrayList<>();

        int a;
        try {while (readFile.ready()) {
            a = Integer.parseInt(readFile.readLine());

            if (a%2==0) {
                b.add(a);
            }
        } }
        catch (IndexOutOfBoundsException e ) {
            System.out.println("OutOf Bounds");
        }
        Collections.sort(b);
        for (Integer s : b)
        System.out.println(s);
        readFile.close();
    }
}
