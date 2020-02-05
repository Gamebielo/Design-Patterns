package br.com.engine;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import br.com.model.DAO.AgendamentoDAO;
import br.com.model.DAO.CarroDAO;
import br.com.model.DAO.ClienteDAO;

public class EngineData {

	

	public void salvaInfo() {
		try {
			File file = new File("/home/lucas/Documentos/info.txt");
			
			if(file.exists()) 
				file.delete();
			
			ClienteDAO cliDAO = new ClienteDAO();
			CarroDAO carDAO = new CarroDAO();
			AgendamentoDAO ageDAO = new AgendamentoDAO();
			
			cliDAO.salvaCliente();
			carDAO.salvaCarros();
			ageDAO.salvaAgendamento();
			
			JOptionPane.showMessageDialog(null, "As informacoes foram salvas no computador.");

		} catch (IOException e) {
			System.err.println("erro ao salvar informações no disco: "+e);
		}
	}
}
