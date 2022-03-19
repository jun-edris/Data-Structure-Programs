/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastruc3;

/**
 *
 * @author Edris
 */
public class DataStruc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int x = 0; x < 5; x++)
        {
            for(int y = 0; y<5-x;y++)
            {
                System.out.print(" ");
            }
            for(int z = 0; z < (2*x+1); z++)
            {
                System.out.print("*");
            }
            for(int a = 0; a < x/2+1;a++)
            {
                System.out.print("|");
            }
            System.out.println();
        }
    }
    
}
