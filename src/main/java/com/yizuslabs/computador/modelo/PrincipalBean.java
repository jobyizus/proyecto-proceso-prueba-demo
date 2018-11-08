package com.yizuslabs.computador.modelo;

import java.io.Serializable;

public class PrincipalBean implements Serializable {
	
	private String content;
	private static final long serialVersionUID=1L;
		

	public PrincipalBean(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
}
