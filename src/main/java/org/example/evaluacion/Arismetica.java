package org.example.evaluacion;

import org.example.pilas_line.PilaLinea;

public class Arismetica {
    //evaluar una expresión aritmética
    public static int evaluar(String expresion) throws Exception {
        PilaLinea operandos = new PilaLinea();
        PilaLinea operadores = new PilaLinea();
        int resultado = 0;
        int operando1, operando2;
        char operador;
        int i = 0;
        while (i < expresion.length()){
            if (expresion.charAt(i) == ' '){ //si es espacio se ignora
                i++;//si es operador se inserta en la pila operadores
            } else if (expresion.charAt(i) == '+' || expresion.charAt(i) == '-' || expresion.charAt(i) == '*' || expresion.charAt(i) == '/'){
                operadores.insertar(expresion.charAt(i));
                i++;
            } else {//si el caracter es numero se lee hasta que se encuntre un espacion o un operador
                String numero = "";
                while (i < expresion.length() && expresion.charAt(i) != ' ' && expresion.charAt(i) != '+' && expresion.charAt(i) != '-' && expresion.charAt(i) != '*' && expresion.charAt(i) != '/'){
                    numero += expresion.charAt(i);
                    i++;
                }
                operandos.insertar(Integer.parseInt(numero));//se inserta el numero en la pila
            }
        }//mientras la pila no este vacia se hacen las operaciones
        while (!operadores.pilaVacia()){
            try {
                operando2 = (int) operandos.quitar();
                operando1 = (int) operandos.quitar();// se quitan dos operandos y un operador
                operador = (char) operadores.quitar();
                switch (operador){
                    case '+':
                        resultado = operando1 + operando2;
                        break;
                    case '-':
                        resultado = operando1 - operando2;
                        break;
                    case '*':
                        resultado = operando1 * operando2;
                        break;
                    case '/':
                        resultado = operando1 / operando2;
                        break;
                }
                operandos.insertar(resultado);  //el resultado se inserta en la pila
            } catch (Exception e) {//excepcion
                System.out.println(e.getMessage());
            }
        }
        return resultado;
    }
}
