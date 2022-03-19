/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastruc1;

/**
 *
 * @author Edris
 */
public class DataStruc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] numbers = {"1","3","5","2","4"};
        for(int x = 0;x < numbers.length;x++)
        {
           for(int y = 0; y < Integer.parseInt(numbers[x]); y++)
           {
               System.out.print(numbers[x]);   
           }
           System.out.println();
        }
    }
    
}
