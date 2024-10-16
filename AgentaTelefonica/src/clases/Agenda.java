package clases;

import Interfaces.IValidaciones;

import java.util.*;

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
        boolean existeNombreApellido = validarNombre(c.getNombre(), c.getApellido());
        if (listaContactos.size() < tamanioAgenda){
            if (existeNombreApellido){
                System.out.println("No se puede añadir ");
            }else{
                listaContactos.add(c);
                System.out.println("El nuevo contacto añadido es: "+c);
            }
        }else {
            System.out.println("La agenda está llena.");
        }
    }

    public void existeContacto(Contacto c){

        boolean existe = validarNombre(c.getNombre(), c.getApellido());
        if (existe){
            System.out.println("El contacto si existe.");
        }else {
            System.out.println("El contacto no existe.");
        }
    }

    public void listarContactos(){

        // Convertir el Set a una List para poder ordenarla
        List<Contacto> listaOrdenada = new ArrayList<>(listaContactos);

        Collections.sort(listaOrdenada, (c1, c2) -> c1.getNombre().compareToIgnoreCase(c2.getNombre()));

        for (Contacto c: listaOrdenada ){
            System.out.println("Contactos: " + c);
        }

    }

    public Contacto buscaContacto(String nombre, String apellido){
        if (listaContactos.isEmpty()){
            System.out.println("Lista vacia.");
        }else {
            for (Contacto c: listaContactos){
                if (c.getNombre().equals(nombre) && c.getApellido().equals(apellido)){
                    System.out.println("Telefono: " + c.getTelefono());
                    return c;
                }
            }
        }

        System.out.println("No se encontro el contacto.");
        return null;
    }

    public String eliminarContacto(Contacto c){
        boolean contactoEncontrado = validarNombre(c.getNombre(), c.getApellido());
        if (contactoEncontrado){
            listaContactos.remove(c);
            return "El contacto ha sido eliminado";
        }else {
            return "Contacto no encontrado";
        }
    }

    public void modificarTelefono(String nombre, String apellido, String telefonoModifica ){
        boolean encontrado = false;
        for (Contacto c: listaContactos){
            if (c.getNombre().equals(nombre) && c.getApellido().equals(apellido)){
                c.setTelefono(telefonoModifica);
                System.out.println("El telefono ha sido modificado.");
                encontrado = true;

            }else {
                continue;
            }
        }
        if (!encontrado){
            System.out.println("No se encontró.");
        }

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
