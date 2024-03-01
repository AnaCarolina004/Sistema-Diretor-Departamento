/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backenddmm20232.models.beans;

/**
 *
 * @author Aninha04
 */
public class Diretor {
    private int id;
    private int idPes;
    private String area;
    private String graduacao;
    private PessoaFisica pf;

    public Diretor(int id) {
        this.id = id;
    }

    public Diretor(String area) {
        this.area = area;
    }

    public Diretor(int idPes, String area, String graduacao) {
        this.idPes = idPes;
        this.area = area;
        this.graduacao = graduacao;
    }

    public Diretor(int id, int idPes, String area, String graduacao) {
        this.id = id;
        this.idPes = idPes;
        this.area = area;
        this.graduacao = graduacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPes() {
        return idPes;
    }

    public void setIdPes(int idPes) {
        this.idPes = idPes;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public PessoaFisica getPf() {
        return pf;
    }

    public void setPf(PessoaFisica pf) {
        this.pf = pf;
    }

    
    @Override
    public String toString() {
        return "Diretor{" + "id=" + id + ", idPes=" + idPes + ", area=" + area + ", graduacao=" + graduacao + '}';
    }

    
}
