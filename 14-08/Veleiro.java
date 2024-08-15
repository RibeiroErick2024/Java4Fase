
public class Veleiro extends Embarcacoes {
    private int numMastros;

    public Veleiro(int ano, String modelo, String marca, int valor, int numMastros) {
        super(ano, modelo, marca, valor);
        this.numMastros = numMastros;
    }
    public int getNumMastros() {
        return numMastros;
    }

    public void setNumMastros(int numMastros) {
        this.numMastros = numMastros;
    }
}