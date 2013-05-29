
public abstract class AI {
	protected Field field;
	private int fieldSize;
	private byte myColor;
	private byte opponentColor;
	
//	JTextArea ta;
	
	public AI(int field_size, byte my_color, byte opponent_color){
		fieldSize = field_size;
		field = new Field(fieldSize);
		myColor = my_color;
		opponentColor = opponent_color;
		
/*		ta = new JTextArea();
		myFrame frame = new myFrame(ta);
		frame.setVisible(true);
		ta.append(String.valueOf(my_color));
		*/
	}
	
	public abstract Position getMove();
	
	public void opponentMove(int x, int y){
		try {
			field.putPiece(opponentColor, new Position(x,y));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected final byte getMyColor(){
		return myColor;
	}
	
	protected final byte getOpponentColor(){
		return opponentColor;
	}
}
