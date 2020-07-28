import java.util.Scanner;

/**
 *
 * @author Robert Farfan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
          Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el tamano de la cola");
        int t = teclado.nextInt();
        Cola c= new Cola(t);
        int opc=0;
        do{
            System.out.println("Elija una opcion:\n 1:insertar;\n 2:Eliminar \n"
                    + " 3:listar\n 4:Cola Llena\n 5:Cola Vacia\n  0:salir ");
            opc = teclado.nextInt();
            switch (opc){
                case 1:System.out.println("Digitar valor:");
                        int v= teclado.nextInt();
                        c.insertar(v);
                        break;
                case 2: c.eliminar();
                        break;
                case 3: c.listar();
                        break;        
                case 4: if (c.colaLlena()) System.out.println("La cola esta llena");
                        else System.out.println("La cola no esta llena");
                        break;
                case 5: if (c.colaVacia())System.out.println("La cola esta vacia");
                        else System.out.println("La cola no esta vacia");
                        break;                          
            }                        
        }while (opc!=0);
    }
        
    }
