package NovidadesJava.virtualThreads;


import java.util.Random;

/*
 * Threads - instancia da CPU da maquina virtual Java, e que tem associada um trecho de codigo que sera executado, e
 * uma area de memoria.
 * Sao criadas na JVM e não são 1:1 com as threads do sistema operacional.
 * A jvm fica responsavel por fazer esse gerenciamento das threads
 */
public class VirtualThreads {

    public static void main(String[] args) {

        // Flag quee controla o uso de threads virtuais
        boolean threadsVirtuaisHabilitadas = false;
        System.out.println("Threads virtuais ligadas? " + threadsVirtuaisHabilitadas);

        long HoraDeInicio = System.currentTimeMillis();

        Random random = new Random();
        // Cria numeros inteiros aleatorios ate o valor de bound
        Runnable runnable = () -> {
            Integer i = random.nextInt(999999999);
        };

        for(int i = 0; i < 100; i++){
            if(threadsVirtuaisHabilitadas){
                Thread.startVirtualThread(runnable);
            } else {
                // Caso esteja falso usa threads fisicas
                Thread thread = new Thread(runnable);
                thread.start();
            }
        }

        long horaDeFim = System.currentTimeMillis();
        long tempoGasto = horaDeFim - HoraDeInicio;
        System.out.println("Tempo gasto em execucao: " + tempoGasto);
    }
}
