
import java.util.LinkedList;
import java.util.Scanner;

public class listaBEE {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        int q = LER.nextInt();
        int s = LER.nextInt();
        preecherLista(lista, s);
        String[] vetLista = new String[lista.size()];
        lista.toArray(vetLista);
        ordenarVetor(vetLista);
        System.out.println(buscarnome(q, vetLista));
    }

    public static void preecherLista(LinkedList<String> lista, int x) {
        for (int index = 0; index < x; index++) {
            lista.add(LER.nextLine());
        }
    }

    public static void ordenarVetor(String[] vetCandidatos) {
        if (vetCandidatos.length < 2) {
            return;
        }
        int meio = vetCandidatos.length / 2;
        String[] left = new String[meio];
        String[] right = new String[vetCandidatos.length - meio];
        for (int i = 0; i < meio; i++) {
            left[i] = vetCandidatos[i];
        }
        for (int i = meio; i < vetCandidatos.length; i++) {
            right[i - meio] = vetCandidatos[i];
        }
        ordenarVetor(left);
        ordenarVetor(right);
        unirVetores(left, right, vetCandidatos);
    }

    public static void unirVetores(String[] left, String[] right, String[] vetCandidatos) {

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].length() <= right[j].length()) {
                vetCandidatos[k++] = left[i++];
            } else {
                vetCandidatos[k++] = right[j++];
            }

        }
        while (i < left.length) {
            vetCandidatos[k++] = left[i++];
        }
        while (j < right.length) {
            vetCandidatos[k++] = right[j++];
        }
    }

    private static String buscarnome(int q, String[] vetLista) {
        String n="";
       for (int i = 0; i < vetLista.length; i++) {
         if (i==q) {
            n=vetLista[q];
         } 
       }
       return  n;
    }
}
