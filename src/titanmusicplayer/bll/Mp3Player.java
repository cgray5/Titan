/*Class to control actual mp3 functions such as
 * play and stop.
 */
package titanmusicplayer.bll;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

/**
 *Created by Carolyn Gray
 */

public class Mp3Player 
{   
    private String fileName;
    private Player player;
     
    public Mp3Player(String fileName)
    {
      this.fileName = fileName;     
    }
    
    /* Will play mp3 when play button is pressed unless  
     * there is a problem such as the file location being incorrect, 
     * then an error message is shown.
     */
    public void play() 
    {
     
       try
        {  
            FileInputStream fis = new FileInputStream(fileName);  
            BufferedInputStream bis = new BufferedInputStream(fis);  
            player = new Player(bis);  
            player.play();
            
        }  
        catch (Exception e) 
        {  
            System.out.println("Oops, there was a problem playing" + fileName + "!" );  
            System.out.println(e);  
        }
      
     }
    
    //Will stop mp3 from playing when play button is pressed.
    public void stop()
    {
      if (player != null) 
      player.close();
    }
}    
   