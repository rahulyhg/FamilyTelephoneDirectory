package com.example.sysucjl.familytelephonedirectory.data;

/**
 * Created by Administrator on 2016/4/7.
 */
public class RecordSegment {
    private int id;// ID
    private int type;// 类型
    long CallTime;// 打电话时间
    long Duration;//通话时长

    public RecordSegment(int id,int type, long callTime, long duration) {
        this.id = id;
        CallTime = callTime;
        this.type = type;
        Duration = duration;
    }

    public int getId(){
        return id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getCallTime() {
        return CallTime;
    }

    public void setCallTime(long callTime) {
        CallTime = callTime;
    }

    public long getDuration() {
        return Duration;
    }

    public void setDuration(long duration) {
        Duration = duration;
    }
}
