package interface_codes;

public interface MusicPlayer {
	void play();

	void pause();

	void stop();
}

class SpotifyPlayer implements MusicPlayer {

	@Override
	public void play() {
		System.out.println("Spotify is playing");

	}

	@Override
	public void pause() {
		System.out.println("Spotify has paused");

	}

	@Override
	public void stop() {
		System.out.println("Spotify has stopped");
	}

}

class YoutubeMusicPlayer implements MusicPlayer {

	@Override
	public void play() {
		System.out.println("Youtubeis playing");
	}

	@Override
	public void pause() {
		System.out.println("Youtube has paused");

	}

	@Override
	public void stop() {
		System.out.println("Youtube has stopped");
	}

}