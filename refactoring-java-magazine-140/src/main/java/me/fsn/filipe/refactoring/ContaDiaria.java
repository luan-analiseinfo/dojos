package me.fsn.filipe.refactoring;

public class ContaDiaria  extends Conta{

	public ContaDiaria(long entrada, long saida, Veiculo veiculo) {
		super(entrada, saida, veiculo);
	}

	@Override
	protected double calcularContaDeUtilizacao(long periodoEmMinutos) {
		final int DIARIA_MINIMA_EM_MINUTOS = 6 * 60;
		if (periodoEmMinutos >  DIARIA_MINIMA_EM_MINUTOS) {
			return getVeiculo().tarifaDiaria();
		}
		throw new IllegalArgumentException("Periodo inválido");
	}

}
