//Archivo no ejecutable.
//Declaro la clase Menú y sus funciones.
public class Menu {
    
   //Codeamos nuestras funciones del menú principal.

    //función general para imprimir un mensaje de tipo String.
    static void imprimir(String mensaje){
        System.out.println(mensaje);
    }

    //función general para imprimir un mensaje de tipo int.
    static void imprimir(int mensaje){
        System.out.println(mensaje);
    }

    //función general para imprimir un mensaje de tipo double.
    static void imprimir(double mensaje){
        System.out.println(mensaje);
    }

    //función que imprime las opciones del menú principal.
    static void opciones(){
        Menu.imprimir("MENÚ PRINCIPAL");
        Menu.imprimir("Ingrese 1 si desea ver los Datos del Usuario");
        Menu.imprimir("Ingrese 2 si desea ver su Saldo Actual");
        Menu.imprimir("Ingrese 3 si desea realizar una Transferencia");
        Menu.imprimir("Ingrese 4 si desea realizar un Pago Online");
        Menu.imprimir("Ingrese 5 para cerrar sesión");
    }

    //función para mostrar datos del usuario.
    static void datosUsuario(String nombreCompleto, String dni, String telefono){
        Menu.imprimir(nombreCompleto);
        Menu.imprimir(dni);
        Menu.imprimir(telefono);
    }
 
    //función para mostrar el saldo ficticio.
    static void saldo(double num){
        Menu.imprimir(num);
    }
    
}