package estudo_set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Evandro
 */
public class Estudando_Set {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,6.7,8.3,10d,8d,5d,9.2,6.7,10d,6.1,3.4,3d));
        System.out.println("Confira se a nota 5.0 está no conjunto");

         if(notas.contains(5d)){
             System.out.println("Sim, contem !");
         }else{
             System.out.println("Não contem!");
         }
        System.out.println("Exiba a menor nota que é -> " + Collections.min(notas));
        System.out.println("\nExiba a maior nota que é -> " + Collections.max(notas));
        System.out.println("Exiba a soma dos valores " );
       double soma = 0;
        for (Double nota : notas) {
            soma+=nota;
        }
        
        System.out.println("A soma é " +soma);
        System.out.println("A média das notas é " +soma/notas.size());
        System.out.println("Remova nota 3.0, removeu? "+ notas.remove(3.0));
        System.out.println(notas);
        System.out.println("\nRemova as notas menores que 6.5 ");
        notas.removeIf((x)-> x< 6.5);
        System.out.println(notas);
        
        System.out.println("Exiba todas as nota na ordem que foram inseridas");
        Set<Double> ordenSet = new LinkedHashSet<>(Arrays.asList(7d,6.7,8.3,10d,8d,5d,9.2,6.7,10d,6.1,3.4,3d));
         ordenSet.forEach(System.out::println);
         
         System.out.println("Ordenar na ordem crescente ");
        Set<Double> ordenCrescente = new TreeSet<>(Arrays.asList(7d,6.7,8.3,10d,8d,5d,9.2,6.7,10d,6.1,3.4,3d));
         ordenCrescente.forEach(System.out::println);
         System.out.println("Apague todo o conjunto");
         ordenCrescente.clear();
         System.out.println(ordenCrescente);
         System.out.println("Confira se o conjunto esta vazio " + ordenCrescente.isEmpty());
    }
       
        
}
