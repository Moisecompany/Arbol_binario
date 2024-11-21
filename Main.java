package Actividad_8;

public class Main {
    public static void main(String[] args) {
        Arbol_binario arbol = new Arbol_binario();
        arbol.instertar(10);
        arbol.instertar(11);
        arbol.instertar(14);
        arbol.instertar(3);
        arbol.instertar(2);
        arbol.instertar(16);
        arbol.instertar(4);
        System.out.println("Antes:");
        arbol.imprimir();
        arbol.eliminar(3);
        System.out.println("El valor 3 existe en el arbol:"+arbol.buscar(3));
        System.out.println("El valor 4 existe en el arbol:"+arbol.buscar(4));
        System.out.println("Despues:");
        arbol.imprimir();
    }
}
