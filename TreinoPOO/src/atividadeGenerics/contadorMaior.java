package atividadeGenerics;

public class contadorMaior<E> {
	private E element;

	public contadorMaior(E element) {
		this.element = element;
	}
	
	public E getElement() {
		return element;
	}
	public void setElement(E element) {
		this.element = element;
	}
	
	
}
