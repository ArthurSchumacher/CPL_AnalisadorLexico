import ManipuladorArquivos.Minificadora;
import TabelaHash.TabelaSimbolos;

public class App {
    public static void main(String[] args) throws Exception {
        String caminho = "/Users/arthur/Dev/Java/CPL_AnalisadorLexico/helloworld.pas";
        String caminhoParaEscrever = "/Users/arthur/Dev/Java/CPL_AnalisadorLexico/helloworld.min.pas";
        Minificadora min = new Minificadora();
        min.minificaPascal(caminho, caminhoParaEscrever);
        TabelaSimbolos tabela = new TabelaSimbolos(caminhoParaEscrever);
        tabela.Executar();
    }
}
