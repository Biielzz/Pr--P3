package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Control implements Inter {
	
	public void Ler(String path) throws IOException {
		File dir = new File(path);
		if (dir.exists() && dir.isDirectory()) {
		 File[] files = dir.listFiles();
		 for ( File f : files) {
			 if (f.isFile()) {
				 System.out.println("        \t"+f.getName());
			 } else {
				 System.out.println("<DIR>\t"+f.getName());
			 }
		 }
	} else {
	throw new IOException ("Diretório inválido");
	}
	}
	public void LerFile(String path, String nome) throws IOException {
		File arq = new File(path, nome);
		if(arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				String Virg[] = linha.split(",");
				int i = 0;
				while(i < Virg.length) {
				if(Virg[i].contains("funds")) {
					System.out.println(Virg[i]);
				}
				if(Virg[i].contains("created_at")) {
					System.out.println(Virg[i]);
				}
				i++;
			}
				linha = buffer.readLine();
			}
			
			buffer.close();
			leitor.close();
			fluxo.close();
		} else {
			throw new IOException("Arquivo Inválido");
		}	
	}
}

