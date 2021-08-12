package com.wrtecnologia.cepservice.util;

import java.io.BufferedReader;
import java.io.IOException;

public class CepUtil {
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta;
        StringBuilder jsonEmString = new StringBuilder();
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString.append(resposta);
        }
        return jsonEmString.toString();
    }
}
