package abstraction;

public abstract class Game {
	public abstract void start();
	public abstract void end();
	
		public void play() {
			start();
			System.out.println("Game is plating...");
			end();
		}
		public static void main(String[] args) {
			Game game;
			
			game = new Cricket();
			game.play();
			
			System.out.println();
			
			game = new Football();
			game.play();	
		}
	}
class Cricket extends Game{
	public void start() {
		System.out.println("Cricket game started");
	}
	public void end() {
		System.out.println("Cricket game ended");
	}
	
}
class Football extends Game{
	public void start() {
		System.out.println("Football game started");
	}
	public void end() {
		System.out.println("Football game ended");
	}
	
}
