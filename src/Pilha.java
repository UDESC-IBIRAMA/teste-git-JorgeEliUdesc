
public class Pilha {
	private Funcionario funcionario;
	private Pilha proximo;
	
	public Pilha () {
		this(null,null);
	}
	
	public Pilha(Funcionario funcionario, Pilha proximo) {
		this.funcionario = funcionario;
		this.proximo = proximo;
	}	
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Funcionario getFuncionario() {
		return this.funcionario;
	}
	
	public void setProximo(Pilha proximo){
		this.proximo = proximo;
	}
	public Pilha getProximo() {
		return this.proximo;
	}
	
	public String toString() {
		return funcionario.toString();
	}

}
