package task01;

import java.util.Scanner;

public class RomanNuberApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();

        Translate tr = new Translate(number);
        int count=   tr.getNumber();
        System.out.println(count);


    }
}
