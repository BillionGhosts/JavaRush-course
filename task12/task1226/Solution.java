package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public interface Fly {
        void fly();
    }
    public interface Run {
        void run();
    }
    public interface Climb {
        void climb();
    }



    public static void main(String[] args) {

    }

    public class Cat implements Run, Climb {
        public void run() {int a=0;}
        public void climb() {int a = 0;}
    }

    public class Dog implements Run {
        public void run() {int a ;}
    }

    public class Tiger extends Cat {
    }

    public class Duck implements Fly, Run {
        public void fly() {int a;}
        public void run() {int a;}
    }
}
