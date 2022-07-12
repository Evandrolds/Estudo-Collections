package estudo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Evandro
 */
public class Estudo_LinkedList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>(Arrays.asList(7.1,8.7,9.6,9.1,8.4,10d,7.1,7.9));
        System.out.println("Notas: " + notas);
        System.out.println("==============================");
        notas.remove(10d);
        notas.add(9.9);
      
        System.out.println("Crie um lista2 utilizando o LinkedList e adicione o a lisna de notas nela");
        List<Double> notas2 = new LinkedList<>();
        notas2.addAll(notas);
        System.out.println("Notas 2 :" + notas2);
        System.out.println("Mostrar a primeira nota da lista sem remover " );
        notas2.get(0);
        System.out.println("\nMostrar a primeira nota da lista removendo-a " + notas.get(0));
         System.out.println("Removendo a nota: -> " +notas2.remove(0));
         System.out.println("Notas 2 " + notas2);
         notas2.add(10d);
         System.out.println("Nova notas "+notas2);
       
               
    }
}
