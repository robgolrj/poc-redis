package com.example.rest;

import com.example.domain.Cliente;
import com.example.service.IFilaBancoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by robson.machado on 19/04/2017.
 */
@RestController
public class FilaController {
    @Resource
    private IFilaBancoService filaBancoService;

    @RequestMapping(value="/fila/entrar", method = RequestMethod.GET)
    public Cliente entrarNaFila(@RequestParam("nome") String nome){
        return filaBancoService.entrarNaFila(nome);
    }

    @RequestMapping(value = "/fila", method = RequestMethod.GET)
    public List<Cliente> fila(){
        return filaBancoService.listAll();
    }

}
