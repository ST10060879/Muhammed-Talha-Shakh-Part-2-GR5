/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author st10060879
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      String name;
      String surName;
      String userName;
      String passWord;
      
        System.out.println("Enter your name");
            name = input.nextLine();
        System.out.println("Enter your surname");
            surName = input.nextLine();
        System.out.println("Enter your username");
            userName = input.nextLine();
        System.out.println("Enter your password");
            passWord = input.nextLine();
    }
    
}
