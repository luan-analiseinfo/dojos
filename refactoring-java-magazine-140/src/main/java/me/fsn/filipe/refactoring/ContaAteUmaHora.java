package me.fsn.filipe.refactoring;

public class ContaAteUmaHora  extends Conta{

	public ContaAteUmaHora(long entrada, long saida, Veiculo veiculo) {
		super(entrada, saida, veiculo);
	}

	@Override
	protected double calcularContaDeUtilizacao(long periodoEmMinutos) {
		return getVeiculo().tarifaAteUmaHora();
	}

}
