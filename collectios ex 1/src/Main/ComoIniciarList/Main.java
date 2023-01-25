package Main.ComoIniciarList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      /*
            List<Double> notas = new ArrayList<>();
            ArrayList<Double> notas2 = new ArrayList<>();

            notas.add(1d);

            //Exemplo ja adicionando valores
            List<Double> notas3 = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
            List<Double> notas4 = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);

            //Lista imutavel na lista imutael uasamos "Lista.of"
            List<Double> notas5 = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
            //notas5.add(5d); operacao nao sera reizada pois notas5 e imutavel

            System.out.println(notas3);
       */

        System.out.println("Crie um alista e adicione 7 notas.");

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(7.3);
        notas.add(7.4);
        notas.add(8.1);
        notas.add(9.0);

        System.out.println(notas.toString());
        System.out.println("Exiba a posicao da nota 7.3 " + notas.indexOf(7.4));
        System.out.println("Adiciona na lista a nota 8.0 na posicao 4: " );

        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5 pela nota 7: ");
        notas.set(notas.indexOf(7.3), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 7.3 esta na lista: " + notas.contains(7.3));

        System.out.println("Exiba todas as notas na oredem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);


    }
}