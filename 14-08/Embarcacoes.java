public class Embarcacoes {
    private int ano;
    private String modelo;
    private String marca;
    private int valor;
    

    public Embarcacoes(int ano, String modelo, String marca, int valor) {
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo(){
        return modelo;
    }
    public String setModelo(){
        return modelo;
    }


    public String getMarca(){
        return marca;
    }
    public String setMarca(){
        return marca;
    }


    public int getValor(){
        return valor;
    }
    public int setValor(){
        return valor;
    }



}
