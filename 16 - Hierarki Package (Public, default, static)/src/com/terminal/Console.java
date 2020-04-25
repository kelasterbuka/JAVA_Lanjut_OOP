package com.terminal;

// visibilitas untuk semuanya
public class Console {
    public static void log(String message){
        System.out.println(message);
    }
}

// ini hanya akan bisa diakses dari package com.terminal
class Terminal {
    public static void log(String message){
        System.out.println(message);
    }
}