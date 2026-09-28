
package com.bruno_coutinho.hospital_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="convenio")

public class Convenio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (name = "nome" , nullable = false)
    private String nome;
    
    @Column (name = "tempocarencia" )
     private String tempoCarencia;
    
    @Column (name = "cnpj" ,unique = true)
    private String cnpj;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTempoCarencia() {
        return tempoCarencia;
    }

    public void setTempoCarencia(String tempoCarencia) {
        this.tempoCarencia = tempoCarencia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
}
