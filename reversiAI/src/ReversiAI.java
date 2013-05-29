import java.util.Scanner;

public class ReversiAI {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		AI ai = new AI();
		
		Scanner scan = new Scanner(System.in);
		
		String color_string;
		int size;		
		
		byte mycolor;
		byte opponentcolor;
		size = scan.nextInt();
		color_string = scan.next();
		
		if(color_string.equals("black")){
			mycolor = Piece.black;
			opponentcolor = Piece.white;
		}else{
			mycolor = Piece.white;
			opponentcolor = Piece.black;			
		}
		
		AI ai = new PrimitiveAI(size, mycolor, opponentcolor); // ここを変えればアルゴリズムがごっそり代えれる
		
		while(true){
			String str = scan.next();

			if(str.equals("over")){
				break;
			}else if(str.equals(color_string)){
				Position pos = ai.getMove();
				System.out.printf("%d %d\n",pos.x,pos.y);
				System.out.flush();
				
				// 自分の手が入力されるため読み捨てる
				scan.nextInt();
				scan.nextInt();
				
			}else{
				int x = scan.nextInt();
				int y = scan.nextInt();
				ai.opponentMove(x, y);
			}
		}
		scan.close();
	}

}
