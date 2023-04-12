import java.util.*;

public class Carro {
	public String modelo;
	public char[] placa;
	
	private ArrayList<Multa> multas = new ArrayList();
	
	public void aplicarMulta(Multa multa) {
		multas.add(multa);
	}
