package br.edu.ifsul.model;

public class Bicicleta extends Veiculo{
    int tamanhoRoda;
    int chassi;

    public Bicicleta() {
    }

    public Bicicleta(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int tamanhoRoda, int chassi) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.tamanhoRoda = tamanhoRoda;
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "tamanhoRoda=" + tamanhoRoda +
                ", chassi=" + chassi +
                ", numeroDeEixos=" + numeroDeEixos +
                ", propulsao='" + propulsao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
