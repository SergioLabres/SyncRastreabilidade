package br.com.viasoft.SyncRastreabilidade.controller;

import br.com.viasoft.SyncRastreabilidade.data.ClienteData;
import br.com.viasoft.SyncRastreabilidade.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fabi on 12/07/17.
 */
@RestController
public class TesteController {

    @Autowired
    private ClienteData clienteData;

    @GetMapping("/add/{key}/{value}")
    public boolean run(@PathVariable String key, @PathVariable String value) {
        Cliente cliente = new Cliente();
        cliente.setCliente(key);
        cliente.setUrl(value);
        clienteData.save(cliente);
        return true;
    }

    @GetMapping("get/{key}")
    public Cliente get(@PathVariable String key) {
        return clienteData.findOne(key);
    }

    @GetMapping("consulta-cliente/{key}")
    public Cliente[] findCliente(@PathVariable String key) {
        Cliente cliente = clienteData.findOne(key);
        return new RestTemplate().getForEntity(cliente.getUrl(), Cliente[].class).getBody();
    }

}
