package fatura;



public class Fatura {

	private String data;
	private double valor_total;
	private String nome_cliente;
	private String situacao;

	
	public Fatura(String data, double valor_total, String nome_cliente) {
		super();
		this.data = data;
		this.valor_total = valor_total;
		this.nome_cliente = nome_cliente;
		this.situacao = "PENDENTE";
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
}