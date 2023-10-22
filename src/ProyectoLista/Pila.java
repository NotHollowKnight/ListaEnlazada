package ProyectoLista;

public class Pila<E> extends Lista {
    
    public Pila()
    {
        super();
    }
    
    public void SACA()
    {
        SUPRIME(PRIMERO());
    }
    
    public E TOPE()
    {
        return RECUPERA(PRIMERO());
    }
    
    @Override
    public void ANULA()
    {
        cabeza = null;
        fin = null;
    }
    
    public void METE(E dato)
    {
        INSERTA(dato, PRIMERO());
    }
    
    @Override
    public boolean VACIA()
    {
        if(cabeza == null)
        {
            return true;
        }
        else
        return false;
    }
       
}
