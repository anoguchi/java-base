package ApiDeCollectionsAndGenerics.ListJava;

import java.util.Vector;

public class VectorListCollections {
    public static void main(String[] args) {

        /*
        Tambem muito semelhante ao Arraylist mas é mais thread safe
        Alocacao dinamica -> aumenta 100% o tamanho quando esta cheia
        */

        Vector<Integer> meuVector = new Vector<>();

        for(int i = 20; i <= 30; i++){
            meuVector.add(i);
            System.out.println(i);
        }

        System.out.println(meuVector);

        // acessando um indice especifico
        System.out.println(meuVector.elementAt(1));

        System.out.println(meuVector.firstElement());

        meuVector.add(31);

        System.out.println(meuVector);


    }
}
