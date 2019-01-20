package me.fsn.filipe.refactoring;

public abstract class Conta {

    private long entrada;

    private long saida;

    private Veiculo veiculo;
    
    public Conta(long entrada, long saida, Veiculo veiculo) {
        this.entrada = entrada;
        this.saida = saida;
        this.veiculo = veiculo;
    }

    public Double gerarConta() {
    	long periodoEmMinutos = obtemPeriodoDeUtilizacaoEmMinutos();
    	assert periodoEmMinutos > 0;
        return calcularContaDeUtilizacao(periodoEmMinutos);
    }
    
    protected Veiculo getVeiculo() {
		return veiculo;
	}

	private long obtemPeriodoDeUtilizacaoEmMinutos() {
		return (saida - entrada) / 1000 / 60;
	}
	
	protected abstract double calcularContaDeUtilizacao(long periodoEmMinutos);
		
	
}
