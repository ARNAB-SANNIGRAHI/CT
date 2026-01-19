package interface_codes;

public class MusicPlayerDriver {
	public static void main(String[] args) {

		MusicPlayer player;
		player = new SpotifyPlayer();
		player.play();
		player.pause();
		player.stop();
		
		System.out.println("-----------------------------------");
		
		player = new YoutubeMusicPlayer();
		player.play();
		player.pause();
		player.stop();
	}
}
