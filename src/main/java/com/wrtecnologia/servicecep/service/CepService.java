package com.wrtecnologia.servicecep.service;

import com.wrtecnologia.servicecep.domain.Cep;
import com.wrtecnologia.servicecep.util.CepUtil;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class CepService implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final String webService = "http://viacep.com.br/ws/";

    public static Cep buscaEnderecoPeloCep(String cep) throws Exception {

        String urlParaChamada = webService + cep + "/json";
        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != 200)
                throw new Exception("Erro HTTP: " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String jsonEmString = CepUtil.converteJsonEmString(resposta);

            Gson gson = new Gson();
            Cep endereco = gson.fromJson(jsonEmString, Cep.class);

            return endereco;

        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}