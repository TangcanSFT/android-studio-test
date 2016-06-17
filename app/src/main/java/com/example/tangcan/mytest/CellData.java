package com.example.tangcan.mytest;

/**
 * Created by tangcan on 16/4/26.
 */
public class CellData {
    private String roomName;
    private String audienceNum;

    public CellData(String roomName, String audienceNum) {
        this.roomName = roomName;
        this.audienceNum = audienceNum;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }



    public String getAudienceNum() {
        return audienceNum;
    }

    public void setAudienceNum(String audienceNum) {
        this.audienceNum = audienceNum;
    }
}
