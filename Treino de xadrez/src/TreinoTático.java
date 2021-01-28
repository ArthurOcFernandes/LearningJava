public class TreinoTático {
    private boolean tabuleiro;
    private boolean peças;
    private boolean livro;
    private String qualLivro;
    private boolean engine;
    private String jogadorModelo;

    public boolean isTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(boolean tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public boolean isPeças() {
        return peças;
    }

    public void setPeças(boolean peças) {
        this.peças = peças;
    }

    public boolean isLivro() {
        return livro;
    }

    public void setLivro(boolean livro) {
        this.livro = livro;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void getQualLivro() {
        if (livro == true) {
            System.out.println("Livro: " + qualLivro);
        } else {
            System.out.println("Nenhum livro está sendo usado");
        }
    }

    public void setQualLivro(String qualLivro) {
        this.qualLivro = qualLivro;
    }

    public String getJogadorModelo() {
        return jogadorModelo;
    }

    public void setJogadorModelo(String jogadorModelo) {
        this.jogadorModelo = jogadorModelo;
    }

    public void status() {
        System.out.println("Distribuição do treino:");
        if (tabuleiro == true) {
            System.out.println("Usarei tabuleiro");
            if (peças == true) {
                System.out.println("Usarei peças");
            } else {
                System.out.println("Farei o treino às cegas.");
            }
        } else {
            System.out.println("Não usaremos tabuleiro nem peças");
        }
        getQualLivro();
        System.out.println("Jogador modelo: " + this.getJogadorModelo());
        if (engine == true) {
            System.out.println("Usarei engine");
        } else {
            System.out.println("Não usarei engine");
        }
    }
}
