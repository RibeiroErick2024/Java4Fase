public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    
    
    public Funcionario(String nome, int idade, String Cargo) {
        this.nome = nome;
        this.idade = idade;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", idade=" + idade + ", cargo=" + cargo + "]";
    }
}
