/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Ieee;

/**
 *
 * @author N
 */
public class Test {

    public static void main(String[] args) {
        Ieee ieee = new Ieee();

        System.out.println("----------TEST DECIMAL A IEEE 754 DE 32 BITS ---------------");
        System.out.println("Test Numero Grande positivo: " + ieee.conversionIEEEde32Bits(56.89));
        System.out.println("Test Numero Grande positivo: " + ieee.conversionIEEEde32Bits(2.0));
        System.out.println("Test Numero Grande positivo: " + ieee.conversionIEEEde32Bits(16.5));
        System.out.println("Test Numero Grande Negativo: " + ieee.conversionIEEEde32Bits(-23.7));
        System.out.println("Test Ceros: " + ieee.conversionIEEEde32Bits(0.0));
        System.out.println("Test Numero Pequeño positivo: " + ieee.conversionIEEEde32Bits(0.654));
        System.out.println("Test Numero Pequeño negativo: " + ieee.conversionIEEEde32Bits(-0.897));
        
        System.out.println("----------TEST DECIMAL A IEEE 754 DE 64 BITS ---------------");
        System.out.println("Test Numero Grande positivo: " + ieee.conversionIEEEde64Bits(56.89));
        System.out.println("Test Numero Grande positivo: " + ieee.conversionIEEEde64Bits(16.5));
        System.out.println("Test Numero Grande Negativo: " + ieee.conversionIEEEde64Bits(-23.7));
        //System.out.println("Test Ceros: " + ieee.conversionIEEEde64Bits(0.0));
        System.out.println("Test Numero Pequeño positivo: " + ieee.conversionIEEEde64Bits(0.654));
        System.out.println("Test Numero Pequeño negativo: " + ieee.conversionIEEEde64Bits(-0.897));
        
        
        System.out.println("----------TEST IEEE 754 A DECIMAL   ---------------");
        System.out.println("Test Numero IEEE 32 bits: " + ieee.conversionIEEEaDecimal("01000010011000111000111101011100"));
        System.out.println("Test Numero IEEE 32 bits: " + ieee.conversionIEEEaDecimal("01000001100001000000000000000000"));
        System.out.println("Test Numero IEEE 32 bits: " + ieee.conversionIEEEaDecimal("11000001101111011001100110011001"));
        //System.out.println("Test Ceros: " + ieee.conversionIEEEde64Bits(0.0));
        System.out.println("Test Numero IEEE 64 bits: " + ieee.conversionIEEEaDecimal("011111111100100111011011001000101101000011100101011000000100001"));
        System.out.println("Test Numero IEEE 64 bits: " + ieee.conversionIEEEaDecimal("0100000001001100011100011110101110000101000111101011100001010010"));
        
        
        System.out.println("----------SIGNO, EXPONENTE Y MANTISA   ---------------");
        System.out.println("Test Numero Grande positivo: " + ieee.conversionIEEEde32Bits(56.89));
        System.out.println("Signo: " + ieee.getSigno());
        System.out.println("Exponente: " + ieee.getExpBinary());
        System.out.println("Mantisa: " + ieee.getMantisa());
        System.out.println("Test Numero IEEE 32 bits: " + ieee.conversionIEEEaDecimal("01000001100001000000000000000000"));
        System.out.println("Signo: " + ieee.getSigno());
        System.out.println("Exponente: " + ieee.getExpBinary());
        System.out.println("Mantisa: " + ieee.getMantisa());
        
    }
}
