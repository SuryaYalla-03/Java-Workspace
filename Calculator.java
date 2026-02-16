class Calculator{
    public double findAverage(int num1, int num2, int num3){
        Double avg = (num1+num2+num3)/3.0;
        avg = Math.round(avg*100.0)/100.0;
        return avg;
        
    }
    
}

public class Tester extends Calculator{
    public static void main(String args[]){
        Calculator cal = new Calculator();
        Double Average = cal.findAverage(12,8,15);
        System.out.println(Average);
        
    } 
    
}
