public class Iate extends Embarcacoes {
    private int pes;
    public Iate(int ano, String modelo, String marca, int valor, int pes) {
        super(ano, modelo, marca, valor);
        this.pes = pes;
    }
    public int getPes() {
        return pes;
    }

    public void setpes(int pes) {
        this.pes = pes;
    }



}