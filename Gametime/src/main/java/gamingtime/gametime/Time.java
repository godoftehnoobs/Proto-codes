package gamingtime.gametime;
public class Time {
    private String gamer;
    private double ingametime;
    private int gametitlecount;  

    public Time(String gamer){
        this.gamer=gamer;
        this.ingametime=0;
        this.gametitlecount=0;
}

    public void calcTotalgametime(double time){
    if(time>=0){
        ingametime += time;
        gametitlecount++;
    }
}        

    public double getTime(){
        return ingametime;
}
    public String getName(){
        return gamer;
}
    public int getGameCount(){
        return gametitlecount;
}
    
}

