import java.util.ArrayList;

public class Excepciones {
    public static void main(String[] args) {

        ArrayList<Object> miLista = new ArrayList<Object>();
        miLista.add("13");
        miLista.add("Hola Mundo");
        miLista.add(13);
        miLista.add("Adios Mundo");

        for (int i = 0; i < miLista.size(); i++) {
            try {
                int castedValue = (int) miLista.get(i);
                System.out.print("\n");
                System.out.println("El elemento del indice es: " + i + " es un entero " + castedValue);
            } catch (ClassCastException e) {
                System.out.print("\n");
                System.out.println("Error de conversion en el indice " + i + " : " + e.getMessage());
                System.out.println("Valor del objeto que causo el valor: " + miLista.get(i));
            }
        }
    }
}