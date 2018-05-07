package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String key =null;
        Movie movie;
        while (true) {
            key = read.readLine();
            movie = MovieFactory.getMovie(key);

            if (key.equals("soapOpera") ||
                key.equals("thriller") ||
                key.equals("cartoon")) {
                System.out.println(movie.getClass().getSimpleName());
                continue;}
            break;
        }
        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else
            //напишите тут ваш код, пункты 5,6
            if ("thriller".equals(key)){
                movie = new Thriller();
            } else
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else return movie;

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }
    static class Thriller extends Movie {

    }
    static class Cartoon extends Movie {}
    //Напишите тут ваши классы, пункт 3
}
