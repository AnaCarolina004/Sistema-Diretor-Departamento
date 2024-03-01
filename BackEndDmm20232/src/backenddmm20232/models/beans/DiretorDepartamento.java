/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backenddmm20232.models.beans;

/**
 *
 * @author Aninha04
 */
public class DiretorDepartamento {
    private int id;
    private int idDir;
    private int idDep;
    private String dataInicio;
    private String dataFim;
    private String nomeProj;
    private String obs;
    private Diretor dir;
    private Departamento dep;

    public DiretorDepartamento(int id) {
        this.id = id;
    }

    public DiretorDepartamento(String nomeProj) {
        this.nomeProj = nomeProj;
    }

    public DiretorDepartamento(int idDir, int idDep, String dataInicio, String dataFim, String nomeProj, String obs) {
        this.idDir = idDir;
        this.idDep = idDep;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.nomeProj = nomeProj;
        this.obs = obs;
    }

    public DiretorDepartamento(int id, int idDir, int idDep, String dataInicio, String dataFim, String nomeProj, String obs) {
        this.id = id;
        this.idDir = idDir;
        this.idDep = idDep;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.nomeProj = nomeProj;
        this.obs = obs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDir() {
        return idDir;
    }

    public void setIdDir(int idDir) {
        this.idDir = idDir;
    }

    public int getIdDep() {
        return idDep;
    }

    public void setIdDep(int idDep) {
        this.idDep = idDep;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getNomeProj() {
        return nomeProj;
    }

    public void setNomeProj(String nomeProj) {
        this.nomeProj = nomeProj;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Diretor getDir() {
        return dir;
    }

    public void setDir(Diretor dir) {
        this.dir = dir;
    }

    public Departamento getDep() {
        return dep;
    }

    public void setDep(Departamento dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "DiretorDepartamento{" + "id=" + id + ", idDir=" + idDir + ", idDep=" + idDep + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", nomeProj=" + nomeProj + ", obs=" + obs + '}';
    }

    
}
