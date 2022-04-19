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
	
        Boleto boleto1 = new Boleto("Conta de Luz", "14/04/2022", 600.0);
        Boleto boleto2 = new Boleto("Conta de Água", "14/04/2022", 200.0);
        Boleto boleto3 = new Boleto("Conta de Telefone", "14/04/2022", 1000.0);
        Boleto boleto4 = new Boleto("Internet", "14/04/2022", 1501.0);
        Boleto boleto5 = new Boleto("Assinatura de TV", "14/04/2022", 1000.0);
        
        Fatura fatura2 = new Fatura("14/04/2022", 2000.0, "Lucas Pimenta");
        Boleto boleto6 = new Boleto("Bicicleta", "14/04/2022", 500.0);
        Boleto boleto7 = new Boleto("Ventilador", "14/04/2022", 400.0);
        
	@Test
	public void teste_pago_com_3() {
            lista_de_boletos1.add(boleto1);
            lista_de_boletos1.add(boleto2);
            lista_de_boletos1.add(boleto3);
            
            assertEquals(ProcessadorDeBoletos.processa_boletos(lista_de_boletos1, fatura, "17/04/2022", "BOLETO"), "Fatura PAGA com 3 pagamentos do tipo BOLETO");
        }
        
        @Test
	public void teste_pago_com_1() {
            lista_de_boletos1.add(boleto4);
            
            assertEquals(ProcessadorDeBoletos.processa_boletos(lista_de_boletos1, fatura, "17/04/2022", "BOLETO"), "Fatura PAGA com 1 pagamentos do tipo BOLETO");
	}
        
        @Test
	public void teste_pendente_com_2() {
            
            lista_de_boletos1.add(boleto1);
            lista_de_boletos1.add(boleto2);
            
            assertEquals(ProcessadorDeBoletos.processa_boletos(lista_de_boletos1, fatura, "17/04/2022", "BOLETO"), "Fatura PENDENTE com 2 pagamentos do tipo BOLETO");
	}
        
        @Test
	public void teste_pendente_com_5() {
            lista_de_boletos1.add(boleto2);
            lista_de_boletos1.add(boleto2);
            lista_de_boletos1.add(boleto2);
            lista_de_boletos1.add(boleto2);
            lista_de_boletos1.add(boleto2);
            
            assertEquals(ProcessadorDeBoletos.processa_boletos(lista_de_boletos1, fatura, "17/04/2022", "BOLETO"), "Fatura PENDENTE com 5 pagamentos do tipo BOLETO");
	}
	
        @Test
	public void teste_pendente_com_2_exemplo_do_enunciado() {
            lista_de_boletos1.add(boleto6);
            lista_de_boletos1.add(boleto7);
            
            assertEquals(ProcessadorDeBoletos.processa_boletos(lista_de_boletos1, fatura, "17/04/2022", "BOLETO"), "Fatura PENDENTE com 2 pagamentos do tipo BOLETO");
	}
	public static void main(String[] args) {	
	}
}
