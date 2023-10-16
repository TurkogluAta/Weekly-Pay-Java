/*
* WeeklyPayApp.java
* @author: Ata Turkoglu & Idil Zehra Tatar
* Date: 14/02/2023
*/

import javax.swing.JOptionPane;
public class WeeklyPayApp{
    public static void main(String args[]){
        //Declare variables
        double hour, rate, total, over;

        //Declare objects 
        WeeklyPay myWeeklyPay;

        //Create objects
        myWeeklyPay = new WeeklyPay();

        //Input 
        hour = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter how many hours you work: "));
        myWeeklyPay.setHour(hour);
        rate = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter hourly rate of pay: "));
        myWeeklyPay.setRate(rate);
        over = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter overtime: "));
        myWeeklyPay.setOver(over);

        //Process
        myWeeklyPay.computeTotal();

        //Output
        total = myWeeklyPay.getTotal();
        
        JOptionPane.showMessageDialog(null,"Your weekly pay is "+total+" euro.");
    }
}