package Atividade.Eng;

public class Combo{
	Burger burger = new Burger();
	Bebida bebida = new Bebida();
	Sobremesa sobremesa = new Sobremesa();
	
	public void CriarCombo(int tipo) {
		switch(tipo) {
		case 1:
			burger.setGramas(300);
			sobremesa.setTamanho("Grande");
			bebida.setMl(350);
			burger.setDescricao("2 Big Mac, 2 Casquinhas e 2 Free Refil");
			burger.setValor(60.0);
			break;
		case 2:
			burger.setGramas(150);
			sobremesa.setTamanho("Média");
			bebida.setMl(100);
			burger.setDescricao("1 Big Mac, 1 Casquinhas e 1 Free Refil");
			burger.setValor(30.0);
			break;
		}
	}
	@Override
	public String toString() {
		return "Seu Combo: " + burger.getDescricao() + 	"\nBebida: " + bebida.getMl() +  "ml" + "\nSobremesa: " + sobremesa.getTamanho();
	}
	}

