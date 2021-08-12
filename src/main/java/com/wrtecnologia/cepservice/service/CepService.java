package com.wrtecnologia.cepservice.service;

import com.wrtecnologia.cepservice.domain.Cep;
import com.wrtecnologia.cepservice.util.CepUtil;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class CepService {

    private static final String WEB_SERVICE = "http://viacep.com.br/ws/";

    public static Cep buscaEnderecoPeloCep(String cep) throws Exception {
        String urlViaCep = WEB_SERVICE + cep + "/json";
        try {
            URL url = new URL(urlViaCep);
            HttpURLConnection httpURLConn = (HttpURLConnection) url.openConnection();
            BufferedReader response = new BufferedReader(new InputStreamReader((httpURLConn.getInputStream())));
            String jsonEmString = CepUtil.converteJsonEmString(response);
            Gson gson = new Gson();
            return gson.fromJson(jsonEmString, Cep.class);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}