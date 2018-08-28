
public class Funcionario {
	private int codigo;
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {}
	
	public Funcionario(int codigo, String nome, String cpf, double salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario;
	}
	
	public String toString() {
		return "\nCódigo: " + getCodigo() +
				"\nNome: " + getNome() +
				"\nCPF: " + getCpf() +
				"\nSalário: " + getSalario();
	}

}
