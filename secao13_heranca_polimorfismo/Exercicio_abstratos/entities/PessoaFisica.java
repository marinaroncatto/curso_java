package entities;

public class PessoaFisica extends Pessoa{

	private Double gastoSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}		
	
	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		double imposto = 0.0;
		
		if(rendaAnual < 20000.0) {
			imposto = (rendaAnual * 0.15) - (gastoSaude * 0.5);
		}else {
			imposto = (rendaAnual * 0.25) - (gastoSaude * 0.5);			
		}
		
		if (imposto < 0.0) {
			imposto = 0.0;
		}
		
		return imposto;
	}

}
