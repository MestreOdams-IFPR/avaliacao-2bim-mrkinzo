
import java.util.Scanner;

public class cristal {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        while (LER.hasNext()) {
            int qtdCrista = LER.nextInt();
            int Querry = LER.nextInt();
            int[] vetLoc = new int[qtdCrista];
            preenchervetor(vetLoc);
            ordenarVetor(vetLoc);
            int coord = encontrarCristal(vetLoc, Querry);
        }
    }

    public static int encontrarCristal(int[] vetLoc, int Querry) {
        int loc = 0;
        for (int index = 0; index < vetLoc.length; index++) {
            if (vetLoc[index] == Querry) {
                loc = index;
            }
        }
        return loc;
    }

    public static void preenchervetor(int[] vetLoc) {
        for (int i = 0; i < vetLoc.length; i++) {
            vetLoc[i] = LER.nextInt();
        }
    }

    public static void ordenarVetor(int[] vetLoc) {
        if (vetLoc.length < 2) {
            return;
        }
        int meio = vetLoc.length / 2;
        int[] left = new int[meio];
        int[] right = new int[vetLoc.length - meio];
        for (int i = 0; i < meio; i++) {
            left[i] = vetLoc[i];
        }
        for (int i = meio; i < vetLoc.length; i++) {
            right[i - meio] = vetLoc[i];
        }
        ordenarVetor(left);
        ordenarVetor(right);
        unirVetores(left, right, vetLoc);
    }

    public static void unirVetores(int[] left, int[] right, int[] vetLoc) {

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                vetLoc[k++] = left[i++];
            } else {
                vetLoc[k++] = right[j++];
            }

        }
        while (i < left.length) {
            vetLoc[k++] = left[i++];
        }
        while (j < right.length) {
            vetLoc[k++] = right[j++];
        }
    }
}
