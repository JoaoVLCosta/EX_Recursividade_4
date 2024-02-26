package view;
import controller.NegativosController;
public class Principal {
	
	public static void main(String[] args) {
		
		NegativosController nc = new NegativosController();
		
		int[] vetor = {5, 3, -4, 2, -8, 11, 7, -5, -32, -15};
		int tamanho = (vetor.length) - 1;
		
		int contagem = nc.fnNegativo(vetor, tamanho);
		
		System.out.println(contagem);
		
	}
	
}
