package herancamult;

public class TV extends EquipamentoEletronico implements IControle{
	
	private String marca;
	private String modelo;
	private boolean estado;
	private int volume;
	private int canal;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if (volume >= 0 && volume <=100)
			this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	@Override
	public boolean ligaDesliga() {
		if (estado) {
			setEstado(false);
			return false;
		} else {
			setEstado(true);
			return true;
		}
	}
	@Override
	public int alterarCanal(int canal) {
		if (canal <= 42 && canal > 0) {
			setCanal(canal);
			return canal;
		} else
			return this.canal;
	}
	@Override
	public int canalMais() {
		if (canal < 42) 
			setCanal(canal + 1);
		else 
			setCanal(1);
		return canal;
	}
	@Override
	public int canalMenos() {
		if (canal > 1) 
			setCanal(canal - 1);
		else 
			setCanal(42);
		return canal;
	}
	@Override
	public int volumeMais() {
		if (volume < 100)
			setVolume(volume + 1);
		return volume;
	}
	@Override
	public int volumeMenos() {
		if (volume > 0)
			setVolume(volume - 1);
		return volume;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TV [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", volume=");
		builder.append(volume);
		builder.append(", canal=");
		builder.append(canal);
		builder.append("]");
		return builder.toString();
	}
	
}
