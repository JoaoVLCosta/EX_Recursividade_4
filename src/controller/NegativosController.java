package controller;

public class NegativosController {

	public NegativosController() {
		
		super();
		
	}

	public int fnNegativo(int[] vetor, int tamanho) {
		
		int repasse = 0;
		
		//A condição de parada ocorre quando o indicador de tamanho do vetor aponta "-1", isso é evidência de que na chamada anterior a posição 0 do vetor estava em pauta.
		if(tamanho == -1) {
			
			return repasse;
			
		} else {
			
			//A variável repasse serve como um verificador de quantas vezes foram encontrados termos negativos no vetor.
			//Ela é incrementada através da condicional a seguir.
			//As chamadas de função vão até "tamanho == -1" para que o primeiro termo de vetor possa também ser avaliado.
			
			repasse = fnNegativo(vetor, tamanho - 1);
			
			if(0 > vetor[tamanho]) {
				
				return repasse + 1;
				
			} else {
			
				return repasse + 0;
				
			}
			//O retorno é definido como 1 ou 0 sendo somados ao total da variável repasse de acordo com o número encontrado na posição atual do vetor.
		}	
	}
}
