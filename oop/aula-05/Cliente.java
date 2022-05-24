public class Cliente {
    private Integer numero;
    private String nome;
    private Double divida;

    public Cliente(Integer numeroCliente, String nomeCliente, Double dividaCliente) {
        this.numero = numeroCliente;
        this.nome = nomeCliente;
        this.divida = dividaCliente;
    }

    public Integer getNumero() {
        return numero;
    };
    public void setNumero(Integer numeroCliente) {
        this.numero = numeroCliente;
    }
    public String getNome() {
        return nome;
    };
    public void setNome(String nomeCliente) {
        this.nome = nomeCliente;
    };
    public Double getDivida() {
        return divida;
    };
    protected void setDivida(Double dividaCliente) {
        this.divida = dividaCliente;
    };
    public void pagar(Double valor) {
        this.divida -= valor;
    };
    public void receber(Double valor) {
        this.divida += valor;
    };
}