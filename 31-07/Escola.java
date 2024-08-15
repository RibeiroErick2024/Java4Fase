import java.util.List;


public class Escola {
    private List<String> alunos;
    private List<String> funcionarios;
    private int notas;

    
    public Escola(List<String> alunos, List<String> funcionarios, int notas) {
        this.alunos = alunos;
        this.funcionarios = funcionarios;
        this.notas = notas;
    }

    
    public List<String> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<String> alunos) {
        this.alunos = alunos;
    }

    public List<String> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<String> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }
}

//loja de veiculos, que tem carros, que tem modelos, 

