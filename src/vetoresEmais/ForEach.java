package vetoresEmais;

public class ForEach {
    public static void main(String[] args) {

        String[] vect = new String[] {
                "Maria", "Bob", "Alex"
        };

        // "para cada objeto name, contido no vect faça..."
        for (String nome : vect){
            System.out.println(nome);
        }


    }
}
