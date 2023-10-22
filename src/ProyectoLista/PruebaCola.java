package ProyectoLista;

import java.util.Scanner;

public class PruebaCola {
    
    public static void main(String[] args)
    {
    String dato;
    int posicion, decision;
    Cola C1 = new Cola();
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("""
                       1. Poner en cola
                       2. Quita de cola
                       3. Frente
                       4. Anula
                       5. Vacia
                       6. Mostrar cola
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
                C1.PONE_EN_COLA(dato);
                break;
                
            case 2:
                C1.QUITA_DE_COLA();
                break;
            
            case 3:
                System.out.println("FRENTE saco: "+C1.FRENTE());
                break;
            
            case 4:
                C1.ANULA();
                break;
        
            case 5:
                if(C1.VACIA()==true)
                    System.out.println("La lista esta vacia");
                else
                    System.out.println("La lista contiene elementos");
                break;
                
            case 6:
                int parar = C1.PRIMERO();
                while(parar!=C1.FIN())
                {
                    System.out.print("[ "+C1.RECUPERA(parar)+" ]---> ");
                    parar = C1.SIGUIENTE(parar);
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
