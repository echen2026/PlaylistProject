/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist yunomilesbesthits = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        Song indianajones = new Song("Indian Jones", "Yuno Miles", 63);
        Song fourwheeler = new Song("4 Wheeler", "Yuno Miles", 106);
        Song firstdayofchristmas = new Song("First Day of Christmas", "Yuno Miles", 121);
        Song spiderpig = new Song("Spider Pig", "Hans Zimmer", 64);
        Song fivehundredlbs = new Song("500 lbs", "Lil Tecca", 142);

        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */

        yunomilesbesthits.addSong(indianajones);
        yunomilesbesthits.addSong(fourwheeler);
        yunomilesbesthits.addSong(firstdayofchristmas);
        yunomilesbesthits.addSong(spiderpig);
        yunomilesbesthits.addSong(fivehundredlbs);

        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        yunomilesbesthits.listSongs();

        System.out.println("\nLiking the songs 'Indiana Jones' and 'Spider Pig'\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        yunomilesbesthits.likeSong(indianajones);
        yunomilesbesthits.likeSong(spiderpig);

        System.out.println("Printing the songs...\n");

        yunomilesbesthits.listSongs();

        System.out.println("\nRemoving the songs '4 Wheeler' and 'Spider Pig'\n");

        yunomilesbesthits.removeSong(fourwheeler);
        yunomilesbesthits.removeSong(spiderpig);

        System.out.println("Printing the songs...\n");

        yunomilesbesthits.listSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!

        yunomilesbesthits.listLikedSongs();

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds

        System.out.println(yunomilesbesthits.getPlaylistDuration());


        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        yunomilesbesthits.removeUnlikedSongs();


        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        yunomilesbesthits.listSongs();
        System.out.println();
    }
}
