package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Imports the Scanner Class to take in user inputs
        Scanner sn = new Scanner(System.in);


        System.out.println("What dimension do you want your matrix to be? (enter one value since it is a square matrix)");

        //Takes in user input and creates a square matrix/2dArray of that size
        int dimension = sn.nextInt();
        int [][] inputMatrix = new int[dimension][dimension];



        //Loops through the row length and column length to take in user inputs to create the square matrix
        for (int i = 0; i < dimension; i++){
            for (int j =0; j < dimension; j++){
                System.out.println("Whats the next number?");
                inputMatrix[i][j] = sn.nextInt();
            }
        }




        //Can also manually create a matrix to use instead of inputting each number individually

        //int [][] InputMatrix = {{}};

        //Creates a new object of the operations class called isCompleteOrder, with the input matrix passed as a parameter
        Operations isCompleteOrder = new Operations(inputMatrix);

        //Prints out false if the input matrix is not a complete order and true if the matrix is a complete order
        System.out.println(isCompleteOrder.isCompleteOrder(inputMatrix));
    }
}





