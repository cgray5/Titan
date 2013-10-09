/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package titanmusicplayer.bll;

import java.util.*;

/**
 *Created by Carolyn Gray
 */

public class Library 
{
    public AudioFile audioFile;
    public List<AudioFile> library = new ArrayList<>();
    
    public Library()
    { 
    }
    
    public Library(AudioFile audioFile)
    {
    }
   
    public void addAudioFile(AudioFile newAudioFileToAdd)
    {
      library.add(newAudioFileToAdd);
    }
    
    public void deleteAudioTitle(AudioFile audioFileToDelete)
    {
      library.remove(audioFileToDelete);
    }
}

