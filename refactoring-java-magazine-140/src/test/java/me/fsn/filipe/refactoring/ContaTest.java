package me.fsn.filipe.refactoring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.Date;

import org.junit.Test;

public class ContaTest {

    @Test
    public void deve_saber_calcular_a_conta_de_um_carro_de_passeio_ate_meia_hora() {
    	long entrada = new Date(2019, 01, 20, 14, 00).getTime();
    	long saida = new Date(2019, 01, 20, 14, 30).getTime();
    	Veiculo veiculo = new CarroDePasseio();
    	Conta conta = new ContaAteMeiaHora(entrada, saida, veiculo);
    	Double valor = conta.gerarConta();
    	assertEquals(5, valor, 0);
    }

    @Test
    public void deve_saber_calcular_a_conta_de_um_carro_de_passeio_ate_uma_hora() {
        fail("Not yet implemented");
    }

    @Test
    public void deve_saber_calcular_a_conta_de_um_carro_de_passeio_ate_com_hora_adicional() {
        fail("Not yet implemented");
    }

    @Test
    public void deve_saber_calcular_a_conta_de_um_carro_de_passeio_de_diaria() {
        fail("Not yet implemented");
    }

    @Test
    public void deve_saber_calcular_a_conta_de_uma_caminhonete_ate_meia_hora() {
        fail("Not yet implemented");
    }

    @Test
    public void deve_saber_calcular_a_conta_de_uma_caminhonete_ate_uma_hora() {
        fail("Not yet implemented");
    }

    @Test
    public void deve_saber_calcular_a_conta_de_uma_caminhonete_ate_com_hora_adicional() {
        fail("Not yet implemented");
    }

    @Test
    public void deve_saber_calcular_a_conta_de_uma_caminhonete_de_diaria() {
        fail("Not yet implemented");
    }

}