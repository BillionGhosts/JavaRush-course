package com.javarush.task.task13.task1318;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String a = read.readLine();
        read.close();
        FileInputStream b = new FileInputStream(a);
        BufferedReader line = new BufferedReader(new InputStreamReader(b, StandardCharsets.UTF_8));
        String bb;
        try { while ((bb = line.readLine())!=null) {
            System.out.println(bb);
        } } catch (IOException e) {System.out.println("Проебалась строка");}



        b.close();
        read.close();



    }
}