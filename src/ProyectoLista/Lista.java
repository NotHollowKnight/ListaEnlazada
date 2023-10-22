package ProyectoLista;

public class Lista<E> 
{
    protected Nodo cabeza;
    protected Nodo fin;
    
    public Lista()
    {
        this.cabeza = null;
        this.fin = null;
    }
    
    public boolean VACIA()
    {
        if(cabeza == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
        
    public void INSERTA(E dato, int posicion)
    {
        if(posicion == 1){
            cabeza = new Nodo(dato,cabeza.siguiente);
            if(fin == null)
            {
            fin = cabeza;
            }
            
        }else if(posicion == FIN()){
            fin.siguiente = new Nodo(dato);
            fin = fin.siguiente;
            
        }else{
            Nodo recorrer = cabeza;
            int contador = 1;
            while(contador!=(posicion-1))
            {
                recorrer = recorrer.siguiente;
                contador++;
            }
            recorrer.siguiente = new Nodo(dato,recorrer.siguiente);
        }  
    }
    
    public int FIN(){
        Nodo n = cabeza;
        int contador=0;
        while(n!=null)
        {
            n = n.siguiente;
            contador++;
        }
        return contador+1;
    }
    
    public int LOCALIZA(E dato)
    {
        if(!VACIA()){
                if(dato.equals(cabeza.dato)){ //if(cabeza.dato == dato)
                    return 1;
                    
                } else if(dato.equals(fin.dato)){ //else if(dato == fin.dato)
                    return FIN()-1;
                
                } else{
                    int contador=1;
                    Nodo recorrido = cabeza;
                    while(recorrido != null)
                    {
                        if(dato.equals(recorrido.dato)) {
                            return contador;
                        }
                        recorrido = recorrido.siguiente;
                        contador++;
                    }
                    return -1;
                }
        }
        
    }
    
    public void ANULA(){
        fin = null;
        cabeza = fin;
    }
    
    public E RECUPERA(int posicion){
        Nodo recupera = cabeza;
        
            for (int i = 1; i < posicion; i++) {
            recupera = recupera.siguiente;
            }
            E copia = recupera.dato;
            return copia;
        
    }
    
    public int SIGUIENTE(int posicion)
    {
        if(posicion < FIN() - 1 && posicion > 0) {
            return posicion + 1;
        } else {
            return -1;
        }
    }
    
    public int ANTERIOR(int posicion)
    {
        if(posicion >= 1 && posicion < FIN()) {
            return posicion - 1;
        } else {
            return -1;
        }
    }
    
    public int PRIMERO()
    {
        return 1;
    }
    
    public void SUPRIME(int posicion)
    {
        if(!VACIA())
        {
           if(cabeza == fin && posicion == 1)
           {
               cabeza = null;
               fin = null;
           }
           
           else if(posicion == 1)
           {
               cabeza = cabeza.siguiente;
           }
           
           else
           {
               Nodo anterior = cabeza;
               Nodo siguiente = cabeza.siguiente;
               int contador = 2;
               while(siguiente != null && contador != posicion)
               {
                   anterior = anterior.siguiente;
                   siguiente = siguiente.siguiente;
                   contador++;
               }
               
               if(siguiente != null)
               {
                   anterior.siguiente = siguiente.siguiente;
                   if(siguiente == fin)
                   {
                       fin = anterior;
                   }
               }
               
           }
             
        }
        else
        {
            System.out.println("| LA LISTA ESTA VACIA |");
        }
  
    }
     
        /* public void MostrarLista()
    {
        if(!VACIA())
        {
            Nodo auxiliar = cabeza;
            int posicion=PRIMERO();
            System.out.println();
            while(posicion!=FIN())//while(auxiliar != null)
            {
                System.out.print("[ "+RECUPERA(posicion)+" ]--> ");
                posicion = SIGUIENTE(posicion);
                //System.out.print("[ "+auxiliar.dato+" ]---> ");
                //auxiliar = auxiliar.siguiente;
            }
        }
        
        else
        {
            System.out.println("\n| LA LISTA ESTA VACIA |");
        }
        System.out.println("");
        
    } */
    
}




