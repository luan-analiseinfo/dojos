package me.fsn.filipe.refactoring;

public class Caminhonete extends Veiculo {

	@Override
	public double tarifaAteMeiaHora() {
		return 7.0;
	}

	@Override
	public double tarifaAteUmaHora() {
		return 10.0;
	}

	@Override
	public double tarifaHoraAdicional() {
		return 5.0;
	}

	@Override
	public double tarifaDiaria() {
		return 30.0;
	}

}
