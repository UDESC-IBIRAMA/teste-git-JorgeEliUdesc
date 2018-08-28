import javax.swing.JOptionPane;

public class Lista {
	private Empresa empresa = new Empresa();
	//private ListaOrdenada lOrdenada = new ListaOrdenada();
	private Pilha topo = null;
	private Fila inicioFila = null;
	private Fila fimFila = null;
		
		public void inserirInicio(Funcionario dado) {
			No novo = new No();
			novo.setFuncionario(dado);
			novo.setProximo(empresa.getInicio());
			novo.setAnterior(null);
			if(empresa.getInicio() != null) {
				empresa.getInicio().setAnterior(novo);
			}
			else 
			{
				empresa.setUltimo(novo);
			}
			empresa.setInicio(novo);
			empresa.somaQuantidade();
			
			JOptionPane.showMessageDialog(null,"Elemento inserido com sucesso!");
			
		}
		
		public void removerPrimeiro() {
			if(empresa.getInicio() != null) {
				No temp = empresa.getInicio();
				if(empresa.getUltimo() == temp) {
					empresa.setInicio(null);
					empresa.setUltimo(null);
				}
				else 
				{
					empresa.getInicio().getProximo().setAnterior(null);
					empresa.setInicio(empresa.getInicio().getProximo());
				}
				empresa.diminuiQuantidade();
				JOptionPane.showMessageDialog(null,"Elemento\n" + temp.getFuncionario() + "\n\nfoi removido com sucesso!");
				temp = null;
				System.gc();
			}
			else 
			{
				JOptionPane.showMessageDialog(null,"Lista vazia!");
			}			
		}
		
		public void inserirFim(Funcionario dado) {
			No novo = new No();
			novo.setFuncionario(dado);
			novo.setProximo(null);
			novo.setAnterior(empresa.getUltimo());
			if(empresa.getInicio() != null) {
				empresa.getUltimo().setProximo(novo);
			}
			else 
			{
				empresa.setInicio(novo);
			}
			empresa.setUltimo(novo);
			empresa.somaQuantidade();
			JOptionPane.showMessageDialog(null, "Elemento inserido com sucesso!");
		}
		
		public void removerUltimo() {
			if(empresa.getUltimo() != null) {
				No temp = null;
				temp = empresa.getUltimo();
				
				if(empresa.getInicio() == temp) {			
					empresa.setInicio(null);
					empresa.setUltimo(null);
				}
				else
				{
					empresa.setUltimo(temp.getAnterior());
					empresa.getUltimo().setProximo(null);
				}
				empresa.diminuiQuantidade();
				JOptionPane.showMessageDialog(null,"Elemento\n" + temp.getFuncionario() + "\n\nfoi removido com sucesso!");
				temp = null;
				System.gc();
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Lista vazia!");
			}
		}
		
		public void listarPrimeiroParaUltimo() {
			if(empresa.getInicio() != null) {
				No atual = empresa.getInicio();
				int cont = 0;
				String str = "";
				while(atual != null) {
					cont = cont + 1;
					str += (cont) + " - " + atual.getFuncionario() + "\n";
					atual = atual.getProximo();
				}
				JOptionPane.showMessageDialog(null,"Lista Duplamente Encadeada \n" + str);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Lista vazia!");
			}
		}
		
		public void listarUltimoParaPrimeiro() {
			if(empresa.getInicio() != null) {
				No atual = empresa.getUltimo();
				int cont = 0;
				String str = "";
				while(atual != null) {
					cont = cont + 1;
					str += (cont) + " - " + atual.getFuncionario() + "\n";
					atual = atual.getAnterior();
				}
				JOptionPane.showMessageDialog(null,"Lista Duplamente Encadeada \n" + str);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Lista vazia!");
			}
		}
		
		public void removeUltimoInserePilha() {
			if(empresa.getUltimo() == null) {
				JOptionPane.showMessageDialog(null,"Lista vazia!");
			}
			else
			{
				Pilha novo = new Pilha();
				novo.setFuncionario(empresa.getUltimo().getFuncionario());
				novo.setProximo(topo);
				topo = novo;
				JOptionPane.showMessageDialog(null, "Elemento \n"+ novo.toString() + "\n\nInserido na Pilha com sucesso!");
				removerUltimo();
			}
		}
		
		public void listarPilha() {
			Pilha aux = topo;
			String str = "";
			if(aux == null) {
				JOptionPane.showMessageDialog(null,"Pilha vazia!");
			}
			else
			{
				int i = 1;
				while(aux != null) {
					str += i + " " + aux.toString() + "\n";
					aux = aux.getProximo();
					i++;
				}
				JOptionPane.showMessageDialog(null,str);	
			}
			
		}
		
		public void removerDaPilha() {
	        if(topo != null){
	            Pilha temp = new Pilha();
	            temp = topo;
	            topo = topo.getProximo();
	            JOptionPane.showMessageDialog(null, "\n\nElemento " + temp.toString() + "\nFoi removido com sucesso!");
	            temp = null;
	            System.gc();
	            
	        }
	        else{
	               JOptionPane.showMessageDialog(null, "Pilha vazia!");
	        }
	    }			
			
		
		public void removeInicioInsereFila() {
			if(empresa.getInicio() == null) {
				JOptionPane.showMessageDialog(null,"Lista vazia!");
			}
			else
			{
				Fila novo = new Fila();
				novo.setFuncionario(empresa.getInicio().getFuncionario());
				
				if (inicioFila == null) {
					inicioFila = novo;
					fimFila = novo;
				}
				else
				{
		         fimFila.setProximo(novo);
				}
				fimFila = novo;
		        JOptionPane.showMessageDialog(null, "Elemento\n"+ novo.toString() +  "\n\nInserido na Fila com sucesso!");        
		        removerPrimeiro();
			}
		}
		
