package com.udea.proint

/**
 * Created by ubuntu on 11/10/16, sin return
 */
class Persona3 {

    private String nombre
    private String apellido

    public Persona3 (String nombre, String apellido){
        this.nombre = nombre
        this.apellido = apellido
    }

    public String getNombre() {
         nombre
    }

    public String getApellido() {
         apellido
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
         detalle.toString()
    }
}


