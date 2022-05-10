package chapter4;

public class Cryptography {
    private  String number;
    private int total;
    private int total2;
    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();

    public Cryptography() {
    }

    public String getRemainder() {
        return sb.toString();
    }

    public void setRemainder(String number) {
        if(  Integer.parseInt(number)/1000 > 0 && Integer.parseInt(number)<10) {
            this.number = number;
        }
        if(number.length()==4){
            for(int i=0; i<number.length(); i++){
                var numberString = Integer.parseInt(String.valueOf(number.charAt(i)));
                total= numberString + 7;
                total2=(numberString +7) % 10;
                sb.append(total);
                sb2.append(total2);

            }
        }
        else throw new ArithmeticException("number length should be 4");
    }
    public int getSize() {
        return number.length();
    }
    public String getRemainderDivisor(){
        return sb2.toString();
    }

    public String getEncryptedDigit() {
        StringBuilder sb = new StringBuilder();

           int  temp = Integer.parseInt(String.valueOf(sb2.charAt(0)));
           int  temp2 = Integer.parseInt(String.valueOf(sb2.charAt(2)));
           int  temp3 = Integer.parseInt(String.valueOf(sb2.charAt(1)));
           int  temp4 = Integer.parseInt(String.valueOf(sb2.charAt(3)));

            sb.append(temp2).append(temp4).append(temp).append(temp3);
        return sb.toString();
    }
}
