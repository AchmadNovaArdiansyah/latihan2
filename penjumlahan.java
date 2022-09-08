/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author USER
 */
public class penjumlahan {
  public static void main(String args[]){
      int[] array = {2,1,4,1,7,6,4,1,6,0};
      int jum = 0;
      //Advanced for loop
      for( int num : array) {
          jum = jum+num;
      }
      System.out.println("Jumlah Nilai Dalam Array adalah :"+jum);
   }
}    