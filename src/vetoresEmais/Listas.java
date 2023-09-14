package vetoresEmais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

    public static void main(String[] args) {

        // usar wrapper class
        List<String> list = new ArrayList<>();
        // adicionando valores a lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        // add em index especifico
        list.add(2, "Marco");

        // tamanho da lista
        System.out.println(list.size());

        // tirar dado da lista pelo valor do dado ou posição
        //list.remove("Anna");
        //list.remove(1);
        // tirando pelo predicado (LAMBDA)
        list.removeIf(x -> x.charAt(0) == 'M');

        //encontrar posicao de elemento, se nao encontrar retorna -1
        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        //Filtrando lista com .stream().filter().collect(Collectors.toList())
        List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        // procurando primeiro elemento que obedece ao predicado de busca
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

        for (String nome: result){
            System.out.println(nome);

        }

        for (String nome : list){
            System.out.println(nome);
        }


    }
}
