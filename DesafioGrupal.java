//zona de librerías.
//importamos la clase Scanner de la librería util de JAVA para poder obtener la entrada de datos primitivos. Esto quiere decir que podemos capturar datos del tipo int, double, String, etc.
import java.util.Scanner;

/** (comentario de documentación)
Tp Codo a Codo inicial
@author: Soledad Cotignola, Sabrina Carneau y Alfonsina Guido
@date: 31/10/2022
@version: 1.0
*/

public class DesafioGrupal {
    
    public static void main(String[] args) {
        //Declaro el objeto
		Scanner miTeclado;
		//Inicializo el objeto.
		miTeclado = new Scanner(System.in);
		
        //Declaro variables.
		String nombre, clave, opcion, opcion2;
        //Inicializo el nombre y la clave.
        String nom = "Sara";
        String cla = "Sepe1234";

        //Declaro otras variables y las inicializo en la misma línea, para su uso posterior en funciones.
        double saldo = 3015.46;
        String nombreCompleto = "Sara Elena Perez";
        String telefono = "4758-9348";
        String dni = "30294506";
       
        //Instrucciones de entrada y salida.
        Menu.imprimir("Ingrese su tarjeta");

        System.out.println();

        Menu.imprimir("Bienvenido/a " + nombreCompleto + " al Home Banking.");
		
        Menu.imprimir("Ingrese su nombre de Usuario");
        //Inicializo la variable nombre con el objeto y el método.
		nombre = miTeclado.nextLine();

        Menu.imprimir("Ingrese su clave");
        //Inicializo la variable clave con el objeto y el método.
        clave = miTeclado.nextLine();

        //limpiamos la pantalla con estas dos líneas de código.
        System.out.print("\033[H\033[2J");  //\033: Representa el carácter de escape ASCII. Su valor ANSI es 27. Significa ESC.
        System.out.flush();

        //usamos el método equals para comparar el contenido de cada String, dado que esta comparación no funciona usando == ya que el compilador de JAVA compararía los objetos pero no su contenido. Para comparar contenido de String se usa el método equals.
        //la condición indica que ejecuta el primer bloque de código si los datos no son correctos.
        //utilizo la etiqueta salir para referenciar al bloque del cual debe salir cuando ejecute la sentencia break etiquetada.
salir:	if (!nombre.equals(nom) || !clave.equals(cla)){
            //realizamos un bucle for para que pueda intentar ingresar 2 veces más con los datos correctos.
            for (int i=1; i<=2; i++){
                Menu.imprimir("Datos incorrectos.");
                Menu.imprimir("Ingrese nuevamente su nombre de Usuario");
        	    nombre = miTeclado.nextLine();
                Menu.imprimir("Ingrese su clave");
                clave = miTeclado.nextLine();
                //limpiamos la pantalla con estas dos líneas de código.
                System.out.print("\033[H\033[2J");  //\033: Representa el carácter de escape ASCII. Su valor ANSI es 27. Significa ESC.
                System.out.flush();
             //condición para mostrar el menú principal y salir del ciclo for en caso que ingrese los datos correctos antes de los 3 intentos permitidos.   
                if(nombre.equals(nom) && clave.equals(cla)){
                    Menu.opciones();
                    //sentencia break etiquetada para que salga del nivel de bloque referenciado (sin la etiqueta solo sale del primer bloque donde se encuentra).
                    break salir;
                }
            }
            Menu.imprimir("Ha llegado al límite de 3 intentos permitidos, por favor extraiga su tarjeta.");
            //cierro el objeto Scanner.
            miTeclado.close();
            //con return indico al programa que una vez realizado los tres intentos para validar el usuario y contraseña (agotado el ciclo for), debe salir del programa.
            return;
        }else{
             //llamamos a la función que imprime las opciones del menú principal.
            Menu.opciones();
        }
        
        //con el bucle do while definimos que en caso de que el usuario elija volver al menú principal (variable opcion2), pueda ejecutarse la opción ingresada (variable opcion).
        do {
            opcion = miTeclado.nextLine();//Inicializo la variable opción con el objeto y el método.
       
            switch (opcion){
                case "1":
                 //imprimo mensaje y llamo a la función para mostrar datos del usuario.
                 Menu.imprimir("Datos del Usuario: nombre completo, DNI y teléfono.");
                 Menu.datosUsuario(nombreCompleto, dni, telefono);
                 opcion2 = "";
                break ;
                case "2":
                 //imprimo mensaje y llamo a la función para mostrar el saldo ficticio.
                 Menu.imprimir("Su saldo actual es:");
                 Menu.saldo(saldo);
                 Menu.imprimir("Presione 1 para volver al menú principal.");
                 Menu.imprimir("Presione 2 para cerrar sesión.");
                 //El usuario sobrescribe la variable opción2.
                 opcion2 = miTeclado.nextLine();
                 //condición para ejecutar el código que corresponda según la opción ingresada por el usuario.
                    if (opcion2.equals("1")){
                        Menu.opciones();
                    }else if (opcion2.equals("2")){
                        break;
                    }else{
                        //imprimo mensaje para captar errores del usuario.
                        Menu.imprimir("** Opción inválida **");
                    }                    
                break;
                case "3":
                 //imprimo mensaje para esta opción.
                 Menu.imprimir("Aquí podrá realizar su Transferencia");
                opcion2 = "";
                break;
                case "4":
                 //imprimo mensaje para esta opción.
                 Menu.imprimir("Aquí podrá realizar su Pago Online");
                opcion2 = "";
                break;
                case "5":
                opcion2 = "";
                break;
                //con default definimos comportamiento por defecto ante cualquier otro valor que no corresponda a las opciones indicadas.
                default:
                 Menu.imprimir("** Opción inválida **");
                 opcion2 = "";
                break;
            } 
        } while (opcion2.equals("1")) ;
        
        //cierro el objeto Scanner.
        miTeclado.close();
      
        //imprimo mensaje de cierre de sesión.
        Menu.imprimir("*** Su sesión ha sido cerrada exitosamente, por favor extraiga su tarjeta ***");
      
    }

}