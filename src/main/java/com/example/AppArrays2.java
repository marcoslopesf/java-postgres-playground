package com.example;

import java.util.Arrays;

public class AppArrays2 {
    public static void main(String[] args) {
        
        int vetor [] = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 100 * (i+1);
            
        }
        System.out.println(Arrays.toString(vetor));
        System.out.println();

        int matriz2 [][] = new int[3][4];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
             matriz2 [i][j] = (i* matriz2[i].length + j+1) * 10;
             System.out.print(matriz2[i][j]+ " ");

            }    
            System.out.println();
        }

    }
    
}
