public class Jetski extends Embarcacoes {
    private int potencia;
    public Jetski(int ano, String modelo, String marca, int valor, int potencia) {
        super(ano, modelo, marca, valor);
        this.potencia = potencia;
    }
    public int getpotencia() {
        return potencia;
    }

    public void setpotencia(int potencia) {
        this.potencia = potencia;
    }


}