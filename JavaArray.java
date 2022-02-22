package com.Nathan;
import java.util.Random;

public class JavaArray {

    public static void main(String[] args) {
        //create integer array for student grades
        int[] grades = new int[10];

        // Initialize the array with random
        for (int i = 0; i < grades.length; i++) {
            grades[i] = (int) (Math.random() * 101);
        }
        // print the array
        System.out.println("Students grades are: ");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ,");
        }
        //print out array using average, max, min and reversed array
        System.out.println();
        System.out.println("The average = " + getAverage(grades));
        System.out.println("The Max = " + getMax(grades));
        System.out.println("The Min = " + getMin(grades));
        int[] reversedArray = reverseArray(grades);
        System.out.println("The array is reverse is: ");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ,");
        }
        //print out shuffled array after the previous methods print
            arrayShuffle(grades);
        System.out.println(" ");
            System.out.print("The Shuffled array is: ");
        System.out.println(" ");
            for (int i = 0; i < grades.length; i++) {
                System.out.print(grades[i] + " ,");

            }
        }
        // New method to find the average grade in the array
        public static int getAverage ( int[] grades){
            int sum = 0;
            for (int i = 0; i < grades.length; i++) {
                sum += grades[i];
            }
            return sum / grades.length;
        }
        // New method that finds the highest "max" element in the array
        public static int getMax ( int[] grades){
            int max = grades[0];
            for (int i = 1; i < grades.length; i++) {
                if (grades[i] > max)
                    max = grades[i];
            }
            return max;
        }
        //New method that finds the lowest "min" element in the array
        public static int getMin ( int[] grades){
            int min = grades[0];
            for (int i = 1; i < grades.length; i++) {
                if (grades[i] < min)
                    min = grades[i];
            }
            return min;
        }

        // New method to reverse the elements in original array
        public static int[] reverseArray ( int[] reverseGrades){
            int[] arrayTemp = new int[reverseGrades.length];
            for (int i = 0; i < reverseGrades.length; i++) {
                arrayTemp[i] = reverseGrades[reverseGrades.length - (i + 1)];

            }
            return arrayTemp;
        }

        //New method to shuffle the elements of the array
        public static void arrayShuffle ( int[] shuffledGrades){
            for (int i = 0; i < shuffledGrades.length; i++) {
                // generate a random index in the array to loop for shuffling
                int randIndex = (int) (Math.random() * 10);
                int temp = shuffledGrades[0];
                shuffledGrades[i] = shuffledGrades[randIndex];
                shuffledGrades[randIndex] = temp;
                // this method doesn't ask for a return value
            }
        }
    }
