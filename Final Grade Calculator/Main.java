package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

           Information student1 = new Information();
           Scanner sn = new Scanner(System.in);
           System.out.println("what are the exam scores in order?");
           student1.setExamScores(sn.nextInt(), sn.nextInt(), sn.nextInt(), sn.nextInt());
           student1.getExamAverage();
           System.out.println("what is the average project grade");
           student1.setAverageProject(sn.nextDouble());
           System.out.println("What is the average zybooks");
           student1.setAverageZyBooks(sn.nextDouble());
           System.out.println("what are the average labs");
           student1.setAverageLabs(sn.nextDouble());
           System.out.println("What are the weights for labs zybooks prjects and exams in that specific order");
           student1.weighting(sn.nextDouble(), sn.nextDouble(), sn.nextDouble(), sn.nextDouble());
           student1.computningFinalScore();
           student1.returningGrade();

    }

}