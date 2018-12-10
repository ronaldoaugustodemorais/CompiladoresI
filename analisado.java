package analisado;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class analisado
{

	public static void main(String[] args)
	{
		int numeroDaLinha = 0;
		String letras, palavras = "";
		//Modificar caminho do arquivo, para ser lido diretamente do usuario.
		Path caminho = Paths.get("D://test.txt");
		
		try
		{
			byte[] texto = Files.readAllBytes(caminho);
			String leitura = new String(texto);
			
			for (int i = 0; i < leitura.length(); i++)
			{
				//System.out.println(leitura.charAt(i));
				letras = "" + leitura.charAt(i);
				if(letras.equals("\n"))
				{
					++numeroDaLinha;
					System.out.println("quebra de linha " + numeroDaLinha);
				}
				if(letras.equals(" "))
				{
					System.out.println("espaço");
				}
				//System.out.println(palavras);
				palavras += letras;
			}
			++numeroDaLinha;
			System.out.println("quebra de linha " + numeroDaLinha);
			
			//System.out.println(leitura);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}	
	} 
}
