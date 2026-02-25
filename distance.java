public class distance {

	public static void main(String[] args) {
		Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);
                                
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));
	}
}


class Point {
    private double xCoordinate;
    private double yCoordinate; 
    public Point(double xCoordinate, double yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    public double getXCoordinate(){
        return xCoordinate;
    }
    public void setXCoordinate(double xCoordinate){
        this.xCoordinate = xCoordinate;
    }
    public double getYCoordinate(){
        return yCoordinate;
    }
    public void getYCoordinate(double yCoordinate){
        this.yCoordinate = yCoordinate;
    }
    public double calculateDistance(){
        double distance;
        distance = Math.sqrt(Math.pow(xCoordinate,2)+Math.pow(yCoordinate,2));
        distance = Math.round(distance*100.0)/100.0;
        return distance;
    }
    public double calculateDistance(Point point){
         double distance = Math.sqrt(
                Math.pow(point.xCoordinate - this.xCoordinate, 2) +
                Math.pow(point.yCoordinate - this.yCoordinate, 2)
        );
        distance = Math.round(distance*100.0)/100.0;
        return distance;
    }
}

