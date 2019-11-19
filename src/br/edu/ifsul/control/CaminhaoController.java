package br.edu.ifsul.control;

import br.edu.ifsul.model.Caminhao;

public class CaminhaoController {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao(4, "propulsao", "chevrolet", "uno caminhao", 2000, 4, 4, "kog1998");
        System.out.println(caminhao);
    }
}
