class Salary_avg {
    
    public static double[] findDetails(double[] salary) {
        
        double sum = 0;
        
        for(int i = 0; i < salary.length; i++){
            sum += salary[i];
        }
        
        double average = sum / salary.length;
        
        int greaterCount = 0;
        int lesserCount = 0;
        
        for(int i = 0; i < salary.length; i++){
            if(salary[i] > average){
                greaterCount++;
            }
            else if(salary[i] < average){
                lesserCount++;
            }
        }
        double[] result = new double[3];
        result[0] = average;
        result[1] = greaterCount;
        result[2] = lesserCount;
        
        return result;     
    }
       
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}
