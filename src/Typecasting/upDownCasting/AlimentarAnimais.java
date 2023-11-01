package Typecasting.upDownCasting;

/*
 * Essa classe não tem responsabilidade de saber qual animal esta na lista.
 * Aqui usamos o polimorfismo
 */
public class AlimentarAnimais {

    public static void alimentar(Animal animal){
        animal.comer();
        // Só quero o downcasting quando for cachorro
        if(animal instanceof Cachorro){
            ((Cachorro)animal).latir();
        }
    }

}
