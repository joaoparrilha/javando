package vetoresEmais;

public class Wrapper {
    public static void main(String[] args) {

        // Wrapper aceita o valor nulo, tipos primitivos não
        int x = 20;
        Integer obj = x;
        System.out.println(obj);

        // Faz o casting não ser necessário de Objeto -> variável
        int y = obj;
        System.out.println(y);

        /*
        * Todos são Object
        *   Number:
        *       Byte;
        *       Short;
        *       Integer;
        *       Long;
        *       Float;
        *       Double.
        *   Boolean;
        *   Char;
        * */
    }
}
