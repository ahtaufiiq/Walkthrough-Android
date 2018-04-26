package com.ataufiq;

import java.util.Scanner;

public class SortArray {

    int n,temp;
    public SortArray() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i=0; i<n; i++)
        {
            a[i]=s.nextInt();
        }
        for (int i =0; i<n; i++)
        {
            for (int j=i+1; j<n; j++)
            {
                if (a[i]>a[j])  // compare numbers
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("Elements in Ascending Order:");
        for (int i=0; i<n-1; i++)
        {
            System.out.print(a[i]+ ", "); // print in same line and separate with comma
        }
        System.out.print(a[n-1]);
    }
}
