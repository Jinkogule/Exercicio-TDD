package boleto;

import fatura.Fatura;
import java.util.ArrayList;
import pagamento.Pagamento;

public class ProcessadorDeBoletos {
    public static String processa_boletos(ArrayList<Boleto> lista_de_boletos, Fatura fatura, String data_atual, String tipo_pagamento) {
        double valor_total_pago = 0;
        ArrayList<Pagamento> lista_de_pagamentos = new ArrayList<>();

        for (int i=0; i<lista_de_boletos.size(); i++) {
            lista_de_pagamentos.add(new Pagamento(lista_de_boletos.get(i).getValor_pago(), data_atual, tipo_pagamento));
            valor_total_pago += lista_de_pagamentos.get(i).getValor_pago();
        }

        if (valor_total_pago >= fatura.getValor_total()) {
            fatura.setSituacao("PAGA");
        }
        return "Fatura "+fatura.getSituacao()+" com "+lista_de_pagamentos.size()+" pagamentos do tipo "+tipo_pagamento;
    }
}
