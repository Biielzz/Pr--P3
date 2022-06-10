package view;

import java.io.IOException;
import controller.Control;
import controller.Inter;

public class Main {

	public static void main(String[] args) {
		String dir = "C:\\TEMP";
		 String nome = "trades.json.txt";
		 Inter  arqCont = new Control();
		 try {
			arqCont.LerFile(dir, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}


