import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist() {
        playlist = new ArrayList<Song>();
    }

      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */

       public void addSong(Song mySong){
          playlist.add(mySong);
       }

       public void likeSong(Song mySong){
          for(int i = 0; i < playlist.size(); i++){
            if (playlist.get(i).equals(mySong)){
              mySong.like(true);
            }
          }
       }

       public void unlikeSong(Song mySong){
        for(int i = 0; i < playlist.size(); i++){
            if (playlist.get(i).equals(mySong)){
              mySong.like(false);
            }
          }
       }

       public void removeSong(Song mySong){
          for(int i = 0; i < playlist.size(); i++){
            if (playlist.get(i).equals(mySong)){
              playlist.remove(i);
            }
          }
       }

       public String getPlaylistDuration(){

        
          int total = 0;
          for(int i = 0; i < playlist.size(); i++){
            total += playlist.get(i).getDuration();
          }


          int minutes = total/60;
          int seconds = total%60;
           String finalSeconds = "";
           if(seconds<10){
             finalSeconds = "0" + Integer.toString(seconds);
           } else {
             finalSeconds = Integer.toString(seconds);
           }
           return minutes+":"+finalSeconds;
       }

       public void listSongs(){
          for(int i = 0; i < playlist.size(); i++){
            System.out.println(playlist.get(i).toString());
          }
       }

       public void listLikedSongs(){
          for(int i = 0; i < playlist.size(); i++){
            if(playlist.get(i).getIsLiked()){
              System.out.println(playlist.get(i).toString());
            }
          }
       }

       public void removeUnlikedSongs(){
          for(int i = 0; i < playlist.size(); i++){
            if(playlist.get(i).getIsLiked()==false){
              playlist.remove(i);
              i--;
            }
          }
       }

}
