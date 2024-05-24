import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cola cola = new Cola();
        Scanner teclado = new Scanner(System.in);
        int opcion;
        boolean continuar = true;
        Object informacion;
        while(continuar){
            System.out.println(" - - - - - Menú - - - - -");
            System.out.println("Ingresar nodo a la cola:   1");
            System.out.println("Imprimir lista tipo cola:  2");
            System.out.println("Tamaño de lista tipo cola: 3");
            System.out.println("¿La lista tipo cola está vacía: 4");
            System.out.println("Inicio de la cola: 5");
            System.out.println("Final de la cola: 6");
            System.out.println("Eliminar inicio de la cola: 7");
            System.out.println("Vaciar la lista tipo cola:  8");
            System.out.println("Salir del programa: 9 \n"); 
            System.out.print("Ingresa una opción del menú:");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un valor al nodo:");
                    informacion = teclado.nextLine();
                    informacion = teclado.nextLine();
                    cola.IngresarNodoCola(informacion);
                    break;

                case 2: 
                    if(cola.ColaVacia()){
                        System.out.println("La cola está vacía.");
                    }
                    else{
                        System.out.println(cola.ImprimirCola());
                    }
                    break;

                case 3:
                    if(cola.ColaVacia()){
                        System.out.println("La cola está vacía.");
                    }
                    else{
                        System.out.println("Tamaño de la cola: " + cola.TamañoCola());
                    }
                    break;

                case 4: 
                    if(cola.ColaVacia()){
                        System.out.println("La cola está vacía.");
                    }
                    else{
                        System.out.println("La cola no está vacía.");
                    }
                    break;

                case 5:
                    if(cola.ColaVacia()){
                        System.out.println("La cola está vacía.");
                    }
                    else{
                        System.out.println("Inicio de la cola: " + cola.InicioCola());
                    }
                    break;

                case 6:
                    if(cola.ColaVacia()){
                        System.out.println("La cola está vacía.");
                    }
                    else{
                        System.out.println("Final de la cola: " + cola.FinalCola());
                    }
                    break;

                case 7: 
                    if(cola.ColaVacia()){
                        System.out.println("La cola está vacía.");
                    }
                    else{
                        System.out.println("Se ha eliminado el nodo con valor: " + cola.EliminarNodoCola());
                    }
                    break;
            
                case 8:
                    if(cola.ColaVacia()){
                        System.out.println("La cola está vacía.");
                    }
                    else{
                        System.out.println("Se ha vaciado la cola.");
                        cola.VaciarCola();
                    }
                    break;

                case 9: 
                    System.out.println("Saliendo del programa....");
                    continuar = false;
                    break;
                default:
                    break;
            }
        }
        teclado.close();
    }
}
