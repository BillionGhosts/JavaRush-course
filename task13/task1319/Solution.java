package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter write = new BufferedWriter(new FileWriter(read.readLine()));
        while (true) {
            String a = read.readLine();
            if (a.equals("exit")) {
                write.write(a+"\n"); break;
            } else
            write.write(a+"\n");
        }
        read.close();
        write.close();
    }
}
