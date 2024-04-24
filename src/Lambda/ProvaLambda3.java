package Lambda;

import java.util.TreeSet;

public class ProvaLambda3 {
    public static void main(String[] args) {
        TreeSet<String> parole = new TreeSet<>((s1,s2)->(s2.compareTo(s1)));

        parole.add("java");
        parole.add("html");
        parole.add("css");
        parole.add("javascript");

        //stampa di tutti gli elementi del Treeset
        parole.forEach(p-> System.out.println(p));

        //equivalente a prima
        for(String s:parole){
            System.out.println(s);
        }

        //il metodo removeIf accetta una espressione lambda nella quale inseriamo la condizione per la quale
        //rimuovere una parola nel Treeset
        parole.removeIf(s -> s.contains("j"));


        //rimuove solo le parole con lunghezza pari
        parole.removeIf(s -> {if(s.length()%2==0)
                                return true;
                               else
                                return false;});

        parole.forEach(s -> System.out.println(s));



    }
}
