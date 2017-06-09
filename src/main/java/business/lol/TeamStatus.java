package business.lol;

public enum TeamStatus {

	INCOMPLETE("Incompleto"), COMPLETE("Completo");

	private final String name;

	private TeamStatus(String name) {
			this.name = name;
		}

	public String getName() {
		return this.name;
	}

}
