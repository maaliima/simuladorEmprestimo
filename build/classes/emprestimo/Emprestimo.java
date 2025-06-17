package emprestimo;

public class Emprestimo {
    private float valorTotal;
    private float taxaMensal;
    private int tempoMeses;

    public Emprestimo(float valorTotal, float taxaMensal, int tempoMeses) {
        this.valorTotal = valorTotal;
        this.taxaMensal = taxaMensal / 100.0F;
        this.tempoMeses = tempoMeses;
    }

    public float calcularPrestacao() {
        if (this.getTaxaMensal() == 0.0F) {
            return this.getValorTotal() / (float) this.getTempoMeses();
        } else {
            float fator = this.elevar(1.0F + this.getTaxaMensal(), this.getTempoMeses());
            return this.getValorTotal() * this.getTaxaMensal() * fator / (fator - 1.0F);
        }
    }

    public float calcularValorTotalPago() {
        return calcularPrestacao() * tempoMeses;
    }

    public float calcularTotalJuros() {
        return calcularValorTotalPago() - valorTotal;
    }

    public float calcularValorSemJuros() {
        return valorTotal;
    }

    private float elevar(float base, int expoente) {
        float resultado = 1.0F;
        for (int i = 0; i < expoente; ++i) {
            resultado *= base;
        }
        return resultado;
    }

    public float getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getTaxaMensal() {
        return this.taxaMensal;
    }

    public void setTaxaMensal(float taxaMensal) {
        this.taxaMensal = taxaMensal / 100.0F;
    }

    public int getTempoMeses() {
        return this.tempoMeses;
    }

    public void setTempoMeses(int tempoMeses) {
        this.tempoMeses = tempoMeses;
    }
}