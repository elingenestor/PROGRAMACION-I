package Guarderia;

public class Guarderia {
    private String nombre;
    private String edad;
    private String genero;
    private String documentoIdentidad;
    private String alergias;
    private String nombreAcudiente;
    private String numContacto;

    //constructor
    public Guarderia(String nombre, String edad, String genero, String documentoIdentidad, String alergias, String nombreAcudiente, String numContacto) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.documentoIdentidad = documentoIdentidad;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numContacto = numContacto;
    }

    //Metodo get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public String getNumContacto() {
        return numContacto;
    }

    public void setNumContacto(String numContacto) {
        this.numContacto = numContacto;
    }
    //metodo para mostrar informacion
    public void mostrar() {

    }
    //Metodo para mostrar info
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " | Edad: " + edad +" | Genero: " + genero + " | Alergias: " + alergias + " | Id: " + documentoIdentidad +
                " | Nombre Acudiente: " + nombreAcudiente + " | Num Contacto: " + numContacto);
    }
}



