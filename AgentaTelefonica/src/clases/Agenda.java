package clases;

import java.util.HashSet;
import java.util.Set;

public class Agenda {

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
    public void añadirContacto(Contacto c){


    }

//    public void existeContacto(Contacto c){
//      Se utiliza la verificacion en el metodo añadirContacto
//    }

    public void listarContactos(){

    }

    public String buscaContacto(String nombre, String apellido){
        return  c.getTelefono();
    }

    public String eliminarContacto(Contacto c){
        return "";
    }

    public void modificarTelefono(String nombre, String apellido, String telefono ){

    }

    public boolean agendaLlena(){
        return agendaLlena;
    }

    public void espacioLibres(){

    }

}
