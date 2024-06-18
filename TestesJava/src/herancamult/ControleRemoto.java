package herancamult;

public class ControleRemoto extends EquipamentoEletronico implements IControle{

	private int cargaPilha;

	public int getCargaPilha() {
		return cargaPilha;
	}

	public void setCargaPilha(int cargaPilha) {
		this.cargaPilha = cargaPilha;
	}

	@Override
	public boolean ligaDesliga() {
		return false;
	}

	@Override
	public int alterarCanal(int canal) {
		return 0;
	}

	@Override
	public int canalMais() {
		return 0;
	}

	@Override
	public int canalMenos() {
		return 0;
	}

	@Override
	public int volumeMais() {
		return 0;
	}

	@Override
	public int volumeMenos() {
		return 0;
	}
	
	
	
}
