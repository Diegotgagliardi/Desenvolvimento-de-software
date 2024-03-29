
public class Pessoa {

    private String nome;
    private int idade;

    public void setNome(String nParam) {
        nome = nParam;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa() {

    }

    public Pessoa(String nParam) {
        nome = nParam;
    }

    public Pessoa(String nParam, int iParam) {
        nome = nParam;
        idade = iParam;
    }

    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }

}
