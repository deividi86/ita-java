package com.ita.week6;

import java.util.Scanner;

/**
 * Created by deividi.silva on 30/03/2016.
 */
public class Main {

    public static void main(String[] args) {
        int swValue;

        System.out.println("============================");
        System.out.println("|  PALAVRAS EMBARALHADAS   |");
        System.out.println("============================");
        System.out.println("| Modos de jogo:           |");
        System.out.println("|        1. Morte Subita   |");
        System.out.println("|        2. 3 tentativas   |");
        System.out.println("|        3. Exit           |");
        System.out.println("============================");

        Scanner in = new Scanner(System.in);
        swValue = in.nextInt();

        switch (swValue) {
            case 1:
                System.out.println("Morte Subita");
                break;
            case 2:
                System.out.println("3 tentativas");
                break;
            case 3:
                System.out.println("Tchau!");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}


