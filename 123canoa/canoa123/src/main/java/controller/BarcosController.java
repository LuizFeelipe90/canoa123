/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import esbam.canoa123.model.Barcos;

/**
 *
 * @author francisvan
 */
public class BarcosController {
    public boolean cadastrarBarco(String nome, int capacidade){
        if(nome != null && nome.length()>0 && capacidade != 0 && capacidade>0){
            Barcos barco = new Barcos(nome, capacidade);
            barco.cadastrarBarco(barco);
            return true;
        }else{
            return false;    
        }
    }
}
