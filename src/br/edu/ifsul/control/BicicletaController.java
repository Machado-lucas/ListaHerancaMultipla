package br.edu.ifsul.control;

import br.edu.ifsul.model.Bicicleta;

public class BicicletaController {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta(1, "oi", "bike", "com roda", 2019, 20, 4);

        System.out.println(bicicleta);
    }
}
