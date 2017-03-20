package com.udea.proint

import groovy.transform.ToString

/**
 * Created by ubuntu on 11/10/16, sin tostring
 */
@ToString(includeNames = true, excludes = 'apellido',includePackage = false)
class Persona5 {

    def nombre
    def apellido

    def Persona5 (def nombre, def apellido){
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
}


