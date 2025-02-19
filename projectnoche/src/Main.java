import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Empleado {
    private String id;
    private String nombreCompleto;
    private String puesto;
    private String correoElectronico;
    private String numeroTelefono;
    private String fechaContratacion;

    public Empleado(String id, String nombreCompleto, String puesto, String correoElectronico, String numeroTelefono, String fechaContratacion) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.puesto = puesto;
        this.correoElectronico = correoElectronico;
        this.numeroTelefono = numeroTelefono;
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "ID='" + id + '\'' +
                ", Nombre Completo='" + nombreCompleto + '\'' +
                ", Puesto='" + puesto + '\'' +
                ", Correo Electronico='" + correoElectronico + '\'' +
                "' numero de Telefono='" + numeroTelefono + '\'' +
                "' Fecha de Contratacion='" + fechaContratacion + '\'' +
                '}';

    }

}
class GestorEmpleados {
    private List<Empleado> empleados;

    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("Lista de empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);

        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorEmpleados gestor = new GestorEmpleados();
         while (true) {
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Mostrar Empleado");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar Buffer

            if (opcion == 1) {
                System.out.print("Ingrese el ID: ");
                String id = scanner.nextLine();
                System.out.print("Ingrese el Nombre Completo: ");
                String nombreCompleto = scanner.nextLine();
                System.out.print("Ingrese el Puesto: ");
                String puesto = scanner.nextLine();
                System.out.print("Ingrese el Correo Electronico: ");
                String correoElectronico = scanner.nextLine();
                System.out.print("Ingrese el Numero de Telefono: ");
                String numeroTelefono = scanner.nextLine();
                System.out.print("Ingrese el Fecha de Contratacion (dd/mm/yyyy): ");
                String fechaContratacion = scanner.nextLine();

                Empleado empleado = new Empleado(id, nombreCompleto, puesto, correoElectronico, numeroTelefono, fechaContratacion);
                gestor.agregarEmpleado(empleado);
            } else if (opcion == 2) {
                gestor.mostrarEmpleados();
            } else if (opcion == 3) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opcion no valida. Intente nuevamente.");
            }
         }
         scanner.close();
    }
}
