/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boiler;

/**
 *
 * @author Santiago
 */

public class ChocolateBoiler {


    private static ChocolateBoiler instance;

   
    private boolean empty;
    private boolean heaterOn;

  
    private ChocolateBoiler() {
        empty = true;       
        heaterOn = false;  
    }


    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    public void fill() {
        if (empty && !heaterOn) {
            empty = false;
            System.out.println("Boiler lleno con mezcla de chocolate y leche.");
        } else {
            System.out.println("No se puede llenar el boiler.");
        }
    }

    public void boil() {
        if (!empty && !heaterOn) {
            heaterOn = true;
            System.out.println("Proceso de mezcla iniciado.");
        } else {
            System.out.println("No se puede iniciar la mezcla.");
        }
    }

    public void drain() {
        if (!empty && heaterOn) {
            empty = true;
            heaterOn = false;
            System.out.println("Boiler vaciado.");
        } else {
            System.out.println("No se puede vaciar el boiler.");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isHeaterOn() {
        return heaterOn;
    }
}