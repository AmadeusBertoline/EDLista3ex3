package controller;

public class InverteController {
	
	public String Inverte(String palavra, int posicao) {
		
		if(palavra == "") {
			
			return palavra;
			
		}
		
		return palavra.substring(posicao) + Inverte(palavra.substring(posicao), posicao + 1);
		
	}

}
