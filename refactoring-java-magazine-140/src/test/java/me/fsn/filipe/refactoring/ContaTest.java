package me.fsn.filipe.refactoring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
    	long entrada = new Date(2019, 01, 20, 14, 00).getTime();
    	long saida = new Date(2019, 01, 20, 14, 39).getTime();
    	Veiculo veiculo = new CarroDePasseio();
    	Conta conta = new ContaAteUmaHora(entrada, saida, veiculo);
    	Double valor = conta.gerarConta();
    	assertEquals(8, valor, 0);
    }

    @Test
    public void deve_saber_calcular_a_conta_de_um_carro_de_passeio_ate_com_hora_adicional() {
    	long entrada = new Date(2019, 01, 20, 14, 00).getTime();
    	long saida = new Date(2019, 01, 20, 17, 39).getTime();
    	Veiculo veiculo = new CarroDePasseio();
    	Conta conta = new ContaHoraAdicional(entrada, saida, veiculo);
    	Double valor = conta.gerarConta();
    	assertEquals(17, valor, 0);
    	System.out.println(valor);
    }

    @Test
    public void deve_saber_calcular_a_conta_de_um_carro_de_passeio_de_diaria() {
    	long entrada = new Date(2019, 01, 20, 06, 00).getTime();
    	long saida = new Date(2019, 01, 21, 12, 01).getTime();
    	Veiculo veiculo = new CarroDePasseio();
    	Conta conta = new ContaDiaria(entrada, saida, veiculo);
    	Double valor = conta.gerarConta();
    	assertEquals(20, valor, 0);
    	System.out.println(valor);
    }

    @Test
    public void deve_saber_calcular_a_conta_de_uma_caminhonete_ate_meia_hora() {
    	long entrada = new Date(2019, 01, 20, 14, 00).getTime();
    	long saida = new Date(2019, 01, 20, 14, 30).getTime();
    	Veiculo veiculo = new Caminhonete();
    	Conta conta = new ContaAteMeiaHora(entrada, saida, veiculo);
    	Double valor = conta.gerarConta();
    	assertEquals(7, valor, 0);
    }

    @Test
    public void deve_saber_calcular_a_conta_de_uma_caminhonete_ate_uma_hora() {
    	long entrada = new Date(2019, 01, 20, 14, 00).getTime();
    	long saida = new Date(2019, 01, 20, 14, 39).getTime();
    	Veiculo veiculo = new Caminhonete();
    	Conta conta = new ContaAteUmaHora(entrada, saida, veiculo);
    	Double valor = conta.gerarConta();
    	assertEquals(10, valor, 0);
    }

    @Test
    public void deve_saber_calcular_a_conta_de_uma_caminhonete_ate_com_hora_adicional() {
    	long entrada = new Date(2019, 01, 20, 14, 00).getTime();
    	long saida = new Date(2019, 01, 20, 17, 39).getTime();
    	Veiculo veiculo = new Caminhonete();
    	Conta conta = new ContaHoraAdicional(entrada, saida, veiculo);
    	Double valor = conta.gerarConta();
    	assertEquals(25, valor, 0);
    }

    @Test
    public void deve_saber_calcular_a_conta_de_uma_caminhonete_de_diaria() {
    	long entrada = new Date(2019, 01, 20, 06, 00).getTime();
    	long saida = new Date(2019, 01, 21, 12, 01).getTime();
    	Veiculo veiculo = new Caminhonete();
    	Conta conta = new ContaDiaria(entrada, saida, veiculo);
    	Double valor = conta.gerarConta();
    	assertEquals(30, valor, 0);

    }

}