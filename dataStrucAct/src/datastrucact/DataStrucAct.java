/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastrucact;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Edris
 */
public class DataStrucAct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean error = false;
        System.out.print("Input number of students: ");
        String num = scan.nextLine();
        int many = Integer.parseInt(num);
        String[][] bsit = new String[many][7];
        
        for(int x = 0; x < many; x++)
        {
            System.out.println("Student # " + (x+1));
            for(int y = 0; y < 1; y++)
            {
                System.out.print("Enter first name: ");
                bsit[x][0] = scan.nextLine();
                System.out.print("Enter middle name: ");
                bsit[x][1] = scan.nextLine();
                System.out.print("Enter last name: ");
                bsit[x][2] = scan.nextLine(); 
                System.out.println("PLEASE INPUT BSCS or BSIT ONLY!!!");
                do
                {
                    System.out.print("Course: ");
                    bsit[x][3] = scan.nextLine();
                }
                while(!"BSIT".equals(bsit[x][3]) && !"bsit".equals(bsit[x][3]) && !"BSCS".equals(bsit[x][3]) && !"bscs".equals(bsit[x][3]));
                
                System.out.print("Enter midterm grade: ");
                bsit[x][4] = scan.nextLine();
                System.out.print("Enter final grade: ");
                bsit[x][5] = scan.nextLine();    
            }
        }
        System.out.println("BSIT \nName\t\t\t\tMIDTERM\t\t\tFINAL\t\t\tFINAL RATING");
        for(int a = 0; a < many; a++)
        {
            System.out.println();
            if(bsit[a][3].equalsIgnoreCase("BSIT"))
            {
                System.out.print(bsit[a][0] + " " + bsit[a][1].charAt(0) + ". " + bsit[a][2] + "\t\t\t " + bsit[a][4] + "\t\t\t " + bsit[a][5] + "\t\t\t " + ((Float.parseFloat(bsit[a][4])+Float.parseFloat(bsit[a][5]))/2));
            }
        }
        System.out.println("BSCS \nName\t\t\t\tMIDTERM\t\t\tFINAL\t\t\tFINAL RATING");
        for(int b = 0; b < many; b++)
        {
            System.out.println();
            if(bsit[b][3].equalsIgnoreCase("BSCS"))
            {
                System.out.print(bsit[b][0] + " " + bsit[b][1].charAt(0) + ". " + bsit[b][2] + "\t\t\t " + bsit[b][4] + "\t\t\t " + bsit[b][5] + "\t\t\t " + ((Float.parseFloat(bsit[b][4])+Float.parseFloat(bsit[b][5]))/2));
            }
        }
    }
    
}
/*          System.out.print("Enter first name: ");
            bsit[num][1] = scan.nextLine();
            System.out.print("Enter middle name: ");
            bsit[num][2] = scan.nextLine();
            System.out.print("Enter last name: ");
            bsit[num][3] = scan.nextLine();
            System.out.print("Course: ");
                bsit[x][3] = scan.nextLine();
            
                if(bsit[x][3].equalsIgnoreCase("BSIT") || bsit[x][3].equalsIgnoreCase("BSCS"))
                {
                    System.out.print("Enter midterm grade: ");
                    bsit[x][4] = scan.nextLine();
                    System.out.print("Enter final grade: ");
                    bsit[x][5] = scan.nextLine();
                }
                else
                {
                    System.out.print("Just BSIT and BSCS please!!");
                }
            }
            while(error == true);
*/