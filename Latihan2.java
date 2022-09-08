/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] n = {2,1,4,1,7,6,4,1,6,0};
        int i= 1;
    while (i<=n.length) {
        int j = n.length;
    while (j>=i){
        System.out.print(" ");
        j--;
    }
    int k = 1;
    while (k<=i){
        System.out.print(n[k-1]+" ");
        k++;
    }
    System.out.println();
    i++;
    }
    }
}