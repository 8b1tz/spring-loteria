package br.com.ifpb.loteria.modelo;

import java.util.List;

public class Aposta {

	private Integer id;
	
	private Cliente cliente;
	
	private List<Integer> apostas;
	
	private Sorteio sorteio;

	public Aposta() {}
	
	public Aposta(Integer id, Cliente cliente, List<Integer> aposta, Sorteio sorteio) {
		this.id = id;
		this.cliente = cliente;
		this.sorteio = sorteio;
	}

	public Integer getId() {
		return id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void adicionarAposta(Aposta aposta) {
		apostas.add(aposta.getId());
	}

	public void setApostas(List<Integer> apostas) {
		this.apostas = apostas;
	}

	public Sorteio getSorteio() {
		return sorteio;
	}

	public void setSorteio(Sorteio sorteio) {
		this.sorteio = sorteio;
	}

}