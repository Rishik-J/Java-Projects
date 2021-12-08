package com.company;

// Importing the necessary libraries
import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Information {

    // declaring necessary variables, all attributes are private and non-static

    private int exam1 = 0;
    private int exam2 = 0;
    private int exam3 = 0;
    private int exam4 = 0;
    private double averageZyBooks = 0.0;
    private double averageLabs = 0.0;
    private double averageProjects = 0.0;
    private double examAverage = 0.0;
    private double labsWeight;
    private double zybooksWeight;
    private double projectsWeight;
    private double examsWeight;
    private double totalWeight;
    private double finalScore;




    // Method to set exam scores. Takes in 4 integers as parameter as assigns it to the 4 exam variables using the "this" function.
    public void setExamScores(int exam1, int exam2, int exam3, int exam4) {
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.exam3 = exam3;
        this.exam4 = exam4;
    }

    // Method to set average ZyBooks scores. Takes in 1 double as parameter as assigns it to the averageZybooks variable using the "this" function.
    public void setAverageZyBooks(double averageZyBooks) {
        this.averageZyBooks = averageZyBooks;
    }

    // Method to set average project scores. Takes in 1 double as parameter as assigns it to the averageProject variable using the "this" function.
    public void setAverageProject(double averageProjects) {
        this.averageProjects = averageProjects;
    }

    // Method to set average labs scores. Takes in 1 double as parameter as assigns it to the averageLabs variable using the "this" function.
    public void setAverageLabs(double averageLabs) {
        this.averageLabs = averageLabs;
    }

    // Method used to output the averageZybooks score to the terminal
    public double getAverageZyBooks() {
        System.out.println(averageZyBooks);
        return averageZyBooks;
    }

    // Method used to output the averageProjects score to the terminal
    public double getAverageProjects() {
        System.out.println(averageProjects);
        return averageProjects;
    }

    // Method used to output the averagelabs score to the terminal
    public double getAverageLabs() {
        System.out.println(averageLabs);
        return averageLabs;
    }
    
    
    // Asks user for the weights, have to be inputted in a specific order,
    // Weights are inputted as integers, they are later converted to their % values
    // Method to set the weights for each component of the final grade. takes in 4 double parameters.
    // If the 4 inputs do not add up to 100, -1 is outputted to the terminal
    public void weighting(double labsWeight, double zybooksWeight, double projectsWeight, double examsWeight) {


        Scanner snn = new Scanner(System.in);
        this.labsWeight = labsWeight;
        this.zybooksWeight = zybooksWeight;
        this.projectsWeight = projectsWeight;
        this.examsWeight = examsWeight;
        totalWeight = labsWeight + zybooksWeight + projectsWeight + examsWeight;
        int counter = 1;

        
            if (totalWeight != 100) {
                System.out.println(-1);
        
            
      }

    }

  

  //Computing average score for exams
    // asks user what exams are to be dropped
    // Uses switch case statements to get the average of all the exams that have not been drooped
    // Switch statements  take in a string value
    // when inputting what exams have to be dropped they have to be separated by a comma and a space
    // example "1, 2" drops exams 1 and 2
    public double getExamAverage() {
        System.out.println("What exams would you like to drop? enter each number sepperated by a comm and a space");
        Scanner sn = new Scanner(System.in);
        switch (sn.nextLine()) {
            case "0":
                examAverage = (exam1 + exam2 + exam3 + exam4) / 4;
                break;
            case "1":
                examAverage = (exam2 + exam3 + exam4) / 3;
                break;
            case "2":
                examAverage = (exam1 + exam3 + exam4) / 3;
                break;
            case "3":
                examAverage = (exam1 + exam2 + exam4) / 3;
                break;
            case "4":
                examAverage = (exam1 + exam2 + exam3) / 3;
                break;
            case "1, 2":
                examAverage = (exam3 + exam4) / 2;
                break;
            case "1, 3":
                examAverage = (exam2 + exam4) / 2;
                break;
            case "1, 4":
                examAverage = (exam2 + exam3) / 2;
                break;
            case "2, 3":
                examAverage = (exam1 + exam4) / 2;
                break;
            case "2, 4":
                examAverage = (exam1 + exam3) / 2;
                break;
            case "3, 4":
                examAverage = (exam1 + exam2) / 2;
                break;
            case "1, 2, 3":
                examAverage = exam4;
                break;
            case "1, 2, 4":
                examAverage = exam3;
            case "2, 3, 4":
                examAverage = exam1;
            case "1, 3, 4":
                examAverage = exam2;
        }
        return examAverage;
    }
   
   
    // Takes the exam average which has been previously calculated along with the labs, projects, zyBooks average
    // Takes the weights (which have been inputted as integers) and divides them by 100 to get the % value
    // multiples the weights with the respective component
    // adds up the total

    public void computningFinalScore() {
            labsWeight /= 100;
            zybooksWeight /= 100;
            projectsWeight /= 100;
            examsWeight /= 100;
        
         finalScore = ((labsWeight * averageLabs) + (zybooksWeight * averageZyBooks) + (projectsWeight * averageProjects) + (examsWeight * examAverage));
         System.out.println("Final score is: "+ finalScore);
    }
    
    // uses If-Else statements to categorize the final score and output the correct letter grade
    public void returningGrade() {
        if (finalScore < 60.0 || examAverage < 50.0) {
            System.out.println("F");
        } else if (finalScore >= 60 && finalScore < 70) {
            System.out.println("D");

        } else if (finalScore >= 70 && finalScore < 80) {
            System.out.println("C");
        } else if (finalScore >= 80 && finalScore < 90) {
            System.out.println("B");
        } else if (finalScore >= 90) {
            System.out.println("A");
        }

    }

}


