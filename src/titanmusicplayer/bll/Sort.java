/*Classs sorts library and playlist 
 *by title or artist.
 */

package titanmusicplayer.bll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *Created by Carolyn Gray
 */

//sort by artist
public class Sort 
{

 static final Comparator<AudioFile> artistSort = new Comparator<AudioFile>() 
 {
     @Override
     public int compare(AudioFile audio1, AudioFile audio2) 
     {
       return audio2.getArtist().compareTo(audio1.getArtist());
     }  
};

//sort by title of mp3
 public static final Comparator<AudioFile> titleSort = new Comparator<AudioFile>() 
 {
     @Override
     public int compare(AudioFile audio1, AudioFile audio2) 
     {
       return audio2.getAudioTitle().compareTo(audio1.getAudioTitle());
     }  
 };  

/*Allows access to sort methods by
 * library and playlist
 */
public void sortByArtist(ArrayList list)
{
 Collections.sort(list, artistSort);
}

public void sortByTitle(ArrayList list)
{
 Collections.sort(list, titleSort);   
}
}