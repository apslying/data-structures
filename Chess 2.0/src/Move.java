
public class Move {
	public int piece;
	public int beginfile;
	public int beginrank;
	public int endfile;
	public int endrank;

	
	public Move(int piece, int beginfile, int beginrank, int endfile,
			int endrank) {
		this.piece = piece;
		this.beginfile = beginfile;
		this.beginrank = beginrank;
		this.endfile = endfile;
		this.endrank = endrank;
	}
	
	public void printFields(){
		System.out.println(piece);
		System.out.println(beginfile);
		System.out.println(beginrank);
		System.out.println(endfile);
		System.out.println(endrank);

	}
	
	

	
}
