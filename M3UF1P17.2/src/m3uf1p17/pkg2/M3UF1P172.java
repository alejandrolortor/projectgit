/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3uf1p17.pkg2;

import com.sun.webkit.dom.KeyboardEventImpl;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author alejandrolortor
 */
public class M3UF1P172 {
static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        DecimalFormat df =new DecimalFormat("0.000");
        String str = "";
        int euro = 0;

 
        String key;
        int option = -1;
        keyboard.useDelimiter("\n");
        do {

            userMenu();
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    conversorLORA1(euro);
                    System.out.println("Euros?");
                    euro=keyboard.nextInt();
                    float resultF = conversorLORA1(euro);
                    System.out.println (df.format(resultF));
                    
                    break;
                case 2:
                   conversorLORA2(euro);
                    System.out.println("Euros?");
                    euro=keyboard.nextInt();
                    double resultD = conversorLORA2(euro);
                    System.out.println (df.format(resultD));
                    break;
                case 3:
                   conversorLORA3(euro);
                   System.out.println("Euros?");
                   euro=keyboard.nextInt();
                   String resultS = conversorLORA3(euro);
                   System.out.println (resultS);
                    break;

                case 8:
                    conversorLORA8(str);
                    System.out.println("palabra");
                    str=keyboard.next();
                    String strResult =conversorLORA8(str);
                    System.out.println(strResult+" ");
                    break;
                default:
                    System.out.println("This option is not valid");
            }
            System.out.println("press any key to continue");
            key = keyboard.next();
        } while (option != 0);
    }
    
        private static void userMenu() {
        System.out.println("Option1: ():");
        System.out.println("Option2: ():");
        System.out.println("Option3: ():");
        System.out.println("Option4: ():");
        System.out.println("Option5: ():");
        System.out.println("Option6: ():");
        System.out.println("Option7: ():");
        System.out.println("Option8: ():");
        System.out.println("Option9: ():");
        System.out.println("Option0: (exit):");
        System.out.print("\n\n choose your option: ");

    }

    private static float conversorLORA1(int euro) {
        float result = 0;
        result =Float.valueOf(euro)/0.91f;
        return (result);
    }
    private static double conversorLORA2(int euro) {
        double result = 0;
        result =Double.valueOf(euro)/0.91;
        return result;
    }
    
    private static String conversorLORA3(int euro) {
        String result = "0";
        result =String.valueOf(euro/0.91);
        return result;
    }
    
   
    private static String conversorLORA8(String str) {
        String result="";
        char ch=' ';
        for(int i=0; i<str.length();i++){
        ch=str.charAt(i);
        result+=Integer.toBinaryString(ch);
        }
        return result;
    }
        
    
    
}



