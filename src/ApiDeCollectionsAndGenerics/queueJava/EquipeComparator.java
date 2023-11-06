package ApiDeCollectionsAndGenerics.queueJava;

import java.util.Comparator;

/*
 * Ordena por uma determinada prioridade e não por first in first out
 */
public class EquipeComparator  implements Comparator<Equipe> {

    @Override
    public int compare(Equipe equipe01, Equipe equipe02) {
        if(equipe01.saldoDePontos < equipe02.saldoDePontos){
            return 1;
        } else if(equipe01.saldoDePontos > equipe02.saldoDePontos) {
            return -1;
        }
        return 0;
    }
}
