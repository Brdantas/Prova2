
package com.mycompany.prova;

import java.time.LocalDate;


public class Advogado  extends Fisica{
private String oab;

    public Advogado(String oab, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(dataNascimento, genero, nome, telefone, email, endereco);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return super.toString()+
         "Advogado{" + "oab=" + oab ;
    }

}
