
package com.mycompany.bai_8;

import java.util.Scanner;

public class Bai_8 {

    public static void main(String[] args) {
        int number, n, sum=0;
        float avgNumber;
        
        System.out.print("Nhập số dãy số bạn muons tính trung bình cộng là bao nhiêu: ");
        Scanner banPhim = new Scanner(System.in);
        n = banPhim.nextInt();
        
        for(int count = 1; count <= n; count++){
            System.out.print("Nhập số thứ "+ count +" :");
            number = banPhim.nextInt();
            sum += number;
        } 
            avgNumber = sum / n;
           System.out.print("Trung bình cộng = "+ avgNumber);
    }
}
