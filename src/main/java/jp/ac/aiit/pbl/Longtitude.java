package jp.ac.aiit.pbl;

public class Longtitude {
    private int degree;
    private int minute;
    private int second;
    
    Longtitude(int degree, int minute, int second){
        this.degree = degree;
        this.minute = minute;
        this.second = second;
    }
    
    public int getDegree() {
        return degree;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public int getSecond() {
        return second;
    }
    
    @Override
    public String toString() {
        return "{" +
                "degree=" + degree +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
