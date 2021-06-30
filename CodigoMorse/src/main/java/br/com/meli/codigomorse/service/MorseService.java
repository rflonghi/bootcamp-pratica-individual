package br.com.meli.codigomorse.service;

import org.springframework.stereotype.Service;

@Service
public class MorseService {

    public String traduzir(String fraseCodificada) {
        String[] codigo = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".-.-.-",
                "--..--", "..--..", "-.-.--", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...",
                "---..", "----."};
        String[] caractere = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                "S", "T", "U", "V", "W", "X", "Y", "Z", ".", ",", "?", "!",
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        StringBuilder decodificador = new StringBuilder();
        StringBuilder fraseDecodificada = new StringBuilder();
        for (int i = 0; i <= fraseCodificada.length(); i++) {
            if (i == fraseCodificada.length()) {
                for (int j = 0; j < codigo.length; j++) {
                    if (decodificador.toString().equals(codigo[j])) {
                        fraseDecodificada.append(caractere[j]);
                        break;
                    }
                }
            }
            else if (fraseCodificada.charAt(i) != ' ')
                decodificador.append(fraseCodificada.charAt(i));
            else if (fraseCodificada.charAt(i) == ' ') {
                if (fraseCodificada.charAt(i + 1) != ' ') {
                    for (int j = 0; j < codigo.length; j++) {
                        if (decodificador.toString().equals(codigo[j])) {
                            fraseDecodificada.append(caractere[j]);
                            decodificador.delete(0, decodificador.length());
                            break;
                        }
                    }
                } else {
                    for (int j = 0; j < codigo.length; j++) {
                        if (decodificador.toString().equals(codigo[j])) {
                            fraseDecodificada.append(caractere[j]);
                            decodificador.delete(0, decodificador.length());
                            break;
                        }
                    }
                    fraseDecodificada.append(" ");
                    i += 2;
                    decodificador.delete(0, decodificador.length());
                }
            }
        }
        return fraseDecodificada.toString();
    }
}
