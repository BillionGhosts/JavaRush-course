package com.javarush.task.task14.task1417;

/**
 * Created by Мой on 03.04.2018.
 */
public class USD extends Money{
    public USD (double a) {
        super(a);
    }
    public String getCurrencyName () {
        return "USD";
    }
}
