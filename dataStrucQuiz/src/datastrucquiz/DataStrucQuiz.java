/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastrucquiz;

import java.util.Scanner;

/**
 *
 * @author Edris
 */
public class DataStrucQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean choose = true;
        boolean repeatID = false;
        
        //String id = "";
        //String category = "";
        
        do
        {
            System.out.println("PLEASE FOR \n\t[a] Inventory \t\t[b] Ordering");
            String choosed = scan.nextLine();
            
            if(choosed.equalsIgnoreCase("a"))
            {
                System.out.print("Enter number of products: ");
                String num = scan.nextLine();
                int Num = Integer.parseInt(num);
                String[][] product_mobile = new String[Num][5];
                
                for(int a = 0;a < Num; a++)
                {
                    System.out.println("Product # " + (a+1));
                    do
                    {
                        System.out.println("Enter product ID: ");
                        String prodID = scan.nextLine();    
                        for(int b = 0;b < Num; b++)
                        {
                            if(prodID == null)
                            {
                                if(product_mobile[a][0].equals(product_mobile[a][0]))
                                {
                                    repeatID = true;
                                }
                            }
                        }  
                        
                        if(repeatID == true)
                        {
                            System.out.println("The ID is repeated!!");
                        }
                        else
                        {
                            product_mobile[a][0] = prodID;
                            System.out.print("Enter product name: ");
                            product_mobile[a][1] = scan.nextLine();
                            System.out.println("What kind of category? \n Mobile \t Laptop \t Accessories");
                            String cat;
                            
                            do
                            {
                                System.out.print("Category: ");
                                String category = scan.nextLine();
                                cat = category.toLowerCase();
                            }
                            while(!"mobile".equals(cat) && !"laptop".equals(cat) && !"accessories".equals(cat));
                        
                            System.out.print("Enter product quantity: ");
                            product_mobile[a][3] = scan.nextLine();
                            System.out.print("Enter product price: ");
                            product_mobile[a][4] = scan.nextLine();
                        }
                    }
                    while(!repeatID);     
                }
            }
            
        }
        while(!choose);
    }
}
/*                      do
                        {
                            System.out.print("Enter product ID: ");
                            product_mobile[a][0] = scan.nextLine();
                        }
                        while(product_mobile[a][0].contains(product_mobile[a][b]) && product_mobile[a][0].length() !=6);

                        for(int b = 0;b < 1; b++)
                    {
                        do
                        {
                            System.out.print("Enter product ID: ");
                            product_mobile[a][0] = scan.nextLine();
                        }
                        while(product_mobile[a][0].contains(product_mobile[a][b]) && product_mobile[a][0].length() !=6);
                    } 
                        
String id = scan.nextLine();
                        product[a][0] = id;
                           
                        if(id.equals(product[a][0]))
                        {
                            repeatID = true;
                        }
do
                        {
                            System.out.print("Enter product ID: ");
                            product_mobile[a][0] = scan.nextLine();
                        }
                        while(product_mobile[a][0].equals(product_mobile[a][0]) && product_mobile[a][0].length() !=6);
                        
*/
