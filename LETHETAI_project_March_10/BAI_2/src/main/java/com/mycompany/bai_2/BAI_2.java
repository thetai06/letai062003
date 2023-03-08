
package com.mycompany.bai_2;

import java.awt.SystemColor;
import java.util.Scanner;

public class BAI_2 {

    public static void main(String[] args) {
        int number;
        
        System.out.print("Nhâp số nguyên: ");
        Scanner banPhim = new Scanner(System.in);
        number = banPhim.nextInt();
        
        if((number%2)==0){
            System.out.println("Là số chẵn");
        }
        else{
            System.out.println("Là sô lẻ");   
        }
    }
}
