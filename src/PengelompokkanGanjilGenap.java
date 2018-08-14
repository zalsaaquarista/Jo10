/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class PengelompokkanGanjilGenap {
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        int angka[] = new int[6];
        String c;
        
        for(int k = 0; k < angka.length; k++)
        {
            System.out.print("Masukkan bilangan ke-" + (k + 1) + " :");
            angka[k] = baca.nextInt();
           
        }
        System.out.println("Bilangan genap: ");
        for(int x = 0; x < angka.length; x++){
            if(angka[x] % 2 == 0) {
                System.out.println(angka[x] + " ");
              
            }
        }
        System.out.print("Bilangan ganjil: ");
        for(int y = 0; y < angka.length; y++){
            if(angka[y] % 2 == 1) {
                System.out.print(angka[y] + " ");
                
            }
        }
        
  
        
        
                
    }
}
