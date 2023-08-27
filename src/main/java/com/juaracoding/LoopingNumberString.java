package com.juaracoding;

public class LoopingNumberString {
        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                if (i % 5 == 0 && i%3 == 0) { //ketika nilainya bisa dimodulus dengan angka 5 dan 3
                    System.out.println("BIZZBUZZ");
                } else if (i % 5 == 0) { //ketika nilainya bisa dimodulus dengan angka 5
                    System.out.println("BUZZ");
                } else if (i % 3 == 0) { //ketika nilainya bisa dimodulus dengan angka 3
                    System.out.println("BIZZ");
                } else { //print sisa angka yang tidak bisa diubah
                    System.out.println(i);
                }
            }
        }
    }



