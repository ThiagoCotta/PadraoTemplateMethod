public class AdocaoRetriever extends Adocao {

    public String verificarAprovacao() {
        if (this.calcular5PorCentoRendaTotal() >= 300.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }
}
