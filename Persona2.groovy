package com.udea.proint

/**
 * Created by ubuntu on 11/10/16, sin ;
 */
class Persona2 {

    private String nombre
    private String apellido

    public Persona2 (String nombre, String apellido){
        this.nombre = nombre
        this.apellido = apellido
    }

    public String getNombre() {
        return nombre
    }

    public String getApellido() {
        return apellido
    }

    public void setNombre(String nombre) {
        this.nombre = nombre
    }

    public void setApellido(String apellido) {
        this.apellido = apellido
    }

    public String toString(){
        StringBuilder detalle = new StringBuilder()
        detalle.append("nombre: ").append(nombre).append(", apellido: ").append(apellido)
        return detalle.toString()
    }
}


