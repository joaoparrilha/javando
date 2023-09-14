package vetoresEmais;

public class BoxingUnboxing {

    public static void main(String[] args) {

        /* Boxing
         Espaço de memoria no Heap com valor 20 e o obj
         apontando para ele*/
        int x = 20;
        Object obj = x;
        System.out.println(obj);

        /* Unboxing
        * obj apontando para o Heap valor 20,
          cria uma variavel no Stack para o y com o valor de
          obj*/
        int y = (int) obj;
    }
}
