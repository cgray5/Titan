/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package titanmusicplayer.bll;

import java.util.ArrayList;

/**
 *Created by Carolyn Gray
 */

public class Playlist 
{
   public Playlist playlistName;
   public ArrayList<AudioFile> audioFilePlaylist = new ArrayList<>(); //actual Playlists that will be created, in form of arraylist.
   
   public Playlist(Playlist playlistName, ArrayList audioFilePlaylist)
   {
     this.playlistName = playlistName; 
     this.audioFilePlaylist = audioFilePlaylist;
   }
   
   public void setPlaylistName(Playlist newPlaylistName)
   {
     playlistName = newPlaylistName;   //set playlist name
   }
   
   public void createPlaylist(ArrayList newAudioFilePlaylist)
   {
     audioFilePlaylist = newAudioFilePlaylist;  //create new playlist 
   }
}
