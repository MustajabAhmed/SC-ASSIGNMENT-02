package javaapplication22;
import java.util.*;

class Song
{
    public String uuid;
    public String title;
    
    public Song()
    {
        uuid = null;
        title = null;
    }
    
    public Song(String uuid, String title)
    {
        this.uuid = uuid;
        this.title = title;
    }
    
    public boolean contains(String text)
    {
        return true;
    }
}

class Player
{
    private float volume;
    private String repeat;
    private ArrayList<Song> queue = new ArrayList<Song>();
    private int current_song;
    
    public Player()
    {
        
    }
    
    public void play_song()
    {
        System.out.println("Play the Song :- " + current_song);
    }
    
    public void repeat_song()
    {
        System.err.println("Repeat the Song :- " + repeat);
    }
    
    public void view_song()
    {
        System.out.println("Current Song is :- " + current_song);
    }
    
    public int get_current_song()
    {
        return current_song;
    }
}

class PlayList
{
    public String uuid;
    public String name;
    private Song song;
    
    public PlayList()
    {
        uuid = null;
        name = null;
    }
    
    public void add(Song song)
    {
        this.song = song;
    }
    
    public void remove(Song song)
    {
        this.song = song;
    }
    
    public void search(Song song)
    {
        System.out.println("Song Found :- " + song);
    }
}

class PlayList_Manager extends PlayList
{
    private PlayList play_list;
    
    public PlayList_Manager()
    {
        
    }
    
    public PlayList create(PlayList name)
    {
        return name;
    }
    
    public PlayList get(PlayList playlist)
    {
        return playlist;
    }
}

class Favourite_Song extends Song
{
    public String uuid;
    public String name;
    private Song song;
    
    public Favourite_Song()
    {
        uuid = null;
        name = null;
    }
    
    public void add(Song song)
    {
        this.song = song;
    }
    
    public void search(Song song)
    {
        System.out.append("Song Found :- " + song);
    }
}
        
public class JavaApplication22 
{
    public static void main(String[] args) 
    {
        Player p = new Player();
        Song s = new Song();
    }
}
