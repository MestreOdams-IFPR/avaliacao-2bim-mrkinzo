
import java.util.Scanner;

public class dancinSentence {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        String Sentence = LER.nextLine();
        String veString[] = Sentence.split(" ");
        veString=transformTheSentence(veString);
        Sentence=unirVtString(veString);
        System.out.println(Sentence);
            }
        
            public  static String unirVtString(String[] veString) {
                String Assembly=String.join(" ", veString);
                return Assembly;
            }
        
            public static String[] transformTheSentence(String[] veString) {
        for (int i = 0; i < veString.length; i++) {
            char[] vetCh = veString[i].toCharArray();
            for (int j = 0; j < vetCh.length; j++) {
                boolean firtCharUCase=checkIfUpper(vetCh);
                if (firtCharUCase!=true) {
                    vetCh[j++]=Character.toUpperCase(vetCh[j++]);
                }
            }
            veString[i]=String.copyValueOf(vetCh);
        }
        return veString;
    }

    public  static boolean  checkIfUpper(char[] vetCh) {
        boolean Uc=false;
     Character ch = vetCh[0];
        if (ch.isUpperCase(vetCh[0])) {
            return Uc=true;
        }
        return  Uc;
    }
}
