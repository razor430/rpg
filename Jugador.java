package com.company;
import java.util.Random;

public class Jugador {
    private String nommbre;
    private int vida;
    private int minPower;
    private int maxPower;

    public Jugador(String nommbre, int vida, int minPower, int maxPower) {
        this.nommbre = nommbre;
        this.vida = vida;
        this.minPower = minPower;
        this.maxPower = maxPower;
    }

    public int golpear(){
        Random aleatorio = new Random();

        int n = aleatorio.nextInt((this.maxPower) + 1);
        if (n < this.minPower){
            n = this.minPower;
        }
        return n;
    }

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMinPower() {
        return minPower;
    }

    public void setMinPower(int minPower) {
        this.minPower = minPower;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }
}
