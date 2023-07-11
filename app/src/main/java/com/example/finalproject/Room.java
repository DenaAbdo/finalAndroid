package com.example.finalproject;

public class Room {
    private String room;
    private String area;
    private String num;

    public static final Room[] rooms = {

    };


    private Room(String room, String area, String num){
        this.room = room;
        this.area = area;
        this.num = num;
    }
    public String getRoom(){return room;}
    public String getArea(){return area;}
    public String getNum(){return num;}

}
