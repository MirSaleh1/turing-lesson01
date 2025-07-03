package task;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String add=input.nextLine();
        ad(add);

    }

    public static void ad(String b) {
       String [] a=new String[16];
       a[0]="Saleh";
       a[1]="Aqil";
       a[2]="Ayla";
       a[3]="Ebulfez";
       a[4]="Huseyin";
       a[5]="Emin";
       a[6]="Miri";
       a[7]="Orxan";
       a[8]="Ramzi";
       a[9]="Sevinc";
       a[10]="Sedulla";
       a[11]="Tural";
       a[12]="Ulvi";
       a[13]="Yusif";
       a[14]="Assasin Odysey";
       a[15]="Ays";


        Random rand = new Random();
        int randomNumber = rand.nextInt(16);
        for (String s : a) {
            if (s.equals(b)) {
                System.out.println(randomNumber);
            }
        }

    }
}
