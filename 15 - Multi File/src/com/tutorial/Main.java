package com.tutorial;

// keyword import untuk package eksternal
import com.terminal.Console;

class Main{
    public static void main(String[] args) {
        Player player1 = new Player("Otong");
        Player player2 = new Player("Ucup");
        Player player3 = new Player("Saitama");
        player1.show();
        player2.show();
        player3.show();

        Console.log("hallo");
        Console.log("Hallo");
    }
}