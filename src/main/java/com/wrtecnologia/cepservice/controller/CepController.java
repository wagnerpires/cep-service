package com.wrtecnologia.cepservice.controller;

import com.wrtecnologia.cepservice.domain.Cep;
import com.wrtecnologia.cepservice.service.CepService;

import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/endereco")
public class CepController {

    @GetMapping(path = "/{cep}")
    public ResponseEntity<Cep> buscaEnderecoPeloCep(@PathVariable("cep") String cep) throws Exception {
        try {
            Cep endereco = CepService.buscaEnderecoPeloCep(cep);
            return ResponseEntity.ok().body(endereco);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
