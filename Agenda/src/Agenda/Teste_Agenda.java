package Agenda;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Teste_Agenda {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog(null, "Entre com o nome da agenda");

		Agenda agenda = new Agenda();
		agenda.setNome(nome);

		List<Contatos> contatos = new ArrayList<Contatos>();
		String N = JOptionPane.showInputDialog("Quantos contatos irá cadastrar na agenda?");
        int n = Integer.valueOf(N);
        
		for (int i = 0; i < n; i++) {

			JOptionPane.showMessageDialog(null, "Entre com as informações do contato " + (i + 1));
			String nome1 = JOptionPane.showInputDialog(null, "Entre com o nome:");

			String telefone1 = JOptionPane.showInputDialog("Entre com o telefone");

			String email1 = JOptionPane.showInputDialog("Entre com o E-mail:");

			Contatos c = new Contatos();

			c.setNome(nome1);
			c.setTelefone(telefone1);
			c.setEmail(email1);

			contatos.add(c);

		}
		
		JOptionPane.showMessageDialog(null,"Informações dos contatos:\n");
		

		for (Contatos cont : contatos) {
			JOptionPane.showMessageDialog(null,cont);  //* To String *//

		}
	}
}
