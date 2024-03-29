
public class Programa {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Ana");
        // pessoa1.nome = "Ana";

        Pessoa pessoa2 = new Pessoa("Pedro", 26);
        // pessoa2.nome = "Pedro";

        Pessoa pessoa3 = new Pessoa();
        // pessoa3.nome = "Carlos";
        pessoa3.setNome("Carlos");

        // Relatório
        // System.out.println("Nome 1: " + pessoa1.getNome());
        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);

    }

    public static void main3(String[] args) {

        Bike minhaBike = new Bike();
        minhaBike.marca = "Caloi";
        minhaBike.marchaAtual++;

        Bike suaBike = new Bike();
        suaBike.marca = "Oggi";
        // suaBike.marchaAtual = 3;
        suaBike.trocarDeMarcha(3);

        // Uso da calculadora como biblioteca
        int res = Calculadora.somar(10, 5);

        // Uso da calculadora como classe/objeto
        // Calculadora calculadora = new Calculadora();
        // int res = calculadora.somar(10, 5);
    }

    public static void outroMain(String[] args) {

        String texto1 = "100";
        String texto2 = "50";

        // Concatenação 10050
        String resTexto = texto1 + texto2;
        System.out.println("Texto: " + resTexto);

        // Conversão de texto para inteiro
        Integer num1 = Integer.parseInt(texto1);
        int num2 = Integer.parseInt(texto2);

        // Operação aritmética de soma 150
        int resNum = num1 + num2;

        System.out.println("Número: " + resNum);

        double decimal1 = 10.5;
        Double decimal2 = 10.6;

        // Soma 21.1
        double resDec = decimal1 + decimal2;
        System.out.println("Resultado decimal: " + resDec);

        int resInteiro = (int) decimal1 + decimal2.intValue();
        System.out.println("Resultado inteiro: " + resInteiro);

    }

    public static void oldMain(String[] args) {

        // Tipos básicos (um aluno)
        String matricula;
        String nome;
        double nota1;
        double nota2;

        // Vetores (5 alunos)
        String[] matriculas = new String[5];
        String[] nomes = new String[5];
        double[] notas1 = new double[5];
        double[] notas2 = new double[5];

        // Classes (structs)
        Aluno a1 = new Aluno();
        a1.matricula = "A";
        a1.nome = "Nome 1";
        a1.nota1 = 7;
        a1.nota2 = 8;

        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();

    }
}
