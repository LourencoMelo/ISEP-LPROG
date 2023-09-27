import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Main {

    public static void main(String[] args) throws IOException {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Escreve o nome do ficheiro de script: ");
            String nome = sc.nextLine();
            String caminho = "src\\main\\java\\CatalogosDeServicosScripts\\";
            Path path = Paths.get(caminho + nome).toAbsolutePath();

            System.out.println("Resultado com visitor: ");

            parseWithVisitor(path);

            System.out.println("\n===============================");

            System.out.println("Resultado com listener: ");

            parseWithListener(path);

            System.out.println("\n===============================");
            System.out.println("FIM");
        } catch(FileNotFoundException e) {
            System.out.println("O ficheiro não existe!");
        }
    }

    public static void parseWithVisitor(Path path) throws IOException {
        FileInputStream fis = new FileInputStream(new File(String.valueOf(path)));
        SprintCSEMLAPR4Lexer lexer = new SprintCSEMLAPR4Lexer(new ANTLRInputStream(fis));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SprintCSEMLAPR4Parser parser = new SprintCSEMLAPR4Parser(tokens);
        ParseTree tree = parser.inicio(); // parse
        VisitorAntlr eval = new VisitorAntlr();
        eval.visit(tree);
    }

    public static void parseWithListener(Path path) throws IOException {
        SprintCSEMLAPR4Lexer lexer = new SprintCSEMLAPR4Lexer(CharStreams.fromFileName(String.valueOf(path)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SprintCSEMLAPR4Parser parser = new SprintCSEMLAPR4Parser(tokens);
        ParseTree tree = parser.inicio(); // parse
        ParseTreeWalker walker = new ParseTreeWalker();
        ListenerAntlr eListener = new ListenerAntlr();
        walker.walk(eListener, tree);
        System.out.println(eListener.getResult()); // print the result
    }

}