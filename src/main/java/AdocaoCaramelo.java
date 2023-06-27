public class AdocaoCaramelo extends Adocao {

    public String verificarAprovacao() {
        if (this.calcular5PorCentoRendaTotal() >= 150.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }
}
