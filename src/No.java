
public class No {
	private Funcionario funcionario;
	private No proximo;
	private No anterior;
	
	public No () {
		this(null,null,null);
	}
	
	public No(Funcionario funcionario, No proximo, No anterior) {
		this.funcionario = funcionario;
		this.proximo = proximo;
		this.anterior = anterior;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Funcionario getFuncionario() {
		return this.funcionario;
	}
	
	public void setProximo(No proximo){
		this.proximo = proximo;
	}
	public No getProximo() {
		return this.proximo;
	}
	
	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
	public No getAnterior() {
		return this.anterior;
	}
}
