package com.tutorial;

// ini akan mengimport class console
import com.terminal.Console;

// mengimport static method dari console;
import static com.terminal.Console.log;

class Main{
    public static void main(String[] args) {
        Player player1 = new Player("Otong");
        player1.show();
        
        Console.log("Menampilkan data dengan console.log");
        Console.log(player1.getName());

        log("Menampilkan data dengan log saja");
        log(player1.getName());
    }
}
// ini tidak akan bisa, penggunaan private tidak diperkenankan
// private class Test{

// }