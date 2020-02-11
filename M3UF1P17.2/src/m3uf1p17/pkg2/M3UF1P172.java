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
        
        int euro;
        System.out.println("Euros?");
        euro=keyboard.nextInt();
        double preu = 100, tax = 21, res;
        res = FuncionLORA(preu, tax);
        methodLORA(preu, tax, res);
        float result = conversorLORA1(euro);
        double resultD = conversorLORA2(euro);
        String resultS = conversorLORA3(euro);
        System.out.println(result);

    }

    private static float conversorLORA1(int euro) {
        DecimalFormat df =new DecimalFormat("0.000");
        float result = 0;
        result =Float.valueOf(euro)/0.91f;
        return df.format(result);
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

    private static double FuncionLORA(double price, double iva) {
        double PVP = 0;
        PVP = price + price * (iva / 100);

        return PVP;

    }
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void methodLORA(double price, double iva, double res) {

        System.out.println(ANSI_GREEN + "Precio unitario " + price + "Pordentaje iva " + iva + "Precio final " + res);

    }
}


