package ProyectoLista;

public class Cola extends Lista {
    
    public Cola()
    {
        super();
    }
    
    @Override
    public void ANULA()
    {
       cabeza = null;
       fin = null;
    }
    
    public String FRENTE()
    {
        return RECUPERA(PRIMERO());
    }
    
    public void PONE_EN_COLA(String dato)
    {
        INSERTA(dato, FIN());
    }
    
    public void QUITA_DE_COLA()
    {
        SUPRIME(PRIMERO());
    }
    
    @Override
    public boolean VACIA()
    {
        if(cabeza == null)
            return true;
        else
            return false;
    }
    
}
