package matriz_view;


public class matriz  {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			//NÃO CONSIGO ACHAR O ERRO
			Thread t = new matriz(i);
			t.start();
		}
		
	}

}