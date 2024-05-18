package org.example;

import org.example.pilas_line.PilaLinea;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public  static void palindromo(){
        PilaLinea pila = new PilaLinea();
        String palabra = "oso";
        String palabraInvertida="";
        //creamos la pila con la palabra

        for (int i=0;i<palabra.length();i++){
            try {
                pila.insertar(palabra.charAt(i));
            }catch (Exception ex){
                System.out.println("problema al insertar"+ex.getMessage());
            }
        }
        while (!pila.pilaVacia()){
            try {
                palabraInvertida+=pila.quitar();
            }catch (Exception ex){
                System.out.println("error comprobando");
            }
        }
        if (palabraInvertida.equals(palabra)){
            System.out.println("simon, es palindromo");
        }else {
            System.out.println("nel, no es palindromo");
        }
    }


    public static void main(String[] args) {


        palindromo();



 ////////////////////////////////////////////////////////////////////////////////////////////////
//        PilaLinea pil = new PilaLinea();
//        try {
//            pil.insertar("   hola");
//            pil.insertar("   mundo");
//            pil.insertar("   esta");
//            pil.insertar("   es una ");
//            pil.insertar("   pila");
//            while(!pil.pilaVacia()){
//                System.out.println("elemento saliente"+pil.quitar());
//            }
//        }catch (Exception ex){
//            System.out.println("upss, hay un pronlema"+ex.getMessage());
//        }
    }
}