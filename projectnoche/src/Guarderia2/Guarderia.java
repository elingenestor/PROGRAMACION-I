package Guarderia2;

import java.util.ArrayList;
import java.util.List;

public class Guarderia {
    private List<Estudiante> ninos;

    //constructor
    public Guarderia() {
        ninos = new ArrayList<>();
    }

    //Metodo para agregar niños

    public void agregarNino(Estudiante nino){
        ninos.add(nino);
    }

    //Metodo para obtener niños mayores de 5
    public List <Estudiante> obtenerMayorCinco(){
        List <Estudiante> mayorCinco = new ArrayList<>();
        for (Estudiante nino : ninos){
            if (nino.getEdad() > 5 ){
                mayorCinco.add(nino);
            }
        }
        return mayorCinco;
    }

    public void mostrarNinos(){
        for (Estudiante nino : ninos){
            nino.mostrarInfo();
        }
    }

}
