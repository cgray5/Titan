/*
 *Audio file class reprsents mp3 files
 * by name and artist;
 */
package titanmusicplayer.bll;

/**
 *Created by Carolyn Gray
 */

public class AudioFile 
{
   private String audioTitle;
   private String artist;
   
    
 public AudioFile(String audioTitle, String artist)
    {
        this.audioTitle = audioTitle;
        this.artist = artist;  
    }
    
    public void setAudioTitle(String audioTitleAdded)
    {
      audioTitle = audioTitleAdded;
    }    
    
    public void setArtist(String artistAdded)
    {
        artist = artistAdded;
    }

    /**
     * @return the audioTitle
     */
    public String getAudioTitle() {
        return audioTitle;
    }

    /**
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }
    
    public String tostring()
    {
      return audioTitle + " " + artist;
    }
}
