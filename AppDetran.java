public class AppDetran {
    public static void main(String[] args) {
		
		AppDetran detran = new AppDetran();
		
		detran.CriacaoCarros();
		
		detran.AplicacaoMultas();
		
	}
  public void CriacaoCarros(){
    Carro carro = novo Carro();
		carro.modelo = "Chavette";
    carro.placa = "7890123" to.CharArray()
    
    Proprietario dono = novo Proprietario();
		dono.meuCarro = carro;
		dono.nome = "Pedro";
		System.out.println("Carro: " + carro.modelo + ",Proprietario: " + dono.nome );
    }
		
  public void Aplicarmulta() {
    Multa multa1 = new Multa();
		multa1.descricao = "excesso de velocidade";
		multa1.valor = 100;
		
		Multa multa2 = new Multa();
		multa2.descricao = "ultrapassagem faixa dupla";
		multa2.valor = 200;
		
		meuCarro.aplicarMulta(multa1);
		meuCarro.aplicarMulta(multa2);

}
