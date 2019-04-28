package Homework_21.StorageForAudioTracks;

public class PlayList {
    private AudioTrack[] listOfTracks;
    private int n;

    public PlayList(int size) {
        this.listOfTracks = new AudioTrack[size];
    }

    public void add(AudioTrack track) {
        for (int i = 0; i < n; i++) {
            if(track.compareTo(listOfTracks[i]) < 0) {
                listOfTracks[i] = track;
            }
            if (track.compareTo(listOfTracks[i])> 0) {
                listOfTracks[i+1] = track;
            }
        }
    }
}
