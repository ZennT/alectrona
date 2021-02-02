package com.cb;

import java.util.Scanner;

public class assignment_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // birinci cozum

        int age;
        do {
            System.out.println("How old are you?");
            age = scanner.nextInt();

//          if(13 > age && 0 < age) su sekilde yazim readibility yi dusuruyor. Tercih etmemeli
            if(0 < age && age < 13) {

                System.out.println("This movie contains violence and not appropriate for you.");
            }

            else if(13 <= age && age < 18) {
                System.out.println("This movie contains nudity and not appropriate for you.");
            }

            else if (18 <= age) {
                System.out.println("This movie is appropriate for you.");
            }
        } while(age > 0);


        // ikinci cozum

//        int age = 1; // while loop a girmesi icin age 0 dan buyuk herhangi bir deger olabilir
//
//        while(age > 0) {
//            System.out.println("How old are you?");
//            age = scanner.nextInt();
//
////            if(13 > age && 0 < age) {
//            if(0 < age && age < 13) {
//
//                System.out.println("This movie contains violence and not appropriate for you.");
//            }
//
//            else if(13 <= age && age < 18) {
//                System.out.println("This movie contains nudity and not appropriate for you.");
//            }
//
//            else if (18 <= age) {
//                System.out.println("This movie is appropriate for you.");
//            }
//        }


        }
}
