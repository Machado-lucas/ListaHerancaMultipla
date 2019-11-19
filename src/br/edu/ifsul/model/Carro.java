package br.edu.ifsul.model;

public class Carro extends Veiculo implements Automovel{
    private int renavan;
    private int chassi;
    private String placa;

    public Carro() {
    }

    public Carro(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int renavan, int chassi, String placa) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.renavan = renavan;
        this.chassi = chassi;
        this.placa = placa;
    }

    @Override
    public int getRenavan() {
        return this.renavan;
    }

    @Override
    public void setRenavan(int renavan) {
        this.renavan = renavan;
    }

    @Override
    public int getChassi() {
        return this.chassi;
    }

    @Override
    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    @Override
    public String getPlaca() {
        return this.placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "renavan=" + renavan +
                ", chassi=" + chassi +
                ", placa='" + placa + '\'' +
                ", numeroDeEixos=" + numeroDeEixos +
                ", propulsao='" + propulsao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
