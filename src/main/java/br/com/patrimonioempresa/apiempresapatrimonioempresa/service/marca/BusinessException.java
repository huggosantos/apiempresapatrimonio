package br.com.patrimonioempresa.apiempresapatrimonioempresa.service.marca;

public class BusinessException extends Exception {
	
	public BusinessException() {}
	public BusinessException(String message) {super(message);}
	public BusinessException(String message, Throwable cause) {super(message, cause);}
	
	private static final long serialVersionUID = 1L;
}

