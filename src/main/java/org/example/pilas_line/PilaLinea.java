package org.example.pilas_line;

public class PilaLinea {
    private  static  final int TAMPILA = 49; //tamano maximo de la pila
    private int cima;// valor de elementos
    private Object[] listaPila;   //arreglo de objetos

    public PilaLinea(){
        cima=-1;
        listaPila = new Object[TAMPILA];
    }
    public void insertar(Object elemento) throws Exception{
        if(pilaLlena()){
            throw new Exception("desvordamiento pila");
        }
        ++cima;
        listaPila[cima]=elemento;
    }
    public Object quitar() throws Exception{
        Object aux;
        if (pilaVacia()){
            throw  new Exception("pila vacia(UnderFlow)");
        }
        aux = listaPila[cima];
        cima --;
        return aux;
    }
    public boolean pilaVacia(){
        return cima==-1;
    }
    public boolean pilaLlena(){
        return cima == TAMPILA -1;
    }
    public void limpiarPila(){
        cima = -1;
    }
}
