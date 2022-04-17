package testes;

import java.util.ArrayList;

import fatura.Fatura;
import boleto.Boleto;
import boleto.ProcessadorDeBoletos;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class ProcessadorDeBoletosTeste {
        Fatura fatura = new Fatura("14/04/2022", 1500.0, "Lucas Pimenta");
		
        ArrayList<Boleto> lista_de_boletos1 = new ArrayList<Boleto>();
	
	@Test
	public void teste_pago_com_3() {
            assertEquals(ProcessadorDeBoletos.processa_boletos(), "Fatura PAGA com 3 pagamentos do tipo BOLETO");
	}
        
        @Test
	public void teste_pago_com_1() {
            assertEquals(ProcessadorDeBoletos.processa_boletos(), "Fatura PAGA com 3 pagamentos do tipo BOLETO");
	}
        
        @Test
	public void teste_pendente_com_2() {
            assertEquals(ProcessadorDeBoletos.processa_boletos(), "Fatura PAGA com 3 pagamentos do tipo BOLETO");
	}
        
        @Test
	public void teste_pendente_com_5() {
            assertEquals(ProcessadorDeBoletos.processa_boletos(), "Fatura PAGA com 3 pagamentos do tipo BOLETO");
	}
	
	public static void main(String[] args) {
		
		
		
		
		
	}
}
