
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
                if (checkIfUpper(vetCh) == false) {
                    vetCh[j++] = Character.toUpperCase(vetCh[j]);
                } else {
                    checkIfLower(vetCh);
                    if (checkIfLower(vetCh) == true) {
                        vetCh[j] = Character.toLowerCase(vetCh[j]);
                    }
                }

                x += vetCh;
            }
            veString[i] = x;
        }
        return veString;
    }

    public static boolean checkIfUpper(char[] vetCh) {
        boolean Uc = false;
        for (int i = 0; i < vetCh.length; i++) {

            if (Character.isUpperCase(vetCh[i])) {
                return Uc = true;
            }
        }
        return Uc;
    }

    public static boolean checkIfLower(char[] vetCh) {
        boolean Lc = false;

        for (int i = 0; i < vetCh.length; i++) {
            if (Character.isLowerCase(vetCh[i])) {
                return Lc = true;
            }
        }
        return Lc;
    }
}
