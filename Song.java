/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String name;
    private String artist;
    private int duration; //in seconds
    private boolean isLiked;



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String myName, String myArtist, int myDuration, boolean myIsLiked){
        name = myName;
        artist = myArtist;
        duration = myDuration;
        isLiked = myIsLiked;
    }

    public Song(String myName, String myArtist, int myDuration){
        name = myName;
        artist = myArtist;
        duration = myDuration;
        isLiked = false;
    }




     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

      public void like(boolean myIsLiked){
        isLiked = myIsLiked;
      }

      public String getName(){
        return name;
      }


}
