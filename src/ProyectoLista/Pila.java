package ProyectoLista;

public class Pila extends Lista {
    
    public Pila()
    {
        super();
    }
    
    public void SACA()
    {
        SUPRIME(PRIMERO());
    }
    
    public String TOPE()
    {
        return RECUPERA(PRIMERO());
    }
    
    @Override
    public void ANULA()
    {
        cabeza = null;
        fin = null;
    }
    
    public void METE(String dato)
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
