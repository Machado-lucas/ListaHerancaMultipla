package br.edu.ifsul.control;

import br.edu.ifsul.model.Bicicleta;
import br.edu.ifsul.model.Caminhao;
import br.edu.ifsul.model.Carro;
import br.edu.ifsul.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoController {
    public static void main(String[] args) {
        //Caminhões
        Caminhao caminhao1 = new Caminhao(4, "propulsao", "chevrolet", "uno caminhao", 2010, 4, 4, "iog1998");
        Caminhao caminhao2 = new Caminhao(2, "propulsao uau", "fiat", "celta caminhao", 2013, 4, 4, "iig1998");
        Caminhao caminhao3 = new Caminhao(1, "propulsao mto loca", "chevrolet", "blazer caminhao", 1998, 4, 4, "jog1998");
        Caminhao caminhao4 = new Caminhao(3, "propulsao doidera", "renault", "ecosport caminhao", 1997, 4, 4, "pog1998");
        Caminhao caminhao5 = new Caminhao(3, "propulsao pacas", "chevrolet", "caminhao", 2003, 4, 4, "kgg1598");

        //Bicicleta
        Bicicleta bicicleta1 = new Bicicleta(0, "oi", "bike", "com roda", 2017, 20, 4);
        Bicicleta bicicleta2 = new Bicicleta(0, "ola", "bike americana", "sem roda", 2009, 20, 4);
        Bicicleta bicicleta3 = new Bicicleta(0, "koe", "bike brasileira", "com 3 roda", 1998, 20, 4);
        Bicicleta bicicleta4 = new Bicicleta(0, "hola", "bike dell", "maneira", 2018, 20, 4);
        Bicicleta bicicleta5 = new Bicicleta(0, "hello", "apple", "smart bike", 2019, 20, 4);

        //Carro
        Carro carro1 = new Carro(0, "propulsao pacas", "renault", "scenic", 2008, 4, 4, "ioc9598");
        Carro carro2 = new Carro(0, "propulsao pacas", "fiat", "uno com escada", 2008, 4, 4, "iic9598");
        Carro carro3 = new Carro(0, "propulsao pacas", "chevrolet", "gol", 2011, 4, 4, "koc9598");
        Carro carro4 = new Carro(1, "propulsao pacas", "bmw", "bmw", 2019, 4, 4, "ioc9521");
        Carro carro5 = new Carro(0, "propulsao pacas", "renault", "scenic", 2007, 4, 4, "lke4598");


        List<Veiculo> Veiculos = new ArrayList<>();
        Veiculos.add(caminhao1);
        Veiculos.add(caminhao2);
        Veiculos.add(caminhao3);
        Veiculos.add(caminhao4);
        Veiculos.add(caminhao5);
        Veiculos.add(bicicleta1);
        Veiculos.add(bicicleta2);
        Veiculos.add(bicicleta3);
        Veiculos.add(bicicleta4);
        Veiculos.add(bicicleta5);
        Veiculos.add(carro1);
        Veiculos.add(carro2);
        Veiculos.add(carro3);
        Veiculos.add(carro4);
        Veiculos.add(carro5);

        Veiculos.sort((v1, v2)->{
            if(v1.getAnoFabricacao() < v2.getAnoFabricacao()){
                return 1;
            }
            else if(v1.getAnoFabricacao() > v2.getAnoFabricacao()){
                return -1;
            }
            return 0;
        });

        System.out.println("\nLista de Veiculos cadastrados no sistema:\n" + Veiculos);


    }
}
