import clases.Agenda;
import clases.Contacto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        String opcion;

        do {
            System.out.println("Bienvenido al menú. Elija una opción.");
            System.out.println("1. Agregar contacto.");
            System.out.println("2. Buscar contacto.");
            System.out.println("3. Eliminar contacto.");
            System.out.println("4. Modificar telefono.");
            System.out.println("5. Verificar si la agenda esta llena.");
            System.out.println("6. Verificar el espacio disponible.");
            System.out.println("7. Mostrar la lista de contactos.");
            System.out.println("8. Salir.");
            opcion = scanner.nextLine();

            switch (opcion){
                case "1":
                    System.out.println("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingrese el telefono: ");
                    String telefono = scanner.nextLine();

                    agenda.anadirContacto(new Contacto(nombre, apellido, telefono));
                    break;

                case "2":
                    System.out.println("Ingrese el nombre que desea buscar: ");
                    String buscarNombre = scanner.nextLine();
                    System.out.println("Ingrese el apellido que desea buscar: ");
                    String buscarApellido = scanner.nextLine();

                    System.out.println(agenda.buscaContacto(buscarNombre, buscarApellido));
                    break;

                case "3":
                    System.out.println("Ingrese el nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    System.out.println("Ingrese el apellido del contacto a eliminar: ");
                    String apellidoEliminar = scanner.nextLine();

//                    Contacto contactoEliminar = agenda.buscaContacto(nombreEliminar, apellidoEliminar);
//                    System.out.println(agenda.eliminarContacto(contactoEliminar));
                    break;

                case "4":
                    System.out.println("Ingrese el nombre: ");
                    String nombreModifica = scanner.nextLine();
                    System.out.println("Ingrese el apellido: ");
                    String apellidoModifica = scanner.nextLine();
                    System.out.println("Ingrese el nuevo telefono: ");
                    String telefonoModifica = scanner.nextLine();

                    agenda.modificarTelefono(nombreModifica,apellidoModifica,telefonoModifica);

                    break;

                case "5":
                    boolean agendaLlena = agenda.agendaLlena();
                    if(agendaLlena){
                        System.out.println("La agenda está llena.");
                    }else {
                        System.out.println("La agenda no está llena. ");
                    }
                    break;

                case "6":
                    agenda.espacioLibres();
                    break;

                case "7":
                    System.out.println("en construccion.");
                    break;

                case "8":
                    System.out.println("Saliendo del menu.");
                    break;
                default:
                    System.out.println("Opcion invalida.");

            }


        }while (!opcion.equals("8")); /*forma de negar un string*/
            System.out.println("Adios!");




    }
}