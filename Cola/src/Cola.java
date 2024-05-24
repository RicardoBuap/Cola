public class Cola {
    private String lista;
    private Nodo inicioCola;
    private Nodo finalCola;
    private int tamaño;

    public Cola(){
        this.tamaño = 0;
        this.inicioCola = null;
        this.finalCola = null;
        this.lista = "";
    }

    public boolean ColaVacia(){
        return inicioCola == null;
    }

    public void IngresarNodoCola(Object informacion){
        Nodo nuevoNodo = new Nodo(informacion);
        if(ColaVacia()){
            inicioCola = nuevoNodo;
        }
        else{
            finalCola.siguiente = nuevoNodo;
        }
        finalCola = nuevoNodo;
        tamaño++;
    }

    public String ImprimirCola(){
        Nodo recorrido = inicioCola;
        lista = "";
        while(recorrido != null){
            lista += recorrido.informacion + " - >";
            recorrido = recorrido.siguiente;
        }
        return lista;
    }

    public int TamañoCola(){
        return tamaño;
    }

    public Object InicioCola(){
        return inicioCola.informacion;
    }

    public Object FinalCola(){
        return finalCola.informacion;
    }

    public Object EliminarNodoCola(){
        Object eliminado = InicioCola();
        inicioCola = inicioCola.siguiente;
        tamaño--;
        return eliminado;
    }

    public void VaciarCola(){
        while(!ColaVacia())
            EliminarNodoCola();
    }
}
