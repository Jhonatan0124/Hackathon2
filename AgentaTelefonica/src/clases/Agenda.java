package clases;

import Interfaces.IValidaciones;

import java.util.HashSet;
import java.util.Set;

public class Agenda implements IValidaciones {

    private Set<Contacto> listaContactos;
    private int tamanioAgenda;

    //Constructor
    public Agenda() {
        listaContactos = new HashSet<>();
        tamanioAgenda = 10;
    }

    //Getters y Setters
    public Set<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(Set<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public int getTamanioAgenda() {
        return tamanioAgenda;
    }

    public void setTamanioAgenda(int tamanioAgenda) {
        this.tamanioAgenda = tamanioAgenda;
    }

    //Metodos
    public void anadirContacto(Contacto c){


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
        if (tamanioAgenda == listaContactos.size()) {
            return true;
        }

        return false;
    }

    public void espacioLibres(){
        System.out.println("Espacio Libres: " + (tamanioAgenda - listaContactos.size()));
    }

    @Override
    public boolean validarNombre(String nombre, String apellido) {

        for (Contacto c : listaContactos) {
            if (c.getNombre().equalsIgnoreCase(nombre) && c.getApellido().equalsIgnoreCase(apellido)) {
                return true;
            }
        }

        return false;
    }

}
