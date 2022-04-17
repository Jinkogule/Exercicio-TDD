package pagamento;



public class Pagamento {

	private double valor_pago;
	private String data;
	private String tipo_de_pagamento;

	
	public Pagamento(double valor_pago, String data, String tipo_de_pagamento) {
		super();
		this.valor_pago = valor_pago;
		this.data = data;
		this.tipo_de_pagamento = tipo_de_pagamento;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getValor_pago() {
		return valor_pago;
	}
	public void setValor_pago(double valor_pago) {
		this.valor_pago = valor_pago;
	}
	
	public String getTipo_de_pagamento() {
		return tipo_de_pagamento;
	}
	public void setTipo_de_pagamento(String tipo_de_pagamento) {
		this.tipo_de_pagamento = tipo_de_pagamento;
	}
	
}