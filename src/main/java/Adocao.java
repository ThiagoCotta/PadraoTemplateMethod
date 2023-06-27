public abstract class Adocao {

    protected String nome;
    private Familia familia;
    public String getNome() {
        return nome;
    }

    public void setNomeResponsavel(String nome) {
        this.nome = nome;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public double calcular5PorCentoRendaTotal() {
        double rendaTotal = 0.0;
        for (Pessoa pessoa : this.familia.pessoas) {
            rendaTotal += pessoa.getSalario();
        }
        double resultado = rendaTotal * 5 / 100;
        return resultado;
    }

    public abstract String verificarAprovacao();

    public String getTipo() {
        return "Adocao";
    }

    public String getInfo() {
        return getTipo() + "{" +
                " responsavel ='" + this.nome + '\'' +
                ", resultado =" + this.verificarAprovacao() +
                '}';
    }
}
