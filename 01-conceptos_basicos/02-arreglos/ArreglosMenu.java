public class ArreglosMenu {

import mx.edu.uttt.menuprueba.Menu;
import mx.edu.uttt.arreglos.vectores.Vectores;
import javax.swing.*;

public class ArreglosMenu {
    public static void mostrar() {

        int opcion;

        do {

            opcion = Menu.menuArreglos();

            switch (opcion) {

                case 1:
                    menuVectores();
                    break;

                case 2:
                    menuMatrices();
                    break;

                case 0:
                    return;

                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opción no válida."
                    );
            }

        } while (true);
    }

    private static void menuVectores() {

        int opcion;
        Vectores objVector = new Vectores();
        do {

            opcion = Menu.menuVectores();

            switch (opcion) {

                case 1:
                    JOptionPane.showMessageDialog(null,objVector.sumarElementos());
                    break;

                case 2:
                    //Vectores.buscarElemento();
                    break;

                case 0:
                    return;

                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opción no válida."
                    );
            }

        } while (true);
    }

    private static void menuMatrices() {

        int opcion;

        do {

            opcion = Menu.menuMatrices();

            switch (opcion) {

                case 1:
                    //Matrices.sumarElementos();
                    break;

                case 2:
                    //Matrices.diagonalPrincipal();
                    break;

                case 0:
                    return;

                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opción no válida."
                    );
            }

        } while (true);
    }
    package mx.edu.uttt.menu;

import javax.swing.*;

// Contiene los menus de las estructuras de datos.
public class Menu {
    // Muestra y devuelve la opcion del menu principal.
    public static String menuPrincipal(){
        String opciones = "=========== ESTRUCTURA DE DATOS ========== \n\n" +
                "1) Arreglos\n" +
                "2) Listas\n" +
                "3) Pilas\n" +
                "4) Colas\n" +
                "5) Arboles\n" +
                "0) Salir\n\n" +
                "Seleccione una opción";

        return JOptionPane.showInputDialog(opciones);
    }

    // Muestra y devuelve la opcion del menu de arreglos.
    public static String menuArreglos(){
        String opciones = "=========== MENUS ========== \n\n" +
                "1) Vectores\n" +
                "2) Matrices\n" +
                "0) Regresar\n" +
                "Seleccione una opción";

        return JOptionPane.showInputDialog(opciones);
    }

    // Muestra y devuelve la opcion del menu de vectores.
    public static String menuVectores(){
        String opciones = "======== MENÚ VECTORES ========" +
                "\n1) Llenar vector" +
                "\n2) Mostrar vector" +
                "\n3) Número de pares e impares" +
                "\n4) Suma de los valores" +
                "\n5) Mostrar números pares" +
                "\n6) Mostrar números impares" +
                "\n7) Mostrar números primos" +
                "\n8) Promedio" +
                "\n9) Valor mayor" +
                "\n10) Valor menor" +
                "\n0) Regresar" +
                "\n\nSelecciona una opción:";

        return JOptionPane.showInputDialog(opciones);
    }

    // Muestra y devuelve la opcion del menu de matrices.
    public static String menuMatrices(){
        String opciones = "=========== MENU MATRICES ========== \n\n" +
                "1) Reserva de Asientos\n" +
                "2) Acumulado de Ventas\n" +
                "3) Matriz identidad\n" +
                "4) Diagonal principal\n" +
                "5) Transposición\n" +
                "6) Rotación\n" +
                "0) Regresar\n" +
                "Seleccione una opción";

        // Matriz [i][j]
        // Matriz [j][i] para lo de rotación
        return JOptionPane.showInputDialog(opciones);
    }

    // Devuelve el menu de listas.
    public static String menuListas(){
        String opciones = "=========== ESTRUCTURA DE DATOS ========== \n\n" +
                "1) Vectores\n" +
                "2) Matrices\n" +
                "0) Regresar\n" +
                "Seleccione una opción";

        return JOptionPane.showInputDialog(opciones);
    }

    // Devuelve el menu de colas, actualmente vacio.
    public static String menuColas(){
        return "";
    }

    // Devuelve el menu de pilas, actualmente vacio.
    public static String menuPilas(){
        return "";
    }

    // Devuelve el menu de arboles, actualmente vacio.
    public static String menuArboles(){
        return "";
    }
}

}

