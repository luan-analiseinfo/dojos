package me.fsn.filipe.refactoring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class ContaTest {

    @Test
    public void deve_saber_calcular_a_conta_de_um_carro_de_passeio_ate_meia_hora() {
    	Veiculo veiculo = Veiculo.of("asdf234", "gol", TipoVeiculo.CARRO_PASSEIO);
		final long entrada = new Date(2019, 02, 11, 1, 0).getTime();
    	final long saida = new Date(2019, 02, 11, 1, 30).getTime();
    	Conta conta = new Conta(entrada, saida, veiculo);
    	Double gerarConta = conta.gerarConta();
    	assertEquals(5.0, gerarConta,0);
    }

    @Test
    public void deve_saber_calcular_a_conta_de_um_carro_de_passeio_ate_uma_hora() {
    	Veiculo veiculo = Veiculo.of("asdf234", "gol", TipoVeiculo.CARRO_PASSEIO);
    	final long entrada = new Date(2019, 02, 11, 1, 0).getTime();
    	final long saida = new Date(2019, 02, 11, 1, 59).getTime();
    	Conta conta = new Conta(entrada, saida, veiculo);
    	Double gerarConta = conta.gerarConta();
    	assertEquals(8.0, gerarConta,0);
    }

    @Test
    public void deve_saber_calcular_a_conta_de_um_carro_de_passeio_ate_com_hora_adicional() {
    	Veiculo veiculo = Veiculo.of("asdf234", "gol", TipoVeiculo.CARRO_PASSEIO);
    	final long entrada = new Date(2019, 02, 11, 1, 0).getTime();
    	final long saida = new Date(2019, 02, 11, 5, 0).getTime();
    	Conta conta = new Conta(entrada, saida, veiculo);
    	Double gerarConta = conta.gerarConta();
    	assertEquals(17.0, gerarConta,0);
    }

    @Test
    public void deve_saber_calcular_a_conta_de_um_carro_de_passeio_de_diaria() {
    	Veiculo veiculo = Veiculo.of("asdf234", "gol", TipoVeiculo.CARRO_PASSEIO);
    	final long entrada = new Date(2019, 02, 11, 1, 0).getTime();
    	final long saida = new Date(2019, 02, 11, 8, 0).getTime();
    	Conta conta = new Conta(entrada, saida, veiculo);
    	Double gerarConta = conta.gerarConta();
    	assertEquals(20.0, gerarConta,0);
    }

    @Test
    public void deve_saber_calcular_a_conta_de_uma_caminhonete_ate_meia_hora() {
    	Veiculo veiculo = Veiculo.of("asdf234", "gol", TipoVeiculo.CAMINHONETE);
    	final long entrada = new Date(2019, 02, 11, 1, 0).getTime();
    	final long saida = new Date(2019, 02, 11, 1, 30).getTime();
    	Conta conta = new Conta(entrada, saida, veiculo);
    	Double gerarConta = conta.gerarConta();
    	assertEquals(7.0, gerarConta,0);
    }

    @Test
    public void deve_saber_calcular_a_conta_de_uma_caminhonete_ate_uma_hora() {
    	Veiculo veiculo = Veiculo.of("asdf234", "gol", TipoVeiculo.CAMINHONETE);
    	final long entrada = new Date(2019, 02, 11, 1, 0).getTime();
    	final long saida = new Date(2019, 02, 11, 1, 59).getTime();
    	Conta conta = new Conta(entrada, saida, veiculo);
    	Double gerarConta = conta.gerarConta();
    	assertEquals(10.0, gerarConta,0);
    }

    @Test
    public void deve_saber_calcular_a_conta_de_uma_caminhonete_ate_com_hora_adicional() {
    	Veiculo veiculo = Veiculo.of("asdf234", "gol", TipoVeiculo.CAMINHONETE);
    	final long entrada = new Date(2019, 02, 11, 1, 0).getTime();
    	final long saida = new Date(2019, 02, 11, 4, 0).getTime();
    	Conta conta = new Conta(entrada, saida, veiculo);
    	Double gerarConta = conta.gerarConta();
    	assertEquals(20.0, gerarConta,0);
    }

    @Test
    public void deve_saber_calcular_a_conta_de_uma_caminhonete_de_diaria() {
    	Veiculo veiculo = Veiculo.of("asdf234", "gol", TipoVeiculo.CAMINHONETE);
    	final long entrada = new Date(2019, 02, 11, 1, 0).getTime();
    	final long saida = new Date(2019, 03, 13, 1, 0).getTime();
    	Conta conta = new Conta(entrada, saida, veiculo);
    	Double gerarConta = conta.gerarConta();
    	assertEquals(30.0, gerarConta,0);
    }

}