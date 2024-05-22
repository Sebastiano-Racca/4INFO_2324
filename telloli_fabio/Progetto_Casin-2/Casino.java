import java.util.Scanner;

import BlackJack.*;
import Roulette.BancoRoulet;
import Roulette.ColoreRoulet;
import Roulette.NumeriMultipli;
import Roulette.NumeriRoulet;
import Roulette.PuntataUser;
import Utente.*;

public class Casino {
    private int scelta;
    private Scanner scanner;
    private Utente utente;
    private String nomeFile;

    Casino(Utente utente, String nomeFile) {
        this.nomeFile = nomeFile;
        this.utente = utente;
        this.scanner = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("SEI ENTRATO NEL CASINO' \n");
        System.out.println("scegli una delle seguenti opzioni");
        System.out.println("#######################");
        System.out.println("# 1) roulet           #");
        System.out.println("# 2) black jack       #");
        System.out.println("# 0) ESCI             #");
        System.out.println("#######################");

        System.out.println("\n cosa vuoi fare? ");
        return scelta = scanner.nextInt();
    }

    public void sceltaGioco() {
        menu();

        while (scelta != 0) {
            switch (scelta) {
                case 1:
                    NumeriRoulet numeriBanco = new NumeriRoulet();
                    ColoreRoulet coloreBanco = new ColoreRoulet();
                    PuntataUser numeroUtente = new PuntataUser();
                    PuntataUser coloreUtente = new PuntataUser();
                    NumeriMultipli numeriMultipli = new NumeriMultipli();
                
        
                    BancoRoulet roulette = new BancoRoulet(numeriBanco, coloreBanco, numeroUtente, coloreUtente, numeriMultipli);
                    roulette.play(utente, nomeFile);
                break;
            
                case 2:
                    BlackjackGame game = new BlackjackGame();
                    game.play(utente, nomeFile);
                break;
    
                case 0:
                    System.out.println("sei uscito dal casino' ");
                break;
            }

            menu();
        }
        
        
    }
}