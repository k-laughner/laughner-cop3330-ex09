/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;
import java.lang.Math;

class Main {
  public class constant{
    public static final int conv = 350;
  }
  public static void main(String[] args) {
    System.out.println("What is the length of the room?");
    Scanner input = new Scanner(System.in);    
    int length = input.nextInt();

    System.out.println("What is the width of the room?");
    Scanner input2 = new Scanner(System.in);
    int width = input2.nextInt();

    double area = length*width;
    double gallons = Math.ceil(area/constant.conv);

    System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", gallons, area);
  }
}
