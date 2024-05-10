package TabelaHash;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class TabelaSimbolos {

    private HashMap<String, Simbolo> mapaSimbolos;

    public TabelaSimbolos(String path) {
        this.mapaSimbolos = new HashMap<>();
        this.PopularMapa(path);
    }

    private void PopularMapa(String path) {
        TabelaSimbolosReservados palavrasReservadas = new TabelaSimbolosReservados();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                analisarLinha(linha, palavrasReservadas);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo minificado: " + e.getMessage());
        }
    }

    private void analisarLinha(String linha, TabelaSimbolosReservados palavrasReservadas) {
        boolean dentroString = false;
        StringBuilder palavraAtual = new StringBuilder();

        for (int i = 0; i < linha.length(); i++) {
            char c = linha.charAt(i);
            if (c == '\'') {
                dentroString = !dentroString;
                palavraAtual.append(c);
            } else if (c == ' ' && !dentroString) {
                processarPalavra(palavraAtual.toString(), palavrasReservadas);
                palavraAtual.setLength(0);
            } else {
                palavraAtual.append(c);
            }
        }
        processarPalavra(palavraAtual.toString(), palavrasReservadas);
    }

    private void processarPalavra(String palavra, TabelaSimbolosReservados palavrasReservadas) {
        if (palavra.isEmpty()) {
            return;
        }

        if (palavrasReservadas.Pesquisar(palavra) != 0) {
            this.mapaSimbolos.put(palavra, palavrasReservadas.BuscarSimbolo(palavra));
        } else {
            try {
                switch (detectarTipoPalavra(palavra)) {
                    case "STRING_CONST":
                        this.mapaSimbolos.put(palavra, palavrasReservadas.inserirConst(palavra, "STRING_CONST"));
                        break;
                    case "NUM_CONST":
                        this.mapaSimbolos.put(palavra, palavrasReservadas.inserirConst(palavra, "NUM_CONST"));
                        break;
                    case "ID":
                        this.mapaSimbolos.put(palavra, palavrasReservadas.InserirID(palavra));
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }
    }

    private String detectarTipoPalavra(String palavra) throws Exception {
        if (palavra.length() >= 2 && palavra.charAt(0) == '\'' && palavra.charAt(palavra.length() - 1) == '\'') {
            return "STRING_CONST";
        } else if (palavra.chars().allMatch(Character::isDigit)) {
            return "NUM_CONST";
        } else if (!Character.isDigit(palavra.charAt(0))) {
            return "ID";
        } else {
            throw new Exception("Falha ao processar arquivo. Erro ao declarar: " + palavra);
        }
    }

    private void Listando() {
        for (String lexema : mapaSimbolos.keySet()) {
            Simbolo simbolo = mapaSimbolos.get(lexema);
            System.out.println(simbolo.toString());
        }
    }

    public void Executar() {
        this.Listando();
    }
}