
import java.util.Scanner;

class Console {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // for (int i = 0; i < 100; i++) {
        // // System.out.println("Número " + i);
        // System.out.printf("Número %d%n", i);
        // }

        String[] letras = new String[] { "A", "B", "C", "D" };
        String letraB = letras[1];

        for (String letra : letras) {
            System.out.println("Letra: " + letra);
        }

        // int contador = 0;
        // while(contador < letras.length){
        // String letra = letras[contador];
        // System.out.println("Letra: " + letra);
        // contador++;
        // }

        // for(int i = 0; i < letras.length; i++){
        // String letra = letras[i];
        // System.out.println("Letra: " + letra);
        // }

        // System.out.println("Digite a nota A");
        // double a = leitor.nextDouble();

        // System.out.println("Digite a nota B");
        // double b = leitor.nextDouble();

        // double resultado = (a + b) / 2;

        // if (resultado >= 6) {
        // System.out.println("Aprovado!");
        // } else if (resultado > 1) {
        // System.out.println("Recuperação!");
        // } else {
        // System.out.println("Reprovado!");
        // }

        // System.out.println("Resultado: " + resultado);

        // System.out.println("Digite um texto: ");
        // String mensagem = leitor.nextLine();
        // System.out.println(mensagem);

        leitor.close();

    }

}
