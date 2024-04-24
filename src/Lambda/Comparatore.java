package Lambda;

import java.util.Comparator;

public class Comparatore implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        //01==o2 restituisce 0
        //se o2 viene prima di o1, restituisce un numero negativo
        //se o1 viene prima di o2, restituisce un numero positivo
        return o2.compareTo(o1);
    }
}
