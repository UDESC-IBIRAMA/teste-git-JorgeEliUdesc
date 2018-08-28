import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Lista lista = new Lista();
		int op = -1;
		while(op != 0) {
			op = Integer.parseInt(JOptionPane.showInputDialog(  "1 - Inserir início\n" +
																"2 - Remover primeiro\n" +
																"3 - Inserir fim\n" +
																"4 - Remover último\n" +
																"5 - Listar do início ao fim\n" + 
																"6 - Listar do último para o início\n" +
																"7 - Remover último e inserir na Pilha\n" +
																"8 - Remover início e inserir na Fila\n" +
																"9 - Listar Pilha\n" +
																"10 - Listar Fila\n" +
																"11 - Remover da Pilha\n" +
																"12 - Remover da Fila\n" +
																"13 - Inserir em qualquer posição da Lista\n" +
																"14 - Listar lista Ordenada\n" +
																"15 - Alterar qualquer posição da lista\n" +
																"16 - Remover de qualquer posição da lista\n" +
					                                            " 0 - Sair"));
			switch(op) {
			case 1:
				Funcionario f = new Funcionario();
				f.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o código:")));
				f.setCpf(JOptionPane.showInputDialog("Insira o CPF:"));
				f.setNome(JOptionPane.showInputDialog("Insira o nome:"));
				f.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Insira o salário:")));
				lista.inserirInicio(f);
				break;
			case 2:
				lista.removerPrimeiro();
				break;
			case 3:
				Funcionario f2 = new Funcionario();
				f2.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o código:")));
				f2.setCpf(JOptionPane.showInputDialog("Insira o CPF:"));
				f2.setNome(JOptionPane.showInputDialog("Insira o nome:"));
				f2.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Insira o salário:")));				
				lista.inserirFim(f2);
				break;
			case 4:
				lista.removerUltimo();
				break;
			case 5:
				lista.listarPrimeiroParaUltimo();
				break;
			case 6:
				lista.listarUltimoParaPrimeiro();
				break;
			case 7:
				lista.removeUltimoInserePilha();
				break;
			case 8:
			    lista.removeInicioInsereFila();
			    break;
			case 9:
				lista.listarPilha();
				break;
			case 10:
				lista.listarFila();
				break;
			case 11:
				lista.removerDaPilha();
				break;
			case 12:
				lista.removerDaFila();
				break;
			case 13:
				lista.inserirEmQualquerPosicao();
				break;
			case 14:
				lista.inserirEmQualquerPosicao();
				break;
			case 15:
				lista.alterarElementoQualquerPosicao();
				break;
			case 16:
				lista.retirarDeQualquerPosicaoDaLista();
			}
		}
		System.exit(0);
	}

}
