package clases;

import Interfaces.IValidaciones;

import java.util.HashSet;
import java.util.Set;

public class Agenda implements IValidaciones {

    private Set<Contacto> listaContactos;

    //Constructor
    public Agenda() {
        listaContactos = new HashSet<>();
    }

    //Getters y Setters
    public Set<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(Set<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }


    //Metodos
    public void anadirContacto(Contacto c){


    }

//    public void existeContacto(Contacto c){
//      Se utiliza la verificacion en el metodo añadirContacto
//    }

    public void listarContactos(){

    }

    public Contacto buscaContacto(String nombre, String apellido){
        for (Contacto c: listaContactos){
            if (c.getNombre().equals(nombre) && c.getApellido().equals(apellido)){
                System.out.println("Telefono: " + c.getTelefono());
                return c;
            }
        }
        System.out.println("No se encontro el contacto.");
        return null;
    }

    public String eliminarContacto(Contacto c){
        return "";
    }

    public void modificarTelefono(String nombre, String apellido, String telefono ){

    }

    public boolean agendaLlena(){
        return false;
    }

    public void espacioLibres(){

    }

    @Override
    public boolean validarNombre(String nombre) {
        return false;
    }

    @Override
    public boolean validarApellido(String apellido) {
        return false;
    }
}
