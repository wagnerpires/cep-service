package com.wrtecnologia.cepservice.controller;

import com.wrtecnologia.cepservice.domain.Cep;
import com.wrtecnologia.cepservice.service.CepService;

import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/endereco")
public class CepController {

/* VER COM IVO O MAIS CORRETO NESTE CASO

  @RequestParam - Valor da varíavel é passado como parâmetro e não fazem parte da url em si
                  ex.: http://localhost/endereco?cep=72870237

  @PathVariable - Valor da variável é passado diretamente na url
                  ex.: http://localhost/endereco/72870237
 */

//  @GetMapping(path = "/{cep}")
//  public ResponseEntity<Cep> buscaEnderecoPeloCep(@PathVariable("cep") String cep) throws Exception {

    @GetMapping
    public ResponseEntity<Cep> buscaEnderecoPeloCep(@RequestParam(value = "cep", defaultValue = "") String cep) throws Exception {
        try {
            Cep endereco = CepService.buscaEnderecoPeloCep(cep);
            return ResponseEntity.ok().body(endereco);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
