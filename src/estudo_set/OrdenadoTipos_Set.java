package estudo_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Evandro
 */
public class OrdenadoTipos_Set {

    public static void main(String[] args) {
        
        /*
           Ordenar String ou qualquer tipo
        */
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine().toUpperCase();
        String n2 = sc.nextLine().toUpperCase();
        String n3 = n+n2;
        String vet2[]= n3.split("");
        Set<String> ordemSet = new HashSet<>(Arrays.asList(vet2));
        ordemSet.stream().map((x) -> x.compareToIgnoreCase(x));
        System.out.println(ordemSet);

    }
}
