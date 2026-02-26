/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boiler;

/**
 *
 * @author Santiago
 */

public class Main {
    public static void main(String[] args) {

        ChocolateBoiler boiler = ChocolateBoiler.getInstance();

        boiler.fill();   
        boiler.boil();   
        boiler.drain();  

    }
}