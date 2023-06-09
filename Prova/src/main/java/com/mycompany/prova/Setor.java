
package com.mycompany.prova;


public enum Setor {
   ENGENHARIA("Engenharia"),
   SAUDE("Saúde"),
   JURIDICO("Juridico"),
   OPERACOES("Operações");
   
   protected final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
   
}
