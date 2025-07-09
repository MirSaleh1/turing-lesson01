package task;

import java.util.Arrays;
import java.util.Scanner;

public class CanculatApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        int[] yeni = hesab(b);
        System.out.println(Arrays.toString(yeni));
        System.out.println("###############################");
        coxluheasb(b);

    }public static int[] hesab(int b) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == b) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }




  public static void coxluheasb(int a) {
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int k = 0; k < b.length; k++) {
            for (int j = 0; j < b[k]; j++) {

                if (a == b[k] + b[j]) {
                    if (k != j) {
                        System.out.println(k + "," + j);
                    }
                }
                for (int i = 0; i > b[k]; i++) {
                    if (a == b[k] + b[i]) {
                        if (k != i) {
                            System.out.println(k + "," + i);
                        }
                    }

                }
            }
        }
    }

}