package Guarderia2;

import javax.swing.*;

public class Estudiante {
    //Atributos
    private int id; // ID unico
    private String nombreCompleto;
    private int edad;
    private String genero;
    private String alergias;
    private String nombreAcudiente;
    private String numContacto;

    //Constructor
    public Estudiante(int id, String nombreCompleto, int edad, String genero, String alergias, String nombreAcudiente, String numContacto){
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.genero = genero;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numContacto = numContacto;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "alergias='" + alergias + '\''+ "\n" +
                ", id=" + id + "\n"+
                ", nombreCompleto='" + nombreCompleto + '\'' + "\n"+
                ", edad=" + edad + "\n"+
                ", genero='" + genero + '\''+ "\n" +
                ", nombreAcudiente='" + nombreAcudiente + '\'' + "\n"+
                ", numContacto='" + numContacto + '\'' + "\n"+
                '}';
    }

    //Metodos get

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getAlergias() {return alergias;}

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getNumContacto() {
        return numContacto;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setNumContacto(String numContacto) {
        this.numContacto = numContacto;
    }
//metodo para mostrar info del niño

    public void mostrarInfo(){
        JOptionPane.showMessageDialog(null, "ID: " + id + " | Nombre: " + nombreCompleto + " | Edad: " + edad + " | Genero: " + genero + "| Alergias: " + alergias +
                " | Nombre del Acudiente: " + nombreAcudiente + " | Num Contacto: " + numContacto);
    }
}
