/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/module-info.java to edit this template
 */

module ProgramaIEEE754 {
    requires javafx.swt;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.swing;
    requires javafx.web;
    
    opens Vista to javafx.fxml;
    //opens ufps.util.varios to javafx.graphics;

    // Exporta los paquetes para que otros módulos puedan usarlos
    exports Vista;
}
