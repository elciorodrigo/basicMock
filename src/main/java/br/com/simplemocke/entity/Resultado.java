package br.com.simplemocke.entity;

import java.util.List;

public class Resultado {
	
	private String chave;
	private List<KeyValue> values;
	
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public List<KeyValue> getValues() {
		return values;
	}
	public void setValues(List<KeyValue> values) {
		this.values = values;
	}
	
	public Resultado(String chave, List<KeyValue> values) {
		super();
		this.chave = chave;
		this.values = values;
	}
	@Override
	public String toString() {
		return "Resultado [chave=" + chave + ", values=" + values + ", getChave()=" + getChave() + ", getValues()="
				+ getValues() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	} 
	
	

}
