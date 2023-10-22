package ProyectoLista;

import java.util.Scanner;

public class PruebaLista {
    
    public static void main(String[] args)
    {
        int opcion=0;
        String dato;
        Lista L1 = new Lista();
        Scanner leer = new Scanner(System.in);
        
        do {            
            System.out.println("""
                               
                               \n1. Inserta
                               2. Localiza
                               3. Recupera
                               4. Suprime
                               5. Mostrar lista
                               6. Eliminar lista
                               7. Invertir la lista
                               8. Elimina los elementos repetidos
                               9. Salir
                               """);
            System.out.print("------ INGRESE ------\n");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    int posicion=1;
                    System.out.print("\n| LA LISTA ");
                    if(L1.VACIA()==true){
                        System.out.print("ESTA VACIA |\n");
                        System.out.println("Ingrese un dato nada mas");
                    }
                    else
                    {
                        System.out.print("TIENE ACTUALMENTE: "+(L1.FIN()-1)+" ELEMENTOS |");
                        do {                            
                            System.out.print("\nIngrese una posicion (valida): ");
                            posicion = leer.nextInt();
                        } while (posicion <=0 || posicion > L1.FIN());
                    }
                    
                    System.out.print("Ingrese el dato: ");
                    leer.nextLine();
                    dato = leer.nextLine();
                    L1.INSERTA(dato, posicion);
                break;
                    
                case 2:
                    System.out.print("Ingrese el dato a buscar: ");
                    leer.nextLine();
                    dato = leer.nextLine();
                    if(L1.LOCALIZA(dato)==L1.FIN())
                        System.out.print("\n| EL ELEMENTO NO SE ENCUENTRA EN LA LISTA |");
                    else
                        System.out.print("\n| LA PRIMERA APARICION DEL DATO EN LA LISTA FUE EN LA POSICION: ["+L1.LOCALIZA(dato)+"] |");
                break;
                    
                case 3:
                    if(L1.VACIA() == true)
                        System.out.println("| LA LISTA ESTA VACIA |");
                    else{
                        
                        do {
                            System.out.print("Ingresa la posicion a recuperar: ");
                            posicion = leer.nextInt();
                            if(posicion<=0 || posicion>=L1.FIN())
                                System.out.println("INGRESE UNA POSICION VALIDA");
                        } while (posicion<=0 || posicion>=L1.FIN());
                        System.out.print("| EL ELEMENTO RECUPERADO FUE: ["+L1.RECUPERA(posicion)+"] |");
                    
                    }
                break;
                
                case 4:
                    System.out.print("Indique la posicion a eliminar: ");
                    posicion = leer.nextInt();
                    L1.SUPRIME(posicion);
                    break;
                    
                case 5:
                    //L1.MostrarLista();
                    posicion = L1.PRIMERO();
                    System.out.println("");
                    while(posicion!=L1.FIN())
                    {
                        System.out.print("[ "+L1.RECUPERA(posicion)+" ]--> ");
                        posicion = L1.SIGUIENTE(posicion);
                    }
                    if(posicion!=1)
                        System.out.print("FIN DE LISTA");
                    else
                        System.out.print("\n| LA LISTA ESTA VACIA |");
                break;
                    
                case 6: 
                    L1.ANULA();
                break;
                
                case 7:
                    int pos1, pos2;
                    pos1 = L1.PRIMERO();
                    pos2 = L1.ANTERIOR(L1.FIN());
                    while(pos1!=pos2)
                    {
                        L1.INSERTA(L1.RECUPERA(pos2), pos1);
                        pos1 = L1.SIGUIENTE(pos1);
                        L1.SUPRIME(L1.ANTERIOR(L1.FIN()));
                        pos2 = L1.ANTERIOR(L1.FIN());
                    }
                    break;
                    
                case 8:
                    String buscar1, buscar2;
                    int aux1 = L1.PRIMERO();
                    int aux2 = L1.SIGUIENTE(aux1);
                    int contador=0, contador2 = 0;
                    while(aux1 != L1.FIN())
                    {
                        buscar1 = L1.RECUPERA(aux1);
                        while(aux2 != L1.FIN())
                        {
                            
                            buscar2 = L1.RECUPERA(aux2);
                            
                            if(buscar2.equals(buscar1)){
                                L1.SUPRIME(aux2);
                                aux2 = L1.ANTERIOR(aux2);
                            }
                            
                            aux2 = L1.SIGUIENTE(aux2);
                            
                        }
                        
                        aux1 = L1.SIGUIENTE(aux1);
                        aux2 = L1.SIGUIENTE(aux1);
                    }
                    
                    break;
                    
                case 9:
                    System.out.print("Usted ha salido con exito\n");
                break;
                    
                default:
                    System.out.println("Ingrese una opcion valida");;
                    
                    
                
            }
            
        } while (opcion!=9);
        

        
    }
    
    
}
