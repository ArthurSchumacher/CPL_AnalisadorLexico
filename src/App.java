import TabelaHash.TabelaSimbolos;

public class App {
    public static void main(String[] args) throws Exception {
        String caminho = "/Users/arthur/Dev/Java/CPL_AnalisadorLexico/helloworld.pas";
        TabelaSimbolos tabela = new TabelaSimbolos(caminho);
        tabela.Executar();
    }
}
