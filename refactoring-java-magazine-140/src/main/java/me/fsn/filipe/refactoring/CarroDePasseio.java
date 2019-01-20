package me.fsn.filipe.refactoring;

public class CarroDePasseio extends Veiculo {

	@Override
	public double tarifaAteMeiaHora() {
		return 5.0;
	}

	@Override
	public double tarifaAteUmaHora() {
		return 8.0;
	}

	@Override
	public double tarifaHoraAdicional() {
		return 3.0;
	}

	@Override
	public double tarifaDiaria() {
		return 20.0;
	}

}
