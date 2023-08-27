package com.juaracoding;

public class LoopingPattern {
    public static void main(String[] args) {
        int angka = 9;
        for (int i = 1; i <= angka; i++){
            for (int j = i; j <= angka; j++){
                if (j%2==0){
                    System.out.print("_");
                }else {
                    System.out.print(j);
                }
            }
            angka --;
            System.out.println();
        }
    }
}

