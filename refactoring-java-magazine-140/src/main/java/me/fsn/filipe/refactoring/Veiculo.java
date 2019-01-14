package me.fsn.filipe.refactoring;

import static com.google.common.base.Preconditions.checkNotNull;

public class Veiculo {

    private final String placa;

    private final String modelo;

    private final TipoVeiculo tipoVeiculo;

    private Veiculo(String placa, String modelo, TipoVeiculo tipoVeiculo) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipoVeiculo = tipoVeiculo;
    }

    public static Veiculo of(final String placa, final String modelo, final TipoVeiculo tipoVeiculo) {
        checkNotNull(placa, "A placa não foi definida");
        checkNotNull(modelo, "O modelo não foi definido");
        checkNotNull(tipoVeiculo, "O tipo do veículo não foi definido");

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
