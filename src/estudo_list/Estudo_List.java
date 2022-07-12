package estudo_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Evandro
 */
public class Estudo_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado uma lista com 8 notas de uma aluno [7.1,8.7,9.6,9.1,8.4,10,7.1,7.9]
        
        // Ciar uma lista e add as 8 notas
       List<Double> notas = new ArrayList<>(Arrays.asList(7.1,8.7,9.6,9.1,8.4,10d,7.1,7.9));
        System.out.println("Notas: " + notas);
        System.out.println("==============================");
        notas.remove(10d);
        notas.add(9.9);
      
        System.out.println("Notas: em linhas " + notas);
        System.out.println("Utilizando um consulmer, imprime em coluna");
        notas.forEach(System.out::println);
        System.out.println("Exiba a posição da nota 9.6");
        System.out.println("Está na possição: "+notas.indexOf(9.6)+" da Lista de notas ");
        System.out.println("\nAdicione a nota 8.8 na possição: 4 da Lista de notas ");
        notas.add(4,8.8);
        System.out.println("Notas " +notas+"\nNota adicionada na possição " + notas.indexOf(8.8)+" da lista");
        System.out.println("\nSubstituir a nota 9.9 pela nota 5.3 ");
        notas.set(notas.indexOf(9.9),5.3);
     
        System.out.println("Nota 9.9 substituida pela nota " + notas.get(notas.indexOf(5.3)));
        
        System.out.println("\nA nota 9.9 está na lista? "+ notas.contains(9.9));
        System.out.println("\nExiba os elementos na ordem em que foram inseridos \n"+ notas);
        
        System.out.println("\nExiba a terceira nota da lista: " + notas.get(3));
        
        System.out.println("\nExiba a menor nota da lista: " + Collections.min(notas));
        System.out.println("Exiba a maior nota da lista: " + Collections.max(notas));
        
        //Duas froma de fazer essa soma
        
        // Primeira forma
        Iterator<Double> somaNotas = notas.iterator();
           double notaSomada = 0;
        while(somaNotas.hasNext()){
         Double next = somaNotas.next();
            notaSomada+= next;
        } 
        System.out.println("\nExiba a soma de todas as notas: Primeira forma: " + notaSomada );
        
        //Segunda forma
        double soma = 0;
        
        for (Double nota : notas) {
            
            soma+= nota;
        }
        System.out.println("\nExiba a soma de todas as notas: Segunda forma: " + soma );
    System.out.println("A soma foi de " + soma);
        
          
        
    System.out.println("\nA media das notas foi de " + (soma/notas.size()));
        
        System.out.println(notas);
        System.out.println("Remova a nota 9.6 da lista " );
        notas.remove(9.6);
        System.out.println(notas);
        
        System.out.println("Remover a nota da posicao 1  que é "+ notas.get(1));
        notas.remove(1);
        System.out.println(notas);
        
        notas.add(4.8);
        notas.add(6.9);
        System.out.println("A nova lista de notas :" + notas);
        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        notas.removeIf((nota)-> nota < 7);
        System.out.println("\nNota removidas : " + notas);
        
        System.out.println("Apagar toda a lista de notas ");
        notas.clear();
        System.out.println("Notas: " + notas);
        System.out.println("\nVerificar se existe notas na lista");
        if(notas.isEmpty()){
            System.out.println("Não tem nada aqui dentro ");
        }else{
            System.out.println("Ainda possui algo ");
        }
        
        
    }
    
}
