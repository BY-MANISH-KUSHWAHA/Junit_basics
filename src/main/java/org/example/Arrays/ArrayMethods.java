package org.example.Arrays;

public class ArrayMethods {
    public int findIndex(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {  if(arr[i]==num) return i;   }
        return -1;
    }

    public boolean isExist(int[] arr, int num){ return findIndex(arr,num)!=-1;  }

    public void printElementAt(int[] arr, int index){   System.out.println(arr[index]); }


}
