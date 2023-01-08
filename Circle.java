public class Circle{

    private double diameter;
    private double circumference;
    private double area;
    
    public Circle(){
        
    }
    
    public double getDiameter(){
        return this.diameter;
    }
    
    public double getCircumference(){
        return this.circumference;
    }
    
    public double getArea(){
        return this.area;
    }
    
    
    //Mutator Method
    
    public void setDiameter(double diameter){
        this.diameter = diameter;
    }
    
    public void setCircumference(double circumference){
        this.circumference = circumference;
    }
    
    public void setArea(double area){
        this.area = area;
    }
    
    public double diameter_radius(){
        return this.diameter/2;
    }
    
    public double circumference_radius(){
        return this.circumference / (2*3.142);
    }
    
    public double area_radius(){
        return Math.sqrt(this.area/3.142);
    }
}
