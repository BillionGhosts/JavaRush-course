package com.javarush.task.task15.task1522;

/**
 * Created by Мой on 06.04.2018.
 */
public class Earth implements Planet {
    private static Earth instance;
    private Earth() {}

    public static Earth getInstance() {
        if (instance==null) {
            return instance = new Earth();
        } else
            return instance;
    }
}
