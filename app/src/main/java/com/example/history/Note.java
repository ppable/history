package com.example.history;

public class Note {
    int _id;
    String songname;
    String singername;

    public Note(int _id, String songname, String singername){
        this._id = _id;
        this.songname = songname;
        this.singername = singername;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getSongname() { return songname; }

    public void setSongname(String songname) {this.songname = songname;}

    public String getSingername() { return singername; }

    public void setSingername(String singername) {this.singername = singername;}
}
