package TabelaHash;

import java.util.HashMap;

public class TabelaSimbolosReservados {
    public HashMap<String, Simbolo> tabela = new HashMap<>();
    public static int end = -1;

    public final byte FINAL = 0;
    public final byte INT = 1;
    public final byte BYTE = 2;
    public final byte STRING = 3;
    public final byte WHILE = 4;
    public final byte IF = 5;
    public final byte ELSE = 6;
    public final byte AND = 7;
    public final byte OR = 8;
    public final byte NOT = 9;
    public final byte EQUAL = 10;
    public final byte RECIEVE = 11;
    public final byte OPPAR = 12;
    public final byte CLPAR = 13;
    public final byte MORETHAN = 14;
    public final byte LESSTHAN = 15;
    public final byte DIFFERENT = 16;
    public final byte MOREEQUAL = 17;
    public final byte LESSEQUAL = 18;
    public final byte COMMA = 19;
    public final byte PLUS = 20;
    public final byte MINUS = 21;
    public final byte MULT = 22;
    public final byte DIVIDE = 23;
    public final byte DOTCOMMA = 24;
    public final byte BEGIN = 25;
    public final byte END = 26;
    public final byte READ = 27;
    public final byte READLN = 28;
    public final byte WRITE = 29;
    public final byte WRITELN = 30;
    public final byte TRUE = 31;
    public final byte FALSE = 32;
    public final byte BOOLEAN = 33;
    public final byte ID = 34;
    public final byte CONST = 35;
    public final byte DIV = 36;
    public final byte MOD = 37;
    public final byte PROCEDURE = 38;
    public final byte FUNCTION = 39;
    public final byte VAR = 40;
    public final byte ARRAY = 41;
    public final byte OF = 42;
    public final byte TYPE = 43;
    public final byte RECORD = 44;
    public final byte REPEAT = 45;
    public final byte UNTIL = 46;
    public final byte FOR = 47;
    public final byte TO = 48;
    public final byte DOWNTO = 49;
    public final byte DO = 50;
    public final byte CASE = 51;
    public final byte WITH = 52;
    public final byte LABEL = 53;
    public final byte GOTO = 54;
    public final byte EXIT = 55;
    public final byte PROGRAM = 56;
    public final byte DOT = 57;

