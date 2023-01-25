package Main.ComoIniciarList;

//Exemplo  de ordenacao list

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioParte2 {
    public static void main(String[] args) {

        List<Cat> myCats = new ArrayList<>(){{
            add(new Cat("Zezinho", 10, "Preto"));
            add(new Cat("Toto", 6, "Marron"));
            add(new Cat("Zezinho", 7, "Branco"));
        }};

        System.out.println("--\tOrdem de insersao\t---");
        System.out.println(myCats);

        System.out.println("--\tOrdem aleatoria\t---");
        Collections.shuffle(myCats);
        System.out.println(myCats);

        System.out.println("--\tOrdem Natural\t---");
        Collections.sort(myCats);
        System.out.println(myCats);

        System.out.println("--\tOrdem Idade\t---");

    }

}

class Cat implements Comparable<Cat>{
    private String name;
    private Integer age;
    private String color;

    public Cat(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        return this.getName().compareToIgnoreCase(cat.getName());
    }

}


