
import java.util.Scanner;

public class testeDeForca {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetCandidatos = new int[LER.nextInt()];
        int[] vetMelhores = new int[5];
        preenchervetor(vetCandidatos);
        ordenarVetor(vetCandidatos);
        vetMelhores = preencherMaior(vetCandidatos, vetMelhores);
        int pontosTotais = somarMaiores(vetMelhores);
        System.out.println(pontosTotais);

    }

    public static int somarMaiores(int[] vetMelhores) {
        int x = 0;
        for (int index = 0; index < vetMelhores.length; index++) {
            x += vetMelhores[index];
        }
        return x;
    }

    public static int[] preencherMaior(int[] vetCandidatos, int[] vetMelhores) {
        for (int i = 0; i < vetMelhores.length; i++) {
            vetMelhores[i] = vetCandidatos[(vetCandidatos.length - vetMelhores.length - 1) + i];
        }
        return vetMelhores;
    }

    public static void preenchervetor(int[] vetCandidatos) {
        for (int i = 0; i < vetCandidatos.length; i++) {
            vetCandidatos[i] = LER.nextInt();
        }
    }

    public static void ordenarVetor(int[] vetCandidatos) {
        if (vetCandidatos.length < 2) {
            return;
        }
        int meio = vetCandidatos.length / 2;
        int[] left = new int[meio];
        int[] right = new int[vetCandidatos.length - meio];
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

    public static void unirVetores(int[] left, int[] right, int[] vetCandidatos) {

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
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
}
