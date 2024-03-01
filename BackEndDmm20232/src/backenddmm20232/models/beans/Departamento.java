/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backenddmm20232.models.beans;

/**
 * criacao do objeto
 * @author Aninha04
 */
public class Departamento {
    
    private int id;
    private String nome;
    private String sigla;
    private String desc;


    public Departamento(int id) {
        this.id = id;
    }

    public Departamento(String nome) {
        this.nome = nome;
    }

    public Departamento(String nome, String sigla, String desc) {
        this.nome = nome;
        this.sigla = sigla;
        this.desc = desc;

    }

    public Departamento(int id, String nome, String sigla, String desc) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
        this.desc = desc;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Departamento{" + "id=" + id + ", nome=" + nome + ", sigla=" + sigla + ", desc=" + desc + '}';
    }
   
}
