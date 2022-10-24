package izabela.franca.tictactoe.core;

public class Move {

	private int l;
	private int c;
	
	public Move(String moveStr) {
		String[] tokens = moveStr.split(",");
		
		this.l = Integer.parseInt(tokens[0]);
		this.c = Integer.parseInt(tokens[1]);
		
		//TODO String validation
	}

	public int getL() {
		return l;
	}

	public int getC() {
		return c;
	}

}
