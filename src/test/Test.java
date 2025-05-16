/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Test to edit this template
 */
package test;

import domain.AdvArrays;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Ladik
 */
public class Test {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = AdvArrays.createMatrix(rows, cols);
        System.out.println("\nOriginal matrix:");
        Arrays.stream(matrix).forEach(row -> System.out.println(Arrays.toString(row)));

        int[][] transposed = AdvArrays.transpose(matrix);
        System.out.println("\nTransposed matrix:");
        Arrays.stream(transposed).forEach(row -> System.out.println(Arrays.toString(row)));
    }
}




