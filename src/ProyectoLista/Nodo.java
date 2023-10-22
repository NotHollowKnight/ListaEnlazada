package ProyectoLista;

public class Nodo<E> 
{
    private E dato;
    private Nodo<E> siguiente;
    
    public Nodo(E dato)
    {
    this.dato = dato;
    this.siguiente = null;
    }
    
    public Nodo(String dato, Nodo siguiente)
    {
        this.dato = dato;
        this.siguiente = siguiente;
    }
     
}