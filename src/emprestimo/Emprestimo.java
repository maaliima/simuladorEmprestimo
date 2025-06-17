
package emprestimo;
public class Emprestimo {

    private float valorTotal;
    private float taxaMensal;
    private int tempoMeses;

    public Emprestimo(float valorTotal, float taxaMensal, int tempoMeses) {
        this.valorTotal = valorTotal;
        this.taxaMensal = taxaMensal / 100;
        this.tempoMeses = tempoMeses;
    }

    public float calcularPrestacao() {
        if (    getTaxaMensal() == 0) {
            return      getValorTotal() / getTempoMeses();
        }

        float fator = elevar(1 + getTaxaMensal(), getTempoMeses());
        return  getValorTotal() * getTaxaMensal() * fator / (fator - 1);
    }

    private float elevar(float base, int expoente) {
        float resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    /**
     * @return the valorTotal
     */
    public float getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the taxaMensal
     */
    public float getTaxaMensal() {
        return taxaMensal;
    }

    /**
     * @param taxaMensal the taxaMensal to set
     */
    public void setTaxaMensal(float taxaMensal) {
        this.taxaMensal = taxaMensal;
    }

    /**
     * @return the tempoMeses
     */
    public int getTempoMeses() {
        return tempoMeses;
    }

    /**
     * @param tempoMeses the tempoMeses to set
     */
    public void setTempoMeses(int tempoMeses) {
        this.tempoMeses = tempoMeses;
    }
    
}
