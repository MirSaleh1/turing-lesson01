import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {

        int ab=5;

       String str="Azerbaycan";
       char a= str.charAt(0);
       String str2=str.substring(1);
       String str1=str.substring(1,3);
       boolean str3=str.contains("Aze");
    String str4= str.replace("Azerbaycan","Turkiye");
    int str5=str.indexOf("ay");
    int str6=str.lastIndexOf("n");
        System.out.println(str+" "+str5+" "+str6+" "+str4+"  "+str3+" "+str2+" "+str1);
        }
    }
