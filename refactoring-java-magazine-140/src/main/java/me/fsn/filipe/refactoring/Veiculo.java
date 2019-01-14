package me.fsn.filipe.refactoring;

public class Veiculo {

    private final String placa;

    private final String modelo;

    private final TipoVeiculo tipoVeiculo;

    private Veiculo(String placa, String modelo, TipoVeiculo tipoVeiculo) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipoVeiculo = tipoVeiculo;
    }

    public static Veiculo of(String placa, String modelo, TipoVeiculo tipoVeiculo) {
        return new Veiculo(placa, modelo, tipoVeiculo);
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

}
