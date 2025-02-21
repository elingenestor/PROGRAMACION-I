package Guarderia;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        //solicitar datos al usuario

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
        String edad = JOptionPane.showInputDialog("ingrese la edad del estudiante");
        String genero = JOptionPane.showInputDialog("ingrese la genero del estudiante");
        String alergias = JOptionPane.showInputDialog("ingrese la alergias");
        String documento = JOptionPane.showInputDialog("ingrese la documento");
        String nombreAcudiente = JOptionPane.showInputDialog("ingrese el nombre del acudiente");
        String numeroContacto = JOptionPane.showInputDialog("ingrese el numero de contacto");


        // crea un objeto de la clase Estudiante con los datos ingresados
        Guarderia nino1 = new Guarderia(nombre,edad,genero,alergias, documento, nombreAcudiente, numeroContacto);

        //Mostrar informacion del estudiante
        System.out.println("\nInformacion del estudiante registrado:");
        nino1.mostrarInfo();

    }
}