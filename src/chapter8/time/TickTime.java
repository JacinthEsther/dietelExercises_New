package chapter8.time;


public class TickTime {

    private Time2 time ;
   private  int second =0;
   private  int minute =0;
   private int hour =0;

    public TickTime(Time2 tickTime) {
        this.time = tickTime;
    }

    public void incrementSeconds() {
        if(time.getSecond() < 59) {
            second = time.getSecond() + 1;
       time.setSecond(second);
        }
        else if(time.getSecond()== 59 && time.getMinute()== 59){
            time.setSecond(0);
            time.setMinute(0);
            incrementHours();
        }
        else if(time.getSecond()== 59 && time.getMinute() < 59){
            time.setSecond(0);
            incrementMinutes();
        }

    }

    public int getSecond() {
        return second;
    }

    public void incrementMinutes() {
        if(time.getMinute()< 59) {
            minute = time.getMinute() + 1;
            time.setMinute(minute);
        }

        else if(time.getMinute() == 59){
            time.setMinute(0);
            incrementHours();
        }


    }

    public int getMinute() {
        return minute;
    }

    public void incrementHours() {
        if(time.getHour() < 23) {
            hour = time.getHour() + 1;
            time.setHour(hour);
        }

    }

    public int getHour() {
        return hour;
    }


    @Override
    public String toString()
    {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
