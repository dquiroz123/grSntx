package com.udea.proint

/**
 * Created by ubuntu on 11/10/16, sin tipado fuerte
 */
class Persona4 {

    def nombre
    def apellido

    def Persona4 (def nombre, def apellido){
        this.nombre = nombre
        this.apellido = apellido
    }

    def getNombre() {
        nombre
    }

    def getApellido() {
        apellido
    }

    def setNombre(def nombre) {
        this.nombre = nombre
    }

    def setApellido(def apellido) {
        this.apellido = apellido
    }

    def String toString(){
        StringBuilder detalle = new StringBuilder()
        detalle.append("nombre: ").append(nombre).append(", apellido: ").append(apellido)
        detalle.toString()
    }
}


