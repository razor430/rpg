package com.company;

public class Main {

    public static void main(String[] args) {
        Jugador j1 = new Jugador("juan",100,4,11);
        Jugador j2 = new Jugador("jose",100,5,10);
        int turno = 1;
        int golpe = 0;

        while(j1.getVida() > 0 && j2.getVida() > 0){
            System.out.println("turno: " + turno++);
            golpe = j2.golpear();
            j1.setVida(j1.getVida() - golpe);
            System.out.println("jugador 2 ataca jugador 1 por " + golpe);
            golpe = j1.golpear();
            j2.setVida(j2.getVida() - golpe);
            System.out.println("jugador 1 ataca jugador 2 por " + golpe);
        }

        if (j1.getVida() < 0){
            System.out.println("el ganador es el jugador 2");
        }
        if (j2.getVida() < 0){
            System.out.println("el ganador es el jugador 1");
        }
    }
}
