
public class Fila {
	private Funcionario funcionario;
	private Fila proximo;
	
	public Fila () {
		this(null,null);
	}
	
	public Fila(Funcionario funcionario, Fila proximo) {
		this.funcionario = funcionario;
		this.proximo = proximo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Fila getProximo() {
		return proximo;
	}

	public void setProximo(Fila proximo) {
		this.proximo = proximo;
	}

	public String toString() {
		return funcionario.toString();
	}

}
