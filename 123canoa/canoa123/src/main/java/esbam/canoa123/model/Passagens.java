/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esbam.canoa123.model;

/**
 *
 * @author francisvan
 */
public class Passagens {
    private int id;
    private Passageiros passageiro;
    private Rotas rota;

    public Passagens(int id, Passageiros passageiro, Rotas rota) {
        this.id = id;
        this.passageiro = passageiro;
        this.rota = rota;
    }

    public int getId() {
        return id;
    }

    public Passageiros getPassageiro() {
        return passageiro;
    }

    public Rotas getRota() {
        return rota;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassageiro(Passageiros passageiro) {
        this.passageiro = passageiro;
    }

    public void setRota(Rotas rota) {
        this.rota = rota;
    }
    
}
