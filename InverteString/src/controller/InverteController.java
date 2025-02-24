package controller;

public class InverteController {

	public String Inverte(String palavra) {

		// Caso base: se a string for vazia ou tiver apenas um caractere, retorna a
		// própria string
		if (palavra.isEmpty() || palavra.length() == 1) {
			return palavra;
		}
		// Chamada recursiva: pega o último caractere e concatena com a inversão do
		// restante da string
		return palavra.substring(palavra.length() - 1) + Inverte(palavra.substring(0, palavra.length() - 1));

	}

}
