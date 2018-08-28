
public class Empresa {
	private No inicio;
	private No ultimo;
	private Pilha topo;
	private int quant;
	
	public Empresa() {
		this.inicio = null;
		this.ultimo = null;
		this.topo = null;
		this.quant = 0;
	}
	
	public void setInicio(No inicio) {
		this.inicio = inicio;
	}
	public No getInicio() {
		return this.inicio;
	}
	
	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}
	public No getUltimo() {
		return this.ultimo;
	}
	
	public void setTopo(Pilha topo) {
		this.topo = topo;
	}
	public Pilha getTopo() {
		return this.topo;
	}
	
	public String toString() {
		return "\nInicio: " + getInicio() +
				"\nÚltimo: " + getUltimo() +
				"\nFuncionário: ";
	}
	
	public void somaQuantidade() {
		this.quant += 1;
	}
	
	public void diminuiQuantidade() {
		this.quant -= 1;
	}
	
	public int getQuantidade() {
		return this.quant;
	}
	
}
