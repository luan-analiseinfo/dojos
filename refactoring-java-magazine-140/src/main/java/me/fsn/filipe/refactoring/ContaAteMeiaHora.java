package me.fsn.filipe.refactoring;

public class ContaAteMeiaHora  extends Conta{

	public ContaAteMeiaHora(long entrada, long saida, Veiculo veiculo) {
		super(entrada, saida, veiculo);
	}

	@Override
	protected double calcularContaDeUtilizacao(long periodoEmMinutos) {
		if (periodoEmMinutos <= 30) {
			return getVeiculo().tarifaAteMeiaHora();
		}
		throw new IllegalArgumentException("Incapaz de calcular a tarifa");
	}

}
