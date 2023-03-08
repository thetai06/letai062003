package com.mycompany.bai_4;

import java.util.Scanner;

public class BAI_4 {

    public static void main(String[] args) {
        int thang;
        Scanner banPhim = new Scanner(System.in);
//Cách 1:
        do{
        System.out.print("Nhập Tháng Bạn Muốn Xem:");
        thang = banPhim.nextInt();
            System.out.println("Tháng ban muốn xem là:Tháng "+ thang);
        }while(thang <1 || thang >12);
        
//Cách 2:       
        switch (thang) {
            case 1:
                System.out.println("Tháng 1");
                break;
            case 2:
                System.out.println("Tháng 2");
                break;
            case 3:
                System.out.println("Tháng 3");
                break;
            case 4:
                System.out.println("Tháng 4");
                break;
            case 5:
                System.out.println("Tháng 5");
                break;
            case 6:
                System.out.println("Tháng 6");
                break;
            case 7:
                System.out.println("Tháng 7");
                break;
            case 8:
                System.out.println("Tháng 8");
                break;
            case 9:
                System.out.println("Tháng 9");
                break;
            case 10:
                System.out.println("Tháng 10");
                break;
            case 11:
                System.out.println("Tháng 11");
                break;
            case 12:
                System.out.println("Tháng 12");
                break;    
        }
    }
}
