package Roulette;

import Utente.Utente;

public class NumeriMultipli {
    private boolean haiVinto = false;

    public void NumeriMultiploVincente(int[] array, int numeroVincente) {
        for (int i = 0; i < array.length; i++) {
            haiVinto = numeroVincente == array[i];
            if (haiVinto) {
                break;
            }
        }   
    }

    public void getNumeroVincente(Utente utente, int puntata) {
        if (haiVinto) {
            utente.setCrediti(utente.getCrediti() + puntata);
            System.out.println("HAI VINTO!!!! i crediti sono: " + utente.getCrediti());
        } else {
            utente.setCrediti(utente.getCrediti() - puntata);
            System.out.println("HAI PERSO :(  i crediti sono: " + utente.getCrediti());
        }
    }
}

