package me.fsn.filipe.refactoring;

public class ContaAteUmaHora  extends Conta{

	public ContaAteUmaHora(long entrada, long saida, Veiculo veiculo) {
		super(entrada, saida, veiculo);
	}

	@Override
	protected double calcularContaDeUtilizacao(long periodoEmMinutos) {
		if (periodoEmMinutos > 30 && periodoEmMinutos <= 60 ) {
			return getVeiculo().tarifaAteUmaHora();
		}
		throw new IllegalArgumentException("Periodo inválido");
	}

}
