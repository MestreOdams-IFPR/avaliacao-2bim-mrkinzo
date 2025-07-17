
import java.util.Scanner;

public class dancinSentence {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        String Sentence = LER.nextLine();
        String veString[] = Sentence.split(" ");

        veString = transformTheSentence(veString);

        Sentence = unirVtString(veString);
        System.out.println(Sentence);
    }

    public static String unirVtString(String[] veString) {
        String Assembly = String.join(" ", veString);
        return Assembly;
    }

    public static String[] transformTheSentence(String[] veString) {
        String x = "";
        for (int i = 0; i < veString.length - 1; i++) {
            char[] vetCh = veString[i].toCharArray();
            for (int j = 0; j < vetCh.length; j++) {
                if (Character.isLetter(vetCh[j]) && Character.isLowerCase(vetCh[j])) {
                    Character.toUpperCase(vetCh[j]);
                }

                x += vetCh;
            }
            veString[i] = x;
        }
        return veString;
    }

}
