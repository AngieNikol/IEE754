/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Nikol Ortiz y Daniela Garcia 1152348 - 1152365
 */
public class Ieee {

    String signo;
    String expBinary;
    String mantisa;

    public Ieee() {
    }

    public Ieee(String signo, String expBinary, String mantisa) {
        this.signo = signo;
        this.expBinary = expBinary;
        this.mantisa = mantisa;
    }

    public String getSigno() {
        return signo;
    }

    public String getExpBinary() {
        return expBinary;
    }

    public String getMantisa() {
        return mantisa;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public void setExpBinary(String expBinary) {
        this.expBinary = expBinary;
    }

    public void setMantisa(String mantisa) {
        this.mantisa = mantisa;
    }

    public String conversionIEEEde32Bits(double num) {
        if (num == 0.0) {
            return "00000000000000000000000000000000";
        }
        signo = (num < 0) ? "1" : "0";
        num = Math.abs(num);

        int iterador = 0;
        if (num >= 2) {
            while (num >= 2) {
                num /= 2;
                iterador++;
            }
        } else if (num < 1) {
            while (num < 1) {
                num *= 2;
                iterador--;
            }
        }
        int exponente = 127 + iterador;
        expBinary = String.format("%8s", Integer.toBinaryString(exponente)).replace(' ', '0');
        double mantisaDecimal = num - 1.0;
        StringBuilder mantisaBuilder = new StringBuilder();
        for (int i = 0; i < 23; i++) {
            mantisaDecimal *= 2;
            int bit = (int) mantisaDecimal;
            mantisaBuilder.append(bit);
            mantisaDecimal -= bit;
        }
        mantisa = mantisaBuilder.toString();
        return signo + expBinary + mantisa;
    }

    private String decimalAbinario(int numero) {
        String binario = "";
        int modulo;
        while (numero > 0) {
            modulo = numero % 2;
            binario = modulo + binario;
            numero /= 2;
        }
        return binario;
    }

    private String decimalAbinarioD(double numero) {
        int parteEntera = (int) numero;
        String binarioEntero = Integer.toBinaryString(parteEntera);
        double parteFraccionaria = numero - parteEntera;
        StringBuilder binarioFraccion = new StringBuilder(".");

        while (parteFraccionaria > 0) {
            parteFraccionaria *= 2;
            int bit = (int) parteFraccionaria;
            binarioFraccion.append(bit);
            parteFraccionaria -= bit;

        }
        return binarioEntero + (binarioFraccion.length() > 1 ? binarioFraccion.toString() : "");
    }

    public String conversionIEEEde64Bits(double num) {
        signo = (num < 0) ? "1" : "0";
        num = Math.abs(num);

        double temp = num;
        int iterador = 0;
        if (num >= 2) {
            while (num >= 2) {
                num /= 2;
                iterador++;
            }
        } else if (num < 1) {
            while (num < 1) {
                num *= 2;
                iterador--;
            }
        }

        int exponente = 1023 + iterador;
        expBinary = String.format("%8s", decimalAbinario(exponente)).replace(' ', '0');
        double mantisaDecimal = num - 1.0;
        StringBuilder mantisaBuilder = new StringBuilder();
        for (int i = 0; i < 52; i++) {
            mantisaDecimal *= 2;
            int bit = (int) mantisaDecimal;
            mantisaBuilder.append(bit);
            mantisaDecimal -= bit;
        }
        mantisa = mantisaBuilder.toString();
        return signo + expBinary + mantisa;

    }

    private int binarioAdecimal(long binario) {
        int decimal = 0;
        int potencia = 0;
        while (binario > 0) {
            long num = binario % 10;
            decimal += num * Math.pow(2, potencia);
            potencia++;
            binario /= 10;
        }
        return decimal;
    }

    public double conversionIEEEaDecimal(String num) {
        if (num.length() == 32 || num.length() == 64) {
            signo = num.substring(0, 1);
            expBinary = (num.length() == 32) ? num.substring(1, 9) : num.substring(1, 12);
            mantisa = (num.length() == 32) ? num.substring(9) : num.substring(12);
            int exponente = binarioAdecimal(Long.parseLong(expBinary)) - ((num.length() == 32) ? 127 : 1023);
            double mantisaDecimal = convertirMantisa(mantisa);
            double resultado = Math.pow(2, exponente) * mantisaDecimal;
            return signo.equals("1") ? -resultado : resultado;
        }
        return Double.NaN;
    }

    private double convertirMantisa(String mantisaBinaria) {
        double resultado = 1.0;
        for (int i = 0; i < mantisaBinaria.length(); i++) {
            if (mantisaBinaria.charAt(i) == '1') {
                resultado += Math.pow(2, -(i + 1));
            }
        }
        return resultado;
    }
}
