package topicosBasicos;

public class FuncoesString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ADC adc DEFG  ";
        System.out.println(original);

        // Formatar
        String s01 = original.toLowerCase();
        System.out.println(s01);

        String s02 = original.toUpperCase();
        System.out.println(s02);

        String s03 = original.trim();
        System.out.println(s03);

        // Recortar
        String s04 = original.substring(2);
        System.out.println(s04);

        String s05 = original.substring(2,9);
        System.out.println(s05);

        // Substituir
        String s06 = original.replace('a', 'x');
        System.out.println(s06);

        String s07 = original.replace("abc", "xy");
        System.out.println(s07);

        // Buscar
        int s08 = original.indexOf("bc");
        System.out.println(s08);

        int s09 = original.lastIndexOf("bc");
        System.out.println(s09);

        // Split
        String s = "potato apple lemon";

        String [] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

    }
}
