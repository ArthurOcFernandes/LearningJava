public class Metodos {
    public static void main(String[] args) {
        TreinoTático t1 = new TreinoTático();
        t1.setTabuleiro(true);
        t1.setPeças(false);
        t1.setLivro(true);
        t1.setEngine(true);
        t1.setQualLivro("Duelos de xadrez");
        t1.setJogadorModelo("Yasser Seirawan");

        t1.status();
        t1.getQualLivro();
    }
}
