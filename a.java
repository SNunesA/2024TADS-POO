
// Uma imagem é formada por pixels. Considere uma imagem com dimensão de 40 x 40 e faça uma classe que contenha um array bidimensional com essas dimensões. A seguir, para cada posição desse array bidimensional armazene um valor aleatório entre 0 e 255 (esses valores correspondem às tonalidades aplicadas sobre a imagem). Apresente em tela os 1600 valores gerados.
import java.util.Random;

public class a {
    public static void main(String[] args) {
        int[][] pixels = new int[40][40];
        Random random = new Random();
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                pixels[i][j] = random.nextInt(256); // Gera um número aleatório entre 0 e 255
            }
        }
        System.out.println("Valores dos pixels da imagem:");
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                System.out.print(pixels[i][j] + " ");
            }
            System.out.println();
        }
    }
}
