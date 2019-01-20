package me.fsn.filipe.refactoring;

public  abstract class Veiculo {

    private String placa;

    private String modelo;

    public abstract double tarifaAteMeiaHora();
    public abstract double tarifaAteUmaHora();
    public abstract double tarifaHoraAdicional();
    public abstract double tarifaDiaria();
	
    public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
    
    
    
}
