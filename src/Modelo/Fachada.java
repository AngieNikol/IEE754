/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Nikol Ortiz y Daniela Garcia 1152348 - 1152365
 */
public class Fachada {

    private Ieee objeto;

    public Fachada() {
        this.objeto = new Ieee();
    }

    public String convertirDecimalAIeee32(double numero) {
        return objeto.conversionIEEEde32Bits(numero);
    }

    public String convertirDecimalAIeee64(double numero) {
        return objeto.conversionIEEEde64Bits(numero);
    }

    public String obtenerSigno() {
        return objeto.getSigno();
    }

    public String obtenerExponente() {
        return objeto.getExpBinary();
    }

    public String obtenerMantisa() {
        return objeto.getMantisa();
    }

    public double convertirIEEEaDecimal(String numero) {
        return objeto.conversionIEEEaDecimal(numero);
    }

}
