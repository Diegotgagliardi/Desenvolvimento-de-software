
public class Programa {
    public static void main(String[] args) {

        double varDecimal = 10.5;
        Double objDecimal = 10.5;
        String strDecimal = String.valueOf(varDecimal);

        String strNumerica = "100.5";
        double vlrNumerico = Double.parseDouble(strNumerica);

        // char[] vetTexto2 = {'P','r','o','g','r','a','m','a'};
        String objTexto1 = "Programação Java";

        // System.out.println(objTexto1.toUpperCase()); // Maiúsculas
        // System.out.println(objTexto1.replace("r", "="));

        char letra = objTexto1.charAt(5);

        String[] palavras = objTexto1.split(" ");
        String palavra1 = palavras[0];
        String palavra2 = palavras[1];

        // System.out.println(palavra2);

        // Dados bancários dos clintes
        // Nome;CPF;saldo
        String[] registros = { "Paulo;12345;4000",
                "Ana;343435;3400",
                "Carlos;6656;6000" };

        double total = 0;
        for (int i = 0; i < registros.length; i++) {
            String linha = registros[i];
            String[] dados = linha.split(";");
            String nome = dados[0];
            String CPF = dados[1];
            double saldo = Double.parseDouble(dados[2]);
            total += saldo;
            System.out.println("Nome: " + nome + ", Saldo: " + saldo);
        }
        System.out.println("Total: " + total);

    }
}
