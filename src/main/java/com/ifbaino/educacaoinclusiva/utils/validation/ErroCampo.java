package com.ifbaino.educacaoinclusiva.utils.validation;

public class ErroCampo {
	  private final String nomeCampo;
	    private final Object valorInserido;
	    private final String mensagemErro;



	    public ErroCampo(String nomeCampo, Object valorInserido, String mensagemErro) {
	        this.nomeCampo = nomeCampo;
	        this.valorInserido = valorInserido;
	        this.mensagemErro = mensagemErro;
	    }

	    public Object getValorInserido() {
	        return valorInserido;
	    }

	    public String getMensagemErro() {
	        return mensagemErro;
	    }


	    public String getNomeCampo() {
	        return nomeCampo;
	    }
}
