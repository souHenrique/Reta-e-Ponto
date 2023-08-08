public class Reta {
    private Pontos pontoA;
    private Pontos pontoB;
    public Reta(Pontos pontoA, Pontos pontoB) {
        this.pontoA = pontoA;
        this.pontoB = pontoB;
    }
    public double TamanhoReta() {
        double deltaX = pontoB.definirX() - pontoA.definirX();
        double deltaY = pontoB.definirY() - pontoA.definirY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
