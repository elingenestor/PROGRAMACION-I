package Guarderia2;

import java.util.ArrayList;
import java.util.List;

class acudiente{
    private String nombreCompleto;
    private String numContacto;

    public acudiente(String nombreCompleto, String numContacto) {
        this.nombreCompleto = nombreCompleto;
        this.numContacto = numContacto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getNumContacto() {
        return numContacto;
    }

    public void setNumContacto(String numContacto) {

    }
}

class Boy{
    private String id;
    private String nombre;
    private int edad;
    private String genero;
    private String alergias;
    private acudiente acudiente;

    public Boy(String id, String nombre, int edad, String genero, String alergias) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.alergias = alergias;
    }

    public Boy(String id, String nombre, String edad, String genero, String alergias, Guarderia2.acudiente acudiente2) {
    }

    public acudiente getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(acudiente acudiente) {
        this.acudiente = acudiente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public void mostrarInfo(){
        System.out.println("ID: "+ id + "| Nombre: "+ nombre + "| Edad: "+ edad + "| Genero: "+ genero +
                "| Alergias: "+ alergias + " | Acudiente: "+ acudiente + " | Numero de contacto: " + acudiente.getNumContacto());
    }
}

class Guarderia{
    private List<Boy> boys = new ArrayList<>();
     public void registrarNino(Boy boy){
         for (Boy n : boys) {
             if(n.getId().equals(boy.getId())){
                 System.out.println("Error. ID existente.");
                 return;
             }
         }
         boys.add(boy);
         System.out.println("Estudiante guardado.");
     }

     public Boy buscarNino(String id){
         for (Boy boy : boys) {
             if(boy.getId().equals(id)){
                 return boy;
             }
         }
         return null;
     }

     public void eliminarNino(String id){
         for (Boy boy : boys) {
             if(boy.getId().equals(id)){
                 boys.remove(boy);
                 System.out.println("Estudiante eliminado" + boy.getId());
                 return;
             }
         }
         System.out.println("El estudiante no se encuentra registrado");
     }

     public void listarEstudiantes(){
         if(boys.isEmpty()){
             System.out.println("No hay estudiantes registrados");
         } else {
             for (Boy boy : boys) {
                 boy.mostrarInfo();
             }
         }
     }
     public void listarMayoresA5(){
         boolean encontrado = false;
         for (Boy boy : boys) {
             if(boy.getEdad() > 5) {
                 boy.mostrarInfo();
                 encontrado = true;
             }
         }
         if(!encontrado){
             System.out.println("No hay estudiantes mayores a 5 años registrados");
         }
     }

}
