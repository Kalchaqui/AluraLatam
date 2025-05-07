package com.aluracursos.screenmatch.modelos;

public class Pelicula {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica (){
        System.out.println("El nombre de la película es: " + nombre);
        System.out.println ("Su fecha de lanzamiento fue: " + fechaDeLanzamiento);
        System.out.println ("Su duración en minutos es: " + duracionEnMinutos);

    }

    public void evalua(double nota){//VOID= Propósito: Modificar el estado interno del objeto (acumula notas y
                            // cuenta cuántas evaluaciones se hicieron).

        sumaDeLasEvaluaciones += nota; //sumaDeLasEvaluaciones es igual a ella misma + nota
        totalDeLasEvaluaciones ++;
    }

    public double calculaMedia (){ //DOUBLE= Propósito: Calcular y devolver un valor: el promedio de las evaluaciones.
        return sumaDeLasEvaluaciones  / totalDeLasEvaluaciones;

//Una clase es como un molde o plantilla para crear objetos. Imaginá que querés fabricar muchos muñecos de plastilina. El molde define cómo va a ser cada muñeco: su forma, color, tamaño, etc. Cada muñeco que hacés con ese molde es un objeto.
//
//En programación:
//
//Clase = El molde (define cómo serán los objetos).
//
//Objeto = Una cosa concreta que creás con esa clase.

        //Para crear un objeto en Java, debemos usar la palabra clave "new" seguida del nombre de la clase y paréntesis vacíos. Por ejemplo, para crear un objeto del tipo "Persona", podemos escribir el siguiente código:
        //
        //Persona persona1 = new Persona();
    }
}
