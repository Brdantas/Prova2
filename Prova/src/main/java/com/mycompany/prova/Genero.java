
package com.mycompany.prova;


public enum Genero {
    MASCULINO("Masculino",'M'),
    FEMININO("Feminino",'F');
    
    protected final String texto;
    protected final char caracter;

    private Genero(String texto, char caracter) {
        this.texto = texto;
        this.caracter = caracter;
    }

    public String getTexto() {
        return texto;
    }

    public char getCaracter() {
        return caracter;
    }
    
}
