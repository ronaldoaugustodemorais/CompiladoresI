import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.swing.JOptionPane;
 
public class lerArquivo
{
 
  public static void main(String[] args)
  {
    Scanner ler = new Scanner(System.in);
	String strArqLeitura = null;
    String strArqLeitura = JOptionPane.showInputDialog(null,"Onde o arquivo esta localizado?"); //INFORMAR NOME DO ARQUIVO A SER LIDO
    
 
    System.out.printf("\nConteúdo do arquivo texto:\n");
    try
	{
      FileReader arq = new FileReader(strArqLeitura);
      BufferedReader lerArq = new BufferedReader(arq);
 
      String linha = lerArq.readLine();

      while (linha != null)
	{
 	       System.out.printf("%s\n", linha);
 
 	       linha = lerArq.readLine();
      	}
 
      arq.close();
    } catch (IOException e)
		{
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
		}
 
    System.out.println();
  }
}
