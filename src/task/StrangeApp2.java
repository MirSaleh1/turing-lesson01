package task;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StrangeApp2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String b= Integer.toString(a);
        char []chars = b.toCharArray();
        char [] g1=new char[chars.length];
        char [] g=new char[chars.length];
        boolean d=true;
        for (int i = 0; i < chars.length; i++) {
            if(i==0){
            for (int j = 0; j < chars.length; j++) {

                g1[j]=chars[j];
            }
                int z=0;
                for (int k = chars.length-1; k>=0; k--) {

                    g[z]=chars[k];
                   z++;
                }
            }if(d!=false){
            if (g[i]==g1[i]){
                d=true;
            }else  {
                d=false;
            }
        }


        }
        System.out.println(g1);
        System.out.println(g);
        System.out.println(d);

        System.out.println("###########################################");

        int property=input.nextInt();
        int revurse=0;
        int orginal=property;
        while(property!=0) {
            int price=property%10;


            if(property<0){

                break;
            }

            else {

                revurse=revurse*10+price;
                property=property/10;
            }

            }
        if (revurse==orginal) {
            System.out.println("this number is a polinom");
        }else  {
            System.out.println("this number is not a polinom");
        }


        }






    }


