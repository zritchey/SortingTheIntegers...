package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> arlst=new ArrayList<Integer>();
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        while (1 == 1) {


            System.out.println("Enter an integer: ");
            try {
                arlst.add(sc.nextInt());

            } catch (InputMismatchException i) {
                System.out.println("Try again.\n");
            }
            int i = 0;
            if (arlst.size()>i) {
                System.out.println("Would you like to sort the integers or add a new number: \n1. sort\n2. add");
                String s="";

                s=sc.nextLine().trim();
                if (s.contains("1")||s.toLowerCase().contains("sort")){
                    break;
                }
                i++;
            }
        }
        int []arr=new int [arlst.size()];
        System.arraycopy(arlst.toArray(),0,arr,arlst.size()-1,arlst.size());
        System.out.println(Arrays.toString(arr));
        bubbles(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubbles(int[]arr){
        for (int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

    }
}
