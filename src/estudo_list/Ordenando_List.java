package estudo_list;

import gatos.Gato;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Evandro
 */
public class Ordenando_List {

    public static void main(String[] args) {
        Gato gato1 = new Gato();
        gato1.setNome("Tiquinho");
        gato1.setIdade(5);
        gato1.setCor("preto");
        System.out.println("--------------------------");

        Gato gato2 = new Gato();
        gato2.setNome("Piqueno");
        gato2.setCor("Cinza");
        gato2.setIdade(12);
        System.out.println("--------------------------");

        Gato gato3 = new Gato();
        gato3.setNome("Jon");
        gato3.setCor("preto");
        gato3.setIdade(12);
        System.out.println("--------------------------");

        Gato gato4 = new Gato();
        gato4.setNome("Jon");
        gato4.setCor("branco");
        gato4.setIdade(8);
        System.out.println("--------------------------");

        List<Gato> listGatos1 = new ArrayList<>();

        listGatos1.add(gato1);
        listGatos1.add(gato2);
        listGatos1.add(gato3);
        listGatos1.add(gato4);
        System.out.println("Ordem de inserção");
        System.out.println(listGatos1);

        System.out.println("\nOrdem aleatória ");
        Collections.shuffle(listGatos1);
        System.out.println(listGatos1);

        System.out.println("\nOrdenar por nome");
        Collections.sort(listGatos1);
        System.out.println(listGatos1);

        System.out.println("Ordem por idade ");
        Comparator<Gato> lista2 = new Comparator<Gato>() {
            @Override
            public int compare(Gato g1, Gato g2) {
                return Integer.compare(g1.getIdade(), g2.getIdade());
            }
        };
        Collections.sort(listGatos1, lista2);
        System.out.println(listGatos1);
        
        System.out.println("\nOdernar por cor");
         Comparator<Gato> comparaCor = new Comparator<Gato>() {
            @Override
            public int compare(Gato g1,Gato g2) {
              
               return g1.getCor().compareToIgnoreCase(g2.getCor());
            }
         };
         listGatos1.sort(comparaCor);
         
         System.out.println(listGatos1);
         
         System.out.println("Ordenar por nome,cor e idade");
         Comparator<Gato> ordernarNomeCorIdade = new Comparator<Gato>() {
            @Override
            public int compare(Gato g1, Gato g2) {
                int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
                if(nome !=0)return nome;
                int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
                if(cor!= 0)return cor;
                return g1.getIdade().compareTo(g2.getIdade());
                
            }
         };
         listGatos1.sort(ordernarNomeCorIdade);
         System.out.println(listGatos1);
    }
}
