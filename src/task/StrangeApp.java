package task;

import java.util.Random;
import java.util.Scanner;

public class StrangeApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String b= Integer.toString(a);
        boolean c=true;
        char []chars = b.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.print(" ---- ");
        for (int i = chars.length-1; i >=0; i--) {

            System.out.print(chars[i]);
            if (chars[i]=='-') {
                c=false;
            }

        }
        System.out.println();
        System.out.println(c);
    }
}
