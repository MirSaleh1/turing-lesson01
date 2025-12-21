package LeetCode;

import java.util.Arrays;

public class mergeSort {


    public static void main(String[] args) {

        int[] arr={13,5,41,36,57,89};
        mergeSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }







    public static void mergeSort(int[] arr ,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);

           mergeSortAlqoritm(arr,left,right,mid);
        }

    }
    public static void mergeSortAlqoritm(int[] arr,int left,int right,int mid){
        int leftHight= mid-left+1;
        int rightHight= right-mid;
        int []leftArr=new int[leftHight];
        int []rightArr=new int[rightHight];

        for(int i=0;i<leftHight;i++){
            leftArr[i]=arr[left+i];
        }
        for(int i=0;i< rightHight ;i++){
            rightArr[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=left;

        while(i<leftHight&&j<rightHight){
            if(leftArr[i]<=rightArr[j]){
                arr[k++]=leftArr[i++];

            }
            else{
                arr[k++]=rightArr[j++];

            }

        }
        while(i<leftHight){
            arr[k++]=leftArr[i++];

        }
        while(j<rightHight){
            arr[k++]=rightArr[j++];

        }

    }
}
