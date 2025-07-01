package task;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int secim;
        int mebleg;
        String [] username={"Ali","veli","pirveli"};
        double []  salary={100.0,150.0,80.0};
        boolean qiut= true;

        while(true) {
            menuGoster();

            secim=sc.nextInt();
            switch (secim) {
                case 1:
                    double balans1 = balans(username, salary);
                    System.out.println("Your balans are : "+balans1);
                    break;
                    case 2:double balans2 = balans11(salary,username);
                    System.out.println("teze balansiniz : "+balans2);
                    break;
                    case 3:balans2 = balans12(salary,username);
                        System.out.println("teze balansiniz : "+balans2);
                        break;
                    case 4: String ad=ad(username);
                        System.out.println("teze adiniz : "+ad);
                        break;
                    case 5:  qiut=false;
                    break;

                    }
            if(qiut!=true) {
                System.out.println("menudan cixildi");
                break;
            }

        }


    }

    public static void menuGoster(){
        System.out.println("Menu");
        System.out.println("1.balans");
        System.out.println("2.pul yatir");
        System.out.println("3.pul cixar");
        System.out.println("4.adi deyis");
        System.out.println("5.cixis");
    }

    public static double balans(String[] a,double[] b){
        Scanner sc=new Scanner(System.in);
        System.out.println("adinizi daxil edin");

       String ad= sc.nextLine();
       for(int i=0;i<a.length;i++) {
           if (a[i].equals(ad)) {
                       return b[i];
                   }


               }
        System.out.println("adiniz sehvdi");


            return -1;
           }
           public static  double balans11( double[] b, String[] c){
            Scanner sc=new Scanner(System.in);
            String ad;

               double balans1=balans(c,b);

            if(balans1!=0&&balans1>0){
                System.out.println("ne qeder daxil etmek isteyirsiniz");
                int d = sc.nextInt();

               if(d>0) {

                   balans1 = balans1 + d;
                   return balans1;
               }else {
                   System.out.println("pul daxil edilmedi");
               }
                }



              return -1;


               }

    public static  double balans12( double[] b, String[] c){
        Scanner sc=new Scanner(System.in);
        String ad;

        double balans1=balans(c,b);

        if(balans1!=0&&balans1>0){
            System.out.println("ne qeder goturmek isteyirsiniz");
            int d = sc.nextInt();

            if(d>0&&d<balans1) {

                balans1 = balans1 - d;
                return balans1;
            }else {
                System.out.println("pul goture bilmediniz");
            }
        }



        return -1;


    }
    public static String ad(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("adinizi daxil edin");
        String adi=sc.nextLine();

        for(int i=0;i<a.length;i++) {
            if (a[i].equals(adi)) {
                System.out.println("yeni ad daxil edin");
                String deyis=sc.nextLine();
                if(deyis!="") {
                    a[i] = deyis;
                    return deyis;
                }else {
                    System.out.println("daxil etdiyiniz ad duz deyil");
                }

            }
            else{
                System.out.println("daxil etdiyiniz ad duz deyil");
                break;
            }
        }
        return null;
    }
        }











