/*
* WeeklyPay.java
* @author: Ata Turkoglu & Idil Zehra Tatar
* Date: 14/02/2023
*/

public class WeeklyPay{
    //Declare data members - All private
    private double hour;
    private double rate;
    private double total;
    private double over;

    //Constructor - Same name as the class, give each variable a default value 
    public WeeklyPay(){
        hour = 0.0;
        rate = 0.0;
        total = 0.0;
        over = 0.0;
    }

    //Setters - One for every input variable
    public void setHour(double hour){
        this.hour = hour;
    }
    public void setRate(double rate){
        this.rate = rate;
    }
    public void setOver(double over){
        this.over = over;
    }

    //Compute method(s)
    public void computeTotal(){
        total = (hour*rate)+(over*rate*1.5);
    }

    //Getters - One for every output variable
    public double getTotal(){
        return total;
    }
}