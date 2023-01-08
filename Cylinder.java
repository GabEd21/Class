public class Cylinder extends Circle{

    private double height;
    
    public Cylinder(){
        super();
        this.height = 0;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    
    public void setHeight(double height){
        this. height =  height;
    }
    
    public double volume(){
        return 3.142 * Math.pow(super.area_radius(),2) * this.height;
    }
    
    public double diameter(){
        return 2 * Math.sqrt(volume()/(3.142 * this.height));
    }
    
    public double surface_area(){
        return (2 * 3.142 * super.area_radius() * this.height) + (2 * 3.142 * Math.pow(super.area_radius(),2));
    }
}
