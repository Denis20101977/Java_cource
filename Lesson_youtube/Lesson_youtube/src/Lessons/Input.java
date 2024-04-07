package Lessons;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //String s  = new String("Hello");
        Scanner s = new Scanner(System.in);
        System.out.println("Введите какое нибудь число");
        //String string = s.nextLine();
        int x = s.nextInt();
        System.out.println("Вы ввели " + x);


    }
}
