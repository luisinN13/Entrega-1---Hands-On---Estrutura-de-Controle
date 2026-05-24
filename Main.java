import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<>();
		n.add(10);
		n.add(2);
		n.add(3);
		n.add(4);
		n.add(5);
		n.add(6);
		
		ArrayList<String> nome = new ArrayList<>();
		nome.add("Luis");
		nome.add("Clara");
		nome.add("Gabriel");
		nome.add("João");
		
		System.out.println("Posição do número: " + n.get(3));
		System.out.println("Números: " + n);
		System.out.println("Quantidade de nomes informados: " + nome.size());
		System.out.println("Nome solicitado: " + nome.get(0));
		System.out.println("Nomes: " + nome);
	}

}
