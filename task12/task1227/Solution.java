package com.javarush.task.task12.task1227;

/* 
Fly, Run, Swim для классов Duck, Penguin, Toad
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }

    public class Duck implements Fly, Run, Swim {

        public void fly() {int a;}
        public void run() {int a;}
        public void swim() {int a;}
    }

    public class Penguin implements Run, Swim {
        public void run() {int a;}
        public void swim() {int a;}
    }

    public class Toad implements Swim {
        public void swim() {int a;}
    }
}
