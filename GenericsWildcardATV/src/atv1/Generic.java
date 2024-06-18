package atv1;

public class Generic<T> {
	private T type;
	
	public Generic(T type) {
		this.type = type;
	}

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}
	
}
