/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String args[]){
      // write a program which can calculate the primeter or area of a circle or a rectangle.
      Scanner in = new Scanner(System.in);
      int choice=0;
      // Loop until choice ==5
      do{
          //ask for 1-5 
          System.out.println("Pick from 1-5");
          choice = in.nextInt();
          //If 1
          if (choice==1){
              // ask for length, width, given perimeter
              System.out.println("Give me width");
              int width=in.nextInt();
              System.out.println("Give me length");
              int length=in.nextInt();
              int perimeter = length*2+width*2;
              System.out.println(perimeter);
          }
          else if (choice==2){
          //if 2
          System.out.println("Give me width");
            int width=in.nextInt();
            System.out.println("Give me length");
            int length=in.nextInt();
            int Area = width*length;
            System.out.println(Area);
              //ask for lenght, width, given area 
          } else if (choice==3){
          //if 3
          System.out.print
              // ask for radius, given the perimeter
          } 
          //if 4
              // ask radius, given the area 
          // if 5
             // quite 
      }while (choice!=5);
    }
    
}
