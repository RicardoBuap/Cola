public class App {
    public static void main(String[] args) throws Exception {
        Cola cola = new Cola();
        cola.IngresarNodoCola(1);
        cola.IngresarNodoCola(2);
        cola.IngresarNodoCola(3);
        System.out.println(cola.ImprimirCola());
        System.out.println("El tamaño de la Cola es: " + cola.TamañoCola());
        System.out.println("Inicio de la cola: " + cola.InicioCola());
        System.out.println("Final de la cola: " + cola.FinalCola());
        System.out.println("Eliminando nodo cola: " + cola.EliminarNodoCola());
        System.out.println(cola.ImprimirCola());
        System.out.println("La cola está vacía: " + cola.ColaVacia());
    }
}
