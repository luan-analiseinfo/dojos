package me.fsn.filipe.refactoring;

public class ContaHoraAdicional  extends Conta{

	public ContaHoraAdicional(long entrada, long saida, Veiculo veiculo) {
		super(entrada, saida, veiculo);
	}

	@Override
	protected double calcularContaDeUtilizacao(long periodoEmMinutos) {
		long horasAdicionais = (periodoEmMinutos -1)/60;
		return horasAdicionais * getVeiculo().tarifaHoraAdicional() + getVeiculo().tarifaAteUmaHora();
	}

}
