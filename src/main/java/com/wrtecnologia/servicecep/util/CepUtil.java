package com.wrtecnologia.servicecep.util;

import java.io.BufferedReader;
import java.io.IOException;

public class CepUtil {
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
}
