package Typecasting.upDownCasting;

import java.util.ArrayList;
import java.util.List;

import static Typecasting.upDownCasting.AlimentarAnimais.alimentar;

public class upDownCastingMain {
    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Passaro());
        animalList.add(new Cachorro());

        for (Animal animal:animalList){
            alimentar(animal);
        }

        Animal animal = new Cachorro();
        animal.comer();

    }
}
