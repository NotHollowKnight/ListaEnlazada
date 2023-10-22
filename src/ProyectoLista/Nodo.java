package ProyectoLista;

public class Nodo 
{
    public String dato;
    public Nodo siguiente;
    
    public Nodo(String dato)
    {
    this.dato = dato;
    siguiente = null;
    }
    
    public Nodo(String dato, Nodo siguiente)
    {
        this.dato = dato;
        this.siguiente = siguiente;
    }
     
}