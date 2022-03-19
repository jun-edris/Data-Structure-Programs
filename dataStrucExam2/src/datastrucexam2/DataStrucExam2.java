/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastrucexam2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Edris
 */
public class DataStrucExam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
        
        System.out.print("Enter a character: ");
        String st = reader.readLine();
        
        System.out.print("Choose pattern: \n(A) Square \n(B) Triangle \n(C) Diamond \n(D) Half Triangle A \n(E) Half Triangle B\n");
        char choose = (char) reader.read();
        
        
        if(choose == 'A' || choose == 'a')
        {
            for(int a = 0; a <= 3; a++)
            {
                for(int x = 0; x<= 5; x++)
                {
                    System.out.print(st);
                }
                System.out.println();
            }
        }
        if(choose == 'B' || choose == 'b')
        {
            int space = 5;  
    
            for (int x= space-1; x>= 0; x--)
            {
                for (int y=0; y< x ;y++)
                {
                    System.out.print(" ");
                }
                for (int z=x; z<=space-1; z++)
                {
                    System.out.print(st + " ");
                }
                System.out.println(""); 
            }
        }
        if(choose == 'C' || choose == 'c')
        {
            int space = 3;  
    
            for (int x= space-1; x>= 0; x--)
            {
                for (int y=0; y< x ;y++)
                {
                    System.out.print(" ");
                }
                for (int z=x; z<=space; z++)
                {
                    System.out.print(st + " ");
                }
                System.out.println("");
            }
            for (int x= 0; x<= space ; x++)
            {
                for (int y=0; y <x; y++)
                {
                    System.out.print(" ");
                }
                for (int z=x; z<=space; z++)
                { 
                    System.out.print(st + " "); 
                } 
                    System.out.println(""); 
            } 
        }
        if(choose == 'D' || choose == 'd')
        {
            for(int a = 0; a <= 5; a++)
            {
                for(int x = 0; x< a; x++)
                {
                    System.out.print(st);
                }
                System.out.println();
            }
        }
        if(choose == 'E' || choose == 'e')
        {
            for(int a = 0; a <= 4; a++)
            {
                for(int b = 5; b> a + 1;b--)
                {
                    System.out.print(" ");
                }
                for(int x = 0; x< a+1; x++)
                {
                    System.out.print(st);
                }
                System.out.println();
            }
        }
    }
    
}
