public class POOintroduction {
    public static void main(String[] args) {
        var batata = new Legumes();
        batata.setNome("Batata");

        var cenoura = new Legumes();

        cenoura.setNome("Cenoura");
        System.out.println(batata.getNome());
        System.out.println(cenoura.getNome());
    }

    public static class Legumes {

        private String nome;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;

        }

    }

    public static class Fruta {
        private String nome;
    }

    public static class Verdura {
        private String nome;
    }

    public static class Tempero {
        private String nome;
    }

    public static class Carne {
        private String nome;

    }

}
