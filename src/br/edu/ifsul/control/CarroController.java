package br.edu.ifsul.control;

import br.edu.ifsul.model.Carro;

public class CarroController {
    public static void main(String[] args) {
        Carro carro = new Carro(4, "propulsao pacas", "renault", "scenic", 2008, 4, 4, "ioc9598");
        System.out.println(carro);
    }
}
