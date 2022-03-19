/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastruc5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Edris
 */
public class DataStruc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        boolean choice = false;
    do
    {
        System.out.print("Enter number of values: ");
        int num = Integer.parseInt(scan.nextLine());
        
        int arr[] = new int[num];
        for(int x = 0; x <num; x++)
        {
            System.out.print("Enter number " + (x + 1) + ": ");
            arr[x] = Integer.parseInt(scan.nextLine());
        }
        do
        {
        System.out.println("Choose:\n[A] Smallest\n[B] Largest\n[C] 2nd Smallest\n[D] 2nd Largest\n[E] Sum\n[F] Average\n");
        String choose = scan.nextLine();
        
        if(("A".equals(choose)) || ("a".equals(choose)))
        {
            int smallest = Integer.MAX_VALUE;
            
            for(int i = 0; i <arr.length;i++)
            {
                if(arr[i] < smallest)
                {
                    smallest = arr[i];
                }
            }
            System.out.println("The smallest value is " + smallest);
            
        }
        if(("B".equals(choose)) || ("b".equals(choose)))
        {
            int largest = Integer.MIN_VALUE;
            
            for(int i = 0; i <arr.length;i++)
            {
                if(arr[i] > largest)
                {
                    largest = arr[i];
                }
            }
            System.out.println("The largest value is " + largest);
            
        }
        if(("C".equals(choose)) || ("c".equals(choose)))
        {
            int small = Integer.MAX_VALUE;
            int smallest = Integer.MAX_VALUE;
            
            for(int i = 0; i < num; i++)
            {
                if(arr[i ]< smallest)
                {
                    smallest = small;
                    small = arr[i];
                }
                if(arr[i] > smallest && arr[i] < small)
                {
                    smallest = arr[i];
                }
            }
            System.out.println("The 2nd smallest value is " + small);
            
        }
        if(("D".equals(choose)) || ("d".equals(choose)))
        {
            int large = Integer.MIN_VALUE;
            int largest = Integer.MIN_VALUE;
            
            for(int i = 0; i < num; i++)
            {
                if(arr[i] > large)
                {
                    largest = large;
                    large = arr[i];
                }
                if(arr[i] < large && arr[i] > largest)
                {
                    
                    largest = arr[i];
                }
            }
            System.out.println("The 2nd largest value is " + large);
            
        }
        if(("E".equals(choose)) || ("e".equals(choose)))
        {
            int sum = 0;
            for(int i = 0; i <arr.length;i++)
            {
                sum = sum + arr[i];
            }
            System.out.print("The sum is " + sum);
        }
        if(("F".equals(choose)) || ("f".equals(choose)))
        {
            int sum = 0;
            int avg = 0;
            for(int i = 0; i <arr.length;i++)
            {
                sum = sum + arr[i];
                
            }
            avg = sum/arr.length;
            System.out.println("The average is " + avg);
        }
        System.out.print("Choose another option: [Y/N]");
        String option = scan.nextLine();
        
        if(option.equalsIgnoreCase("Y"))
        {
            
        }
        else if(option.equalsIgnoreCase("N"))
        {
            choice = true;
        }
        else
        {
            System.out.print("Invalid!!!");
        }
        
        }
        while(!choice);
    }
    while(choice);
    }
}
