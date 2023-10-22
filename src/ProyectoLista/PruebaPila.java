package ProyectoLista;

import java.util.Scanner;

public class PruebaPila {
    
    
    public static void main(String[] args)
    {
    String dato;
    int posicion, decision;
    Pila P1 = new Pila();
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("""
                       1. Mete
                       2. Saca
                       3. Tope
                       4. Anula
                       5. Vacia
                       6. Mostrar Pila
                       7. Salir
                       """);
    
    
        do {
            System.out.println("\n----- INGRESA ---");
            decision = leer.nextInt();
            switch(decision)
            {
            case 1:
                System.out.println("Ingresa el dato: ");
                leer.nextLine();
                dato = leer.nextLine();
                P1.METE(dato);
                break;
                
            case 2:
                P1.SACA();
                break;
            
            case 3:
                System.out.println("TOPE saco: "+P1.TOPE());
                break;
            
            case 4:
                P1.ANULA();
                break;
        
            case 5:
                if(P1.VACIA()==true)
                    System.out.println("La lista esta vacia");
                else
                    System.out.println("La lista contiene elementos");
                break;
                
            case 6:
                int parar = P1.PRIMERO();
                while(parar!=P1.FIN())
                {
                    System.out.print("[ "+P1.RECUPERA(parar)+" ]---> ");
                    parar = P1.SIGUIENTE(parar);
                }
                break;
            
            case 7:
                System.out.println("Ha salido con exito");
                break;
            
            default:
                System.out.println("Ingresa una opcion valida");
        
            }   
            
        } while (decision!=7);
    
    
    
    
    
    }

    
    
    
    
}
