package chapter8.time;

public class Time2 {

    private int hour;
    private int minute;
    private int second;
    private int numberOfSecondsSinceMidnight=0;

    public Time2(int hour, int minute, int second) {
        validate(hour, minute, second);
        numberOfSecondsSinceMidnight = ((hour*3600) + (minute*60) + second);

    }

    private void validate(int hour, int minute, int second) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    private void validateSecond(int second) {
        if(second < 0 || second > 59){
            throw new TimeException("hour range should be 0-23");
        }
        this.second=second;
    }

    private void validateMinute(int minute) {
        if(minute < 0 || minute > 59){
            throw new TimeException("hour range should be 0-23");
        }
        this.minute = minute;
    }

    private void validateHour(int hour) {
        if(hour < 0 || hour > 23){
            throw new TimeException("hour range should be 0-23");
        }
        this.hour = hour;
    }

    public Time2(int hour, int minute) {
        this(hour,minute,0);
    }

    public Time2(int hour) {
        this(hour,0,0);
    }

    public Time2(Time2 time){
        this(time.getHour(),time.getMinute(),time.getSecond());
    }

    public void setHour(int hour) {
        validateHour(hour);
        numberOfSecondsSinceMidnight = ((hour*3600) + (minute*60) + second);

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        numberOfSecondsSinceMidnight = ((hour*3600) + (minute*60) + second);

    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSecond(second);
        numberOfSecondsSinceMidnight = ((hour*3600) + (minute*60) + second);

    }

    public int getHour() {
        return hour;
    }

    public int getNumberOfSecondsSinceMidnight() {
        return numberOfSecondsSinceMidnight;
    }


   public String toUniversalString()
 {
      return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
        }

        // convert to String in standard-time format (H:MM:SS AM or PM)
         public String toString()
 {
         return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                 getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
         }
}
