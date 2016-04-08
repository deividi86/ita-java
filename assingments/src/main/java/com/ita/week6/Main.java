package com.ita.week6;

import com.ita.week6.factory.GameEngineFactory;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by deividi.silva on 30/03/2016.
 */
public class Main {

    public static void main(String[] args) {
        int swValue;
        GameEngineFactory gameEngineFactory = new GameEngineFactory();

        System.out.println("=========================================");
        System.out.println("|         PALAVRAS EMBARALHADAS         |");
        System.out.println("-----------------------------------------");
        System.out.println("|      Nomes de animais em inglês       |");
        System.out.println("-----------------------------------------");
        System.out.println("|           Modos de jogo:              |");
        System.out.println("|             1. Morte Súbita           |");
        System.out.println("|             2. 3 tentativas           |");
        System.out.println("|             3. Sair                   |");
        System.out.println("=========================================");

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
                System.exit(1);
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}


