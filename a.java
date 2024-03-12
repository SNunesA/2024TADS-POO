// Crie uma classe que receba o valor de um produto e a porcentagem de desconto, calcule e mostre o valor do desconto e o valor do produto com o desconto.

// Observação: o valor do desconto é calculado por meio da fórmula: valor do desconto = valor do produto * percentual de desconto / 100.
import java.util.*;
public class a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float produto;
        int porc;
        System.out.println("Escreva o valor do produto");
        produto=in.nextFloat();
        System.out.println("Escreva o valor da porcentagem de desconto");
        porc=in.nextInt();
        float desc = produto * porc/100;
        System.out.println("Valor do desconto:"+desc);
        System.out.println("Valor do produto com desconto:"+(produto-desc));
        in.close();
    }
}
