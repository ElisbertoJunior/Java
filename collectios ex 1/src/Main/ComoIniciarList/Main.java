package Main.ComoIniciarList;


import java.util.*;

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

        /*
            PARTE 2
         */

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma das notas: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma das notas e igual a: " + soma);

        System.out.println("Exiba a media das notas: " + (soma / notas.size()));

        notas.remove(8.0);
        System.out.println("Revido o item 8.0 " + notas);

        notas.remove(0);
        System.out.println("Removido o primeiro item da lista " + notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();

        }

        System.out.println("Notas menores do que 7 removidas " + notas);


        System.out.println("Apague todos o itens da lista: " + notas);
        //notas.clear();
        System.out.println("A lista esta vazia ? " + notas.isEmpty());

        /*
            EXERCICIO 3
         */

        List<Double> notas2 = new LinkedList<>();
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            notas2.add(next);

        }

        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da lista: " + notas2.get(0));
        System.out.println("Mostre a primeira nota da lista removendo-a: " + notas2.remove(0));

        System.out.println(notas2);
    }

}