    public TabelaSimbolosReservados() {
        this.tabela.put("final", new Simbolo(FINAL, "final", ++end));
        this.tabela.put("int", new Simbolo(INT, "int", ++end));
        this.tabela.put("byte", new Simbolo(BYTE, "byte", ++end));
        this.tabela.put("string", new Simbolo(STRING, "string", ++end));
        this.tabela.put("while", new Simbolo(WHILE, "while", ++end));
        this.tabela.put("if", new Simbolo(IF, "if", ++end));
        this.tabela.put("else", new Simbolo(ELSE, "else", ++end));
        this.tabela.put("and", new Simbolo(AND, "and", ++end));
        this.tabela.put("or", new Simbolo(OR, "or", ++end));
        this.tabela.put("not", new Simbolo(NOT, "not", ++end));
        this.tabela.put("==", new Simbolo(EQUAL, "==", ++end));
        this.tabela.put("=", new Simbolo(RECIEVE, "=", ++end));
        this.tabela.put("(", new Simbolo(OPPAR, "(", ++end));
        this.tabela.put(")", new Simbolo(CLPAR, ")", ++end));
        this.tabela.put(">", new Simbolo(MORETHAN, ">", ++end));
        this.tabela.put("<", new Simbolo(LESSTHAN, "<", ++end));
        this.tabela.put("!=", new Simbolo(DIFFERENT, "!=", ++end));
        this.tabela.put(">=", new Simbolo(MOREEQUAL, ">=", ++end));
        this.tabela.put("<=", new Simbolo(LESSEQUAL, "<=", ++end));
        this.tabela.put(",", new Simbolo(COMMA, ",", ++end));
        this.tabela.put("+", new Simbolo(PLUS, "+", ++end));
        this.tabela.put("-", new Simbolo(MINUS, "-", ++end));
        this.tabela.put("*", new Simbolo(MULT, "*", ++end));
        this.tabela.put("/", new Simbolo(DIVIDE, "/", ++end));
        this.tabela.put(";", new Simbolo(DOTCOMMA, ";", ++end));
        this.tabela.put(".", new Simbolo(DOT, ".", ++end));
        this.tabela.put("begin", new Simbolo(BEGIN, "begin", ++end));
        this.tabela.put("end", new Simbolo(END, "end", ++end));
        this.tabela.put("readln", new Simbolo(READLN, "readln", ++end));
        this.tabela.put("write", new Simbolo(WRITE, "write", ++end));
        this.tabela.put("writeln", new Simbolo(WRITELN, "writeln", ++end));
        this.tabela.put("read", new Simbolo(READ, "read", ++end));
        this.tabela.put("true", new Simbolo(TRUE, "true", ++end));
        this.tabela.put("false", new Simbolo(FALSE, "false", ++end));
        this.tabela.put("boolean", new Simbolo(BOOLEAN, "boolean", ++end));
        this.tabela.put("div", new Simbolo(DIV, "div", ++end));
        this.tabela.put("mod", new Simbolo(MOD, "mod", ++end));
        this.tabela.put("procedure", new Simbolo(PROCEDURE, "procedure", ++end));
        this.tabela.put("function", new Simbolo(FUNCTION, "function", ++end));
        this.tabela.put("var", new Simbolo(VAR, "var", ++end));
        this.tabela.put("array", new Simbolo(ARRAY, "array", ++end));
        this.tabela.put("of", new Simbolo(OF, "of", ++end));
        this.tabela.put("type", new Simbolo(TYPE, "type", ++end));
        this.tabela.put("record", new Simbolo(RECORD, "record", ++end));
        this.tabela.put("const", new Simbolo(CONST, "const", ++end));
        this.tabela.put("repeat", new Simbolo(REPEAT, "repeat", ++end));
        this.tabela.put("until", new Simbolo(UNTIL, "until", ++end));
        this.tabela.put("for", new Simbolo(FOR, "for", ++end));
        this.tabela.put("to", new Simbolo(TO, "to", ++end));
        this.tabela.put("downto", new Simbolo(DOWNTO, "downto", ++end));
        this.tabela.put("do", new Simbolo(DO, "do", ++end));
        this.tabela.put("case", new Simbolo(CASE, "case", ++end));
        this.tabela.put("with", new Simbolo(WITH, "with", ++end));
        this.tabela.put("label", new Simbolo(LABEL, "label", ++end));
        this.tabela.put("goto", new Simbolo(GOTO, "goto", ++end));
        this.tabela.put("exit", new Simbolo(EXIT, "exit", ++end));
        this.tabela.put("begin", new Simbolo(BEGIN, "begin", ++end));
        this.tabela.put("end", new Simbolo(END, "end", ++end));
        this.tabela.put("program", new Simbolo(PROGRAM, "program", ++end));
    }

    public int Pesquisar(String lexema) {
        lexema = lexema.toLowerCase();
        Simbolo aux = this.tabela.get(lexema);
        if (aux != null) {
            return aux.getEndereco();
        }

        return 0;
    }

    public Simbolo BuscarSimbolo(String lexema) {
        lexema = lexema.toLowerCase();
        return tabela.get(lexema);
    }

    public Simbolo InserirID(String lexema) {
        lexema = lexema.toLowerCase();
        Simbolo simbolo = new Simbolo(ID, lexema, ++end);
        tabela.put(lexema, simbolo);
        return tabela.get(lexema);
    }

    public Simbolo inserirConst(String lexema, String tipo) {
        lexema = lexema.toLowerCase();
        Simbolo simbolo = new Simbolo(CONST, lexema, tipo, ++end);
        tabela.put(lexema, simbolo);
        return tabela.get(lexema);
    }
}