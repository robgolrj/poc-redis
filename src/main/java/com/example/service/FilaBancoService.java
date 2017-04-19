package com.example.service;

import com.example.domain.Cliente;
import com.example.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by robson.machado on 19/04/2017.
 */
@Service
public class FilaBancoService implements IFilaBancoService {
    @Resource
    private ClienteRepository filaBancoRepository;

    @Override
    public Cliente entrarNaFila(String nome){
        Cliente filaBanco = new Cliente();
        filaBanco.setNome(nome);
        filaBanco.setDataHora(new Date());
        return filaBancoRepository.save(filaBanco);
    }

    @Override
    public List<Cliente> listAll(){
        List<Cliente> list = new ArrayList<>();
        filaBancoRepository.findAll().forEach(list::add);
        return list;
    }

    @Override
    public Cliente atender(String id){
        return filaBancoRepository.findOne(id);
    }

    @Override
    public void sairDaFila(String id){
        filaBancoRepository.delete(id);
    }
}
