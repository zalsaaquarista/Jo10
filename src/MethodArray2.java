


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import static java.lang.Float.max;
import java.util.Scanner;
public class MethodArray2 {
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        double[] angka = new double[5];
        double total = 0;
        double max;
        
        for(int y = 0; y < 5; y++)
        {
        System.out.print("Masukkan bilangan ke-" + (y+1) + " :");
        angka[y] = baca.nextDouble();
        }
    
    for(int i = 0; i < angka.length; i++)
    {
        total += angka[i];   
    }
      System.out.println("Rata-rata: " + (total/angka.length));
      
      max = angka[0];
    for(int i = 1; i < 5; i++)
    {
        if(angka[i] > max)
        {max = angka[i];}
        System.out.print("Nilai terbesar: " + max);
    }
    
    
    }
}
