import ManipuladorArquivos.Minificadora;
import TabelaHash.TabelaSimbolos;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "C:\\Dev\\CPL_AnalisadorLexico\\helloworld.pas";
        String pathToWrite = "C:\\Dev\\CPL_AnalisadorLexico\\helloworld.min.pas";
        Minificadora min = new Minificadora();
        min.minificaPascal(path, pathToWrite);
        TabelaSimbolos tabela = new TabelaSimbolos(pathToWrite);
        tabela.Executar();
    }
}
