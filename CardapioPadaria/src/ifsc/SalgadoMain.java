package ifsc;

public class SalgadoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Salgado coxinha = new Salgado();
        coxinha.setNome("Coxinha de Frango");
        coxinha.setSabor("Frango");
        coxinha.setDescricao("");
        coxinha.setPreco(5.00f);
        
        Salgado bolinho = new Salgado();
        bolinho.setNome("Bolinho de Carne");
        bolinho.setSabor("Carne");
        bolinho.setDescricao("");
        bolinho.setPreco(4.00f);
        
        Salgado pastel1 = new Salgado();
        pastel1.setNome("Pastel de Frango");
        pastel1.setSabor("Frango");
        pastel1.setDescricao("");
        pastel1.setPreco(6.00f);
        
        Salgado pastel2 = new Salgado();
        pastel2.setNome("Pastel de Carne");
        pastel2.setSabor("Carne");
        pastel2.setDescricao("");
        pastel2.setPreco(5.00f);
	}

}