		public void listarFila() {
			Fila aux = inicioFila;
			String str = "";
			if(aux == null) {
				JOptionPane.showMessageDialog(null,"Fila vazia!");
			}
			else
			{
				int i = 1;
				while(aux != null) {
					str += i + " " + aux.toString() + "\n";
					aux = aux.getProximo();
					i++;
				}
				JOptionPane.showMessageDialog(null,str);
			}
		}
		
		public void removerDaFila() {
	        if(inicioFila != null){
	            Fila temp = new Fila();
	            temp = inicioFila;
	            inicioFila = inicioFila.getProximo();
	            JOptionPane.showMessageDialog(null, "\nElemento " + temp.toString() + "\n\nFoi removido com sucesso!");
	            temp = null;
	            System.gc();
	            
	        }
	        else{
	               JOptionPane.showMessageDialog(null, "Fila vazia!");
	        }			
		}
		
		public void inserirEmQualquerPosicao() {
			int pos;
			int posInicio;
			int posAtual;
			if(empresa.getInicio() != null) {
				No atual = empresa.getInicio();
				String str = "";
				posInicio = atual.getFuncionario().getCodigo();
				posAtual = posInicio;
				while(atual != null) {
					str += atual.getFuncionario().getCodigo() + " - ";
					atual = atual.getProximo();
				}
				atual = empresa.getInicio();
				pos = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha um código para inserir um elemento antes dele na lista ou 000 para inserir no final\n\n" + str));
				if(pos == 000) {
					Funcionario f = new Funcionario();
					f.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o código:")));
					f.setCpf(JOptionPane.showInputDialog("Insira o CPF:"));
					f.setNome(JOptionPane.showInputDialog("Insira o nome:"));
					f.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Insira o salário:")));
					inserirFim(f);
				}
				else
				{
					if(pos == posInicio) {
						Funcionario f = new Funcionario();
						f.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o código:")));
						f.setCpf(JOptionPane.showInputDialog("Insira o CPF:"));
						f.setNome(JOptionPane.showInputDialog("Insira o nome:"));
						f.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Insira o salário:")));
						inserirInicio(f);	
					}
					else 
					{

						while(pos != posAtual) {
							atual = atual.getProximo();
							posAtual = atual.getFuncionario().getCodigo();
	
						}
						Funcionario f = new Funcionario();
						f.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o código:")));
						f.setCpf(JOptionPane.showInputDialog("Insira o CPF:"));
						f.setNome(JOptionPane.showInputDialog("Insira o nome:"));
						f.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Insira o salário:")));
						
						No novo = new No();
						novo.setFuncionario(f);
						novo.setProximo(atual.getAnterior().getProximo());
						novo.setAnterior(atual.getAnterior());
						atual.getAnterior().setProximo(novo);
						atual.setAnterior(novo);
		
						}
						
						
					}
				}

		}
		
		public void alterarElementoQualquerPosicao() {
			int pos;
			int codigo;
			String cpf;
			String nome;
			Double salario;
			No atual = empresa.getInicio();
			String str = "";
			while(atual != null) {
				str += atual.getFuncionario().getCodigo() + " - ";
				atual = atual.getProximo();
			}
			pos = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha um código para alterar na lista\n\n" + str));
			atual = empresa.getInicio();
			while(atual != null) {
				if(atual.getFuncionario().getCodigo() == pos) {
					codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um novo código:\n\nCódigo Atual: " + atual.getFuncionario().getCodigo() ));
					cpf = JOptionPane.showInputDialog(null,"Insira um novo cpf:\n\nCpf Atual: " + atual.getFuncionario().getCpf() );
					nome = JOptionPane.showInputDialog(null,"Insira um novo nome:\n\nCpf Atual: " + atual.getFuncionario().getNome() );
					salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um novo salário:\n\nSalário Atual " + atual.getFuncionario().getSalario()));
					atual.getFuncionario().setCodigo(codigo);
					atual.getFuncionario().setCpf(cpf);
					atual.getFuncionario().setNome(nome);
					atual.getFuncionario().setSalario(salario);
					break;
				}
				atual = atual.getProximo();
			}
		}
		
		public void retirarDeQualquerPosicaoDaLista() {
			if(empresa.getInicio() == null && empresa.getUltimo() == null) {
				JOptionPane.showMessageDialog(null, "Lista vazia!");
			}
			else
			{
				int pos;
				int codigo;
				String cpf;
				String nome;
				Double salario;
				No atual = empresa.getInicio();
				String str = "";
				while(atual != null) {
					str += atual.getFuncionario().getCodigo() + " - ";
					atual = atual.getProximo();
				}
				pos = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha um código para remover da lista\n\n" + str));
				atual = empresa.getInicio();
				while(atual != null) {
					if(atual.getFuncionario().getCodigo() == pos) {
						if(atual.getAnterior() != null)
							atual.getAnterior().setProximo(atual.getProximo());
						else
						{
							atual.setAnterior(null);
							empresa.setInicio(atual.getProximo());
							
						}
						if(atual.getProximo() != null)
						atual.getProximo().setAnterior(atual.getAnterior());
						else
						{	
							atual.setProximo(null);
							empresa.setUltimo(atual.getAnterior());
						
						}
						
						JOptionPane.showMessageDialog(null, "Elemento\n\n" + atual.getFuncionario() + "\n\nRemovido com sucesso!");
						break;
					}
					atual = atual.getProximo();
				}
			}
			
		}

}
