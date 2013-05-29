
public class PrimitiveAI extends AI {

	public PrimitiveAI(int field_size, byte my_color, byte opponent_color){
		super(field_size, my_color, opponent_color);
	}
	@Override
	public Position getMove() {
		// TODO 自動生成されたメソッド・スタブ
		for(int y = 0; y<field.getFieldSize(); y++){
			for(int x = 0; x<field.getFieldSize(); x++){
				Position p = new Position(x,y);
				if(field.putable(getMyColor(), p)){
					try{
						field.putPiece(getMyColor(),p);
						return new Position(x,y);
					}catch(Exception e){
						
					}
				}

			}
		}
		return new Position(0,0);
	}
}
