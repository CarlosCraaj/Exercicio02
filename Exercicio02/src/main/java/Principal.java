//package com.ti2cc;

//import com.ti2cc.DAO;
//import com.ti2cc.Usuario;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		Carro carro = new Carro(5, "Sandero", "Renalut",'S');
		if(dao.inserirCarro(carro) == true) {
			System.out.println("Inserção com sucesso -> " + carro.toString());
		}
		
		//Mostrar carros novos		
		System.out.println("==== Mostrar carros novos === ");
		Carro[] carros = dao.getCarrosNovos();
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}

		//Atualizar carro
		carro.setMarca("Renault");
		dao.atualizarCarro(carro);

		//Mostrar Carros
		System.out.println("==== Mostrar carros === ");
		carros = dao.getCarros();
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}
		
		//Excluir Carro
		dao.excluirCarro(carro.getId());
		
		//Mostrar Carros
		carros = dao.getCarros();
		System.out.println("==== Mostrar Carros === ");		
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}
		
		dao.close();
	}
}