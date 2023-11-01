package ApiDeCollectionsAndGenerics.QueueJava;

import java.util.PriorityQueue;

public class PriorityQueueMain {
    public static void main(String[] args) {

        Equipe equipe01 = new Equipe("Equipe01", 230);
        Equipe equipe02 = new Equipe("Equipe02", 245);
        Equipe equipe03 = new Equipe("Equipe03", 241);
        Equipe equipe04 = new Equipe("Equipe04", 229);
        Equipe equipe05 = new Equipe("Equipe05", 244);

        PriorityQueue<Equipe> priorityQueue = new PriorityQueue<Equipe>(5, new EquipeComparator());

        priorityQueue.add(equipe01);
        priorityQueue.add(equipe02);
        priorityQueue.add(equipe03);
        priorityQueue.add(equipe04);
        priorityQueue.add(equipe05);

        for (Equipe equipe: priorityQueue){
            System.out.println(equipe);
        }
    }
}
