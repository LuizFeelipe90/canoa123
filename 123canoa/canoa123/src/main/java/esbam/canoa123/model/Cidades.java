/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esbam.canoa123.model;

/**
 *
 * @author francisvan
 */
public class Cidades {
    private int id;
    private String localidade;
    private String estado;

    public Cidades(int id, String localidade, String estado) {
        this.id = id;
        this.localidade = localidade;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
