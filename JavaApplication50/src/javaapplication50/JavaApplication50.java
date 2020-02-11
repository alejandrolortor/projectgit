/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

import java.util.Scanner;

public class JavaApplication50 {
//autor Alejandro
static Scanner keyboard= new Scanner (System.in);
    public static void main(String[] args) {
        int dni;
        System.out.println("Tell me your number of ID: ");
        dni = keyboard.nextInt();
        char letter = DNIletter(dni);
        System.out.println(dni + ":" + letter);
    }
    private static char DNIletter(int dni){
        char letter='z';
        String letters=" ";
        int res=dni%23;
        letter=letters.charAt(res);
        return letter;
    }
}
