package task;

public class AmFlagApp {
    public static void main(String[] args) {

        for (int i=0;i<15;i++){
            for (int j=0;j<6;j++){
                if (i<9){
                if (i>=2) {
                    if (i % 2 == 0) {
                        System.out.print("*  ");
                    } else {
                        if (j == 0) {
                            j += 1;
                        }
                        System.out.print(" * ");

                    }

                }
                }else{
                    break;

                }

            }


            for(int k=0;k<25;k++){

                if (i>=2) {
                    if (i <9) {
                        if (i % 2 == 0) {
                        for (;k<30;k++) {

                            System.out.print("=");
                        }} else if (i % 2==1) {
                            for (;k<30;k++) {
                                if(k==0) {
                                    System.out.print("   =");
                                }else {
                                    System.out.print("=");
                                }
                            }

                        }
                    }   else{
                        for (;k<48;k++){
                            System.out.print("=");
                        }
                    }
                }
            }
            System.out.println();

        }
        }
    }

