package Kesseler.Roberto.Exemplo4.controller;

import Kesseler.Roberto.Exemplo4.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Agora o Filho Chora e a Mãe não ve";
    }

    @GetMapping("/clientes")
    public Cliente getClient() {

        Cliente cliente = new Cliente();
        cliente.setNome("Roberto");

        return cliente;
    }

    @GetMapping("/produtos")
    public String getProduct() {
        return "Área do Produto";
    }
}
