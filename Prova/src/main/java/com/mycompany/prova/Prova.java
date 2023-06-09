

package com.mycompany.prova;

import java.time.LocalDate;
import java.time.Month;

 
public class Prova {

    private static Endereco Endereco;

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Breno", "710089055", "jbkgjksg@.com", Endereco) {} ;
        
       Motoboy motoboy = new Motoboy("0485084580", "97569489756", "9875745745", "8479634900", Setor.ENGENHARIA, 8.900, LocalDate.of(2003, Month.MARCH, 9), Genero.FEMININO, "Laura", "7105409905", "breno@gamil.com", Endereco);
       
       Medico medico = new Medico("3975389", "2348723", "8973598", "985394324", Setor.OPERACOES, 2.3465, LocalDate.of(2000, Month.MARCH, 10), Genero.FEMININO, "Claudia", "723579597", "hjfdashf@.com", Endereco);
       
       Advogado advogado = new Advogado("9543903", LocalDate.of(1999, Month.MARCH, 13), Genero.MASCULINO, "Breno", "718096894", "bfsj@.com", Endereco);
        
        System.out.println(advogado.getOab());
        System.out.println(medico.getCrm());
        System.out.println(motoboy.getCnh());
        
    }
    
}
