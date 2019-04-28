package Homework_21.StorageForAudioTracks;

public class AudioTrack implements Comparable<AudioTrack> {
    private Integer duration;
    private String title;
    private String author;

    public AudioTrack(int duration, String title, String author) {
        this.duration = duration;
        this.title = title;
        this.author = author;
    }

    @Override
    public int compareTo(AudioTrack o) {
        int result = this.duration.compareTo(o.duration);
        if (duration != o.duration) {
            return result;
        }else {
            int result1 = this.title.compareTo(o.title);
            if (title != o.title) {
                return result1;
            } else {
                int result2 = this.author.compareTo(o.author);
                return result2;
            }
        }
    }
}
