
public class Menu {

		private int opcaoMenu;
		public boolean sair = false;
		

		public int getOpcaoMenu() {
			return opcaoMenu;
		}

		public void setOpcaoMenu(int opcaoMenu) {
			if (((opcaoMenu >= 0) && (opcaoMenu <= 5))){
				this.opcaoMenu = opcaoMenu;
			
			}
			
		}
	}

