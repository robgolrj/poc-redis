package com.example.service;

import com.example.domain.Cliente;

import java.util.List;

/**
 * Created by robson.machado on 19/04/2017.
 */
public interface IFilaBancoService {
    Cliente entrarNaFila(String nome);

    List<Cliente> listAll();

    Cliente atender(String id);

    void sairDaFila(String id);
}
