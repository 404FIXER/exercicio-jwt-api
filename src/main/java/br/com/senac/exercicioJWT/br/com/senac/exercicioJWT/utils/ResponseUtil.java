package br.com.senac.exercicioJWT.br.com.senac.exercicioJWT.utils;

import java.util.HashMap;
import java.util.Map;

public class ResponseUtil {
    public static Map<String, String> response(String mensagem) {
        Map<String, String> response = new HashMap<>();
        response.put("message", mensagem);

        return response;
    }
}
