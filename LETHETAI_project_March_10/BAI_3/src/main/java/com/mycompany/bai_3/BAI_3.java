
package com.mycompany.bai_3;

import java.util.Scanner;

public class BAI_3 {

    public static void main(String[] args) {
        String name;
        int yob;
        
        Scanner banPhim = new Scanner(System.in);
        
        System.out.print("Tên của bạn là: ");
        name = banPhim.nextLine();
        System.out.print("Bạn sinh năm: ");
        yob = banPhim.nextInt();
        
        if((2023 - yob) < 16){
            System.out.println("Bạn "+ name +" ở độ tuổi thành viên.");   
        }
        else if((2023 - yob) >= 16 && (2023 - yob) < 18){
            System.out.println("Bạn "+ name + " ở độ tuổi trưởng thành.");
        }
        else
            System.out.println("Bạn "+ name +" đã già.");
   
    }
}
