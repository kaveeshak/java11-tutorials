package com.java11.exercises;

import java.util.ArrayList;

public class Album {
    private String name;
    private SongsList songsList;

    public Album(String name) {
        this.name = name;
        songsList = new SongsList();
    }

    public void addSong(String name) {
        if (songsList.addSong(name)) {
            System.out.println("Song " + name + " was added.");
        } else {
            System.out.println("Song " + name + " already exists.");
        }
    }

    public void findSong(String name) {
        if (songsList.findSong(name) != null) {
            System.out.println("Song " + name + " was found.");
        } else {
            System.out.println("Song " + name + " was not found.");
        }
    }

    private class SongsList {
        private ArrayList<String> songs;

        public SongsList() {
            songs = new ArrayList<String>();
        }

        public boolean addSong(String name) {
            if (!songs.contains(name)) {
                songs.add(name);
                return true;
            }
            return false;
        }

        public String findSong(String name) {
            int songIndex = songs.indexOf(name);
            if (songIndex >= 0) {
                return songs.get(songIndex);
            }

            return null;
        }
    }
}
