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
public class PencarianData {
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        String[] siswa = {"Deanne", "Victoria", "Erna", "Nathalie", "Pamela", "Armand", "Omar", "Alvaro", "Ben", "Danny"};
        System.out.print("Masukkan pencarian Anda: ");
        String  i = baca.next();
        String x ="";
        
        for(int k = 0; k < siswa.length; k++)
        {
            if(i.equals(siswa[k])){
                x = siswa[k];}
                
            }if (i.equals(x)){
                System.out.println("Data ditemukan: "+i);}
            else 
                System.out.println("Data tidak ditemukan");
                
            }
        }
   

