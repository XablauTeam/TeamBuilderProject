package api.exceptions;

public class ConnectionException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConnectionException(String erro){
		super(erro);
	}
}
