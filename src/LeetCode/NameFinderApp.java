package LeetCode;

import java.util.Arrays;

public class NameFinderApp {
    public static void main(String[] args) {

        String [] arr={"Yusif","Elcan","Samir","Akif","Vusal"};
        Arrays.sort(arr);
        System.out.println(findName(arr,"Akif")) ;
        System.out.println(findNameWithRec(arr,"Vusal",0,arr.length-1)) ;

    }
    public static String findName(String[] arr,String name){

        int left=0,right=arr.length-1;


        while(left<=right){

            int mid=(left+right)/2;

            if(arr[mid].equals(name)){

                return arr[mid];
            }
            else if(arr[mid].compareTo(name)<0){
                left=mid+1;


            } else if (arr[mid].compareTo(name)>0) {
                right=mid-1;

            }

        }
        System.out.println("Not found");
        return null;
    }




    public static String findNameWithRec(String[] arr,String name,int left,int right){



        if(left<=right){

            int mid=(left+right)/2;

            if(arr[mid].equals(name)){

                return arr[mid];

            }
            else if(arr[mid].compareTo(name)<0){

                left=mid+1;

              return findNameWithRec(arr,name,left,right);
            }
            else if(arr[mid].compareTo(name)>0){

                right=mid-1;

               return findNameWithRec(arr,name,left,right);
            }
            System.out.println("Not found");

        }

        return null;
    }

}
