import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
       double d= (a+b+c)/3;
        System.out.println("Task:1");
        System.out.println("#####################################");
        System.out.println(d);
        if(a>40 && b>40 && c>40){
            if(d>85 && a>85 && b>85 && c>85){
                System.out.println("Təbriklər! Siz Mükəmməllik Sertifikatı qazandınız");
            } else if(d>=70 && d<85 && a>60 && b>60 && c>60){
                System.out.println("Əhsən! Siz Nailiyyət Sertifikatı qazandınız.");

            }else if(d>=50 && d<70){
                System.out.println("Siz keçdiniz");

        }
            else{
                System.out.println("Kəsildiniz.");
            }
        }
        else{
            System.out.println("Kəsildiniz - Bir və ya bir neçə imtahan balı çox aşağıdır.");
        }
        System.out.println("Task:2");
        System.out.println("#####################################");
        int f=scanner.nextInt();
        switch (f){
            case 1:
                System.out.println("Şokolad - $2.00");break;
            case 2:
                System.out.println("Soda - $1.50");break;
            case 3:
                System.out.println("Çips - $1.20");break;
            case 4:
                System.out.println("Sendviç - $3.00");break;
            case 5:
                System.out.println("Su - $1.00");break;
            default:
                System.out.println("Yanlış seçim. Zəhmət olmasa 1 ilə 5 arasında bir nömrə daxil edin.");break;
        }
        System.out.println("Task:3");
        System.out.println("#####################################");
        int u=scanner.nextInt();
        for(;u<11;u++){
            for(int i=0;i<11;i++){
                int l=u*i;
                System.out.println(u+" x "+i+" = "+l);
            }

        }


        }
    }
