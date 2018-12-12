import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class escreverArquivo
{
 
  public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
    int i, n;
 
    System.out.printf("Arquivo de tabela gerado com sucesso");
//    n = ler.nextInt();  // caso necessite ler algum dado do usuario
 
    FileWriter arq = new FileWriter("d:\\tabela.txt");
    PrintWriter gravarArq = new PrintWriter(arq);
 
    gravarArq.printf("+--Resultado--+%n");

// TRIPLAS QUE FORAM GERADAS (GLAUBER)

    gravarArq.printf("+-------------+%n");
 
    arq.close();
  }
 
}
