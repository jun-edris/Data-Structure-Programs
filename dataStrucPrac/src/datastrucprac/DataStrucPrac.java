/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastrucprac;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Edris
 */
public class DataStrucPrac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        
        System.out.print("Enter number of products: ");
        int num_prod = Integer.parseInt(scan.nextLine());
        
        String[] prod = new String[num_prod];
        boolean id_error = false;
        
        for(int a = 0;a < prod.length;)
        {
            System.out.print((a+1) + " Enter number: ");
            String id_num = scan.nextLine();
            
            for (int b = 0;b < prod.length || id_error == true;b++)
            {
                if (prod[b] != null)
                {
                    if (prod[b].equals(id_num)) 
                    {
                        System.out.println("Duplicated!!");
                        break;
                    }
                }
                if(prod[b] == null)
                {
                    prod[a] = id_num;
                    a++;
                    break;
                }
                else
                {
                    id_error = true;
                }
            }
        }
    }
    
}
/*  do
            {
                System.out.print("Enter product id: ");
                String id_num = scan.nextLine();
                
                if(prod[a][0] == null)
                {           //  0  < 2
                    for(int b = 0;b < (a+1);b+=a)
                    {
                        if(prod[b][0] == null)
                        {
                             prod[a][0] = id_num;
                             break;
                        }
                        else
                        {
                            if(prod[b][0].equals(id_num)) // 0 false
                            {
                                id_error = true;
                            }
                            else
                            {
                                prod[b][0] = id_num;
                                id_error = false;
                            }
                        }
                    }
                }
            }
            while(id_error == true);

            for(int b = 0;b < 1;b++)
                {
                    System.out.print("Enter product id: ");
                    String id_num = scan.nextLine();
                    if(prod[b][0] == null)
                    {
                        prod[a][0] = id_num;
                        break;
                    }
                    else
                    {
                        if(prod[b][0].equals(id_num)) // 0 false
                        {
                            id_error = true;
                        }
                        else
                        {
                            prod[a][0] = id_num;
                            id_error = false;
                        }
                    }
                }

                for(int a = 0; a < prod.length; a++)
        {
            System.out.println("Product # " + (a+1));
            do
            {
                System.out.print("Enter number: ");
                String id_num = scan.nextLine();
                
                for(int b = 0;b < prod.length;b++)
                {
                    if(prod[b] != null)
                    {
                        if(prod[b].equals(id_num))
                        {
                            System.out.println ("Duplicated!!");
                            id_error = true;
                        }
                    }
                }
            }
            while(id_error == true);
        }

        while(counter <= num_prod)
        {
            id_error = false;
            
            System.out.print(counter +" Enter number: ");
            String id_num = scan.nextLine();
            for(int a = 0;a <= counter - 2;a++)
            {
                if(id_num == prod[a])
                {
                    id_error = true;
                    break;
                }
            }
            if(id_error == true)
            {
                System.out.println("Number duplicated!!");
            }
            else
            {
                prod[counter - 1] = id_num;
                counter++;
            }
        }
        System.out.println(Arrays.toString(prod));
*/