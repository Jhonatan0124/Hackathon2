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
        boolean existeNombreApellido = validarNombre(c.getNombre());

        if (existeNombreApellido){
            System.out.println("No se puede añadir ");
        }else{
            System.out.println("Se añadio el nuevo contacto");
        }
    }

//    public void existeContacto(Contacto c){
//      Se utiliza la verificacion en el metodo añadirContacto
//    }

    public void listarContactos(){

    }

    public String buscaContacto(String nombre, String apellido){
        return  "numero de telefono";
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
