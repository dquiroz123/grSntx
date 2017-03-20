package com.udea.proint

import groovy.transform.ToString

/**
 * Created by ubuntu on 11/10/16, sin accesores
 */
@ToString(includeNames = true, includePackage = false)
class Persona6 {

    def nombre
    def apellido

    def Persona6(nombre, apellido){
        this.nombre = nombre
        this.apellido = apellido
    }

    def Persona6(){

    }
}


