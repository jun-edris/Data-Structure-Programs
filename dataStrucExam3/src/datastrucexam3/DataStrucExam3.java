/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastrucexam3;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Edris
 */
public class DataStrucExam3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        boolean yn = false;
    do
    {
        System.out.print("Enter a paragraph or phrase: ");
        String par = scan.nextLine();
        
        do
        {
        System.out.println("Choose: \n[A] Count number of letters\n[B] Count number of vowel letters\n[C] Count number of consonant letters\n[D] Count number of specific letter\n[E] Count number of words");
        String choose = scan.nextLine();
        
        
        if(choose.equalsIgnoreCase("A"))
        {
            String All = par.replaceAll("[^0-9|^\\w|( )+|^ +| +$]","").trim();
            String ALL1 = All.replaceAll("[0-9]", "");
            String ALL2 = ALL1.replaceAll(" ", "");
            //System.out.print("The paragraph has " + All.length());
            System.out.print(ALL2.length());
        }
        if(choose.equalsIgnoreCase("B"))
        {
            int vowels=0;
                for(int i = 0; i < par.length(); ++i)
                {
                    char ch = par.charAt(i);
                    if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                    {
                        ++vowels;
                    }
                }
                System.out.println("The vowel letter(s) is/are: "+vowels);
        }
        if(choose.equalsIgnoreCase("C"))
        {
            int consonant=0;
                for(int i = 0; i < par.length(); ++i)
                {
                    char ch = par.charAt(i);
                    if(ch == 'q' || ch == 'Q'|| ch == 'w' || ch == 'W'|| ch == 'r' || ch == 'R' || ch == 't' || ch == 'T'|| ch == 'y' || ch == 'Y'
                        || ch == 'p' || ch == 'P' || ch == 's' || ch == 'S'|| ch == 'd' || ch == 'D'|| ch == 'f' || ch == 'F'|| ch == 'g' || ch == 'G'
                        || ch == 'h' || ch == 'H'|| ch == 'j' || ch == 'J'|| ch == 'k' || ch == 'K'|| ch == 'l' || ch == 'L'|| ch == 'z' || ch == 'Z'
                        || ch == 'x' || ch == 'X'|| ch == 'c' || ch == 'C'|| ch == 'v' || ch == 'V'|| ch == 'b' || ch == 'B'|| ch == 'n' || ch == 'N'
                        || ch == 'm' || ch == 'M')
                    {
                        ++consonant;
                    }
                }
                System.out.println("The vowel letter(s) is/are: "+consonant);
        }
        if(choose.equalsIgnoreCase("D"))
        {
                System.out.println("Enter Character:");
                char ch=(char)System.in.read();
                int num=0;
                for(int i=0;i<par.length();i++)
                {
                    char c=par.charAt(i);
                    if(c==ch)
                    {
                        num++;
                    }
                }
            System.out.println("The number of specific charcters: "+num);
        }
        if(choose.equalsIgnoreCase("E"))
        {
            int wordCount = 0;
            boolean word = false;
            int endOfLine = par.length() - 1;
            for (int i = 0; i < par.length(); i++)
            {
        
                if (Character.isLetter(par.charAt(i)) && i != endOfLine)
                {
                    word = true;
                }    
                else if(!Character.isLetter(par.charAt(i)) && word)
                {
                    wordCount++;
                    word = false;
                } 
                else if(Character.isLetter(par.charAt(i)) && i == endOfLine)
                {
                    wordCount++;
                }
            }
        }
        System.out.println("\nDo it Again Y/N");
        String choice=scan.nextLine();
        if(choice.equalsIgnoreCase("Y"))
        {
         
        }
        else if(choice.equalsIgnoreCase("N"))
        {
            yn=true;
        }
    }
    while(!yn);   
    }
    while(yn);
    }
    
}
