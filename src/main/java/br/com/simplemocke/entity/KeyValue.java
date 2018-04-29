package br.com.simplemocke.entity;

import java.util.Map;

public class KeyValue {
	
	private String key;
	private Map<String, String> values;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Map<String, String> getValues() {
		return values;
	}
	public void setValues(Map<String, String> values) {
		this.values = values;
	}
	
	public KeyValue(String key, Map<String, String> values) {
		super();
		this.key = key;
		this.values = values;
	}
	
	
	

}
