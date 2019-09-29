/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Box;

/**
 *
 * @author joan
 */
public class Box {
    
     public static void main(String[] args) {
      // Constructing a Shape instance poses problem!
     
      Box s1 = new Rectangle2(2, 3, 4);  // Upcast
      System.out.println(s1);  // Run Rectangle's toString()
      System.out.println("Box a surface area: " + s1.getArea());  // Run Rectangle's getArea()
      
       Box s2 = new Rectangle2(4, 7, 4);  // Upcast
      System.out.println(s2);  // Run Rectangle's toString()
      System.out.println("Box b surface area: " + s2.getArea());
      
      System.out.print("Check if Box a and Box b are equal? ");
      if(s1==s2){
          System.out.println("true");
      }
      else{
          System.out.println("false");
      }
      
      IsoscelesRight trngle = new IsoscelesRight(3);
      Geometric4Tester geo = new Geometric4Tester();
      
      System.out.println("IsoscelesRight c area: " + trngle.toString());
      System.out.println("IsoscelesRight c area: " + trngle.getArea());
      System.out.println("IsoscelesRight d area: " + trngle.toString());
      System.out.println("IsoscelesRight d area: " + trngle.getArea());
      System.out.println("Check if IsoscelesRight c and IsoscelesRight d are equal? " + trngle.chckr());
      
   }
   
   // Constructor
   public Box () {
      
   }
   
   // All shapes must have a method called getArea().
   public double getArea() {
      // We have a problem here!
      // We need to return some value to compile the program.
      System.err.println("Shape unknown! Cannot compute area!");
      return 0;
   }
    public static  class Rectangle2 extends Box {
   // Private member variables
   private int length;
   private int width;
   private int base;
   private int height;
   
   // Constructor
   public Rectangle2(int l, int w, int h) {
      this.length = l;
      this.width = w;
      this.base = base;
      this.height = h;
   }
   
   @Override
   public String toString() {
      return "Box a: [Box: length=" + length + ",width=" + width + ",height=" + height + "]";
   }
   
   // Override the inherited getArea() to provide the proper implementation
   @Override
   public double getArea() {
      return 2*length*width +  2*length*height + 2*width*height;
   }
   
 }//end of Rectangle2 class
 
 public static class Triangle2{
    
     double equalSide = 3,length,area;
     String answr;
     
     public String chckr(){
         if(equalSide==equalSide){
             answr = "true";
         }
         else{
             answr = "false";
         }
         return answr;
     }
     
     public double getArea(){
         area = (equalSide*equalSide)/2;
         return area;
     }
 }
 public static class IsoscelesRight extends Triangle2{
     
     public IsoscelesRight(double equalSd){
         
     }
     
     public double getequalSide(){
         return equalSide;
     }
     
     public double getNotequalSide(){
         length = equalSide*Math.sqrt(2.0);
         return length;
     }
     
     public String toString(){
         return "IsoscelesRight c: [IsoscelesRight: equal side=" + getequalSide() + "non-equal side=" + getNotequalSide() + "]";
     }
 }//end of IsoscelesRight class
  
    public static class Geometric4Tester{
        public Geometric4Tester(){
            IsoscelesRight tst = new IsoscelesRight(3);
            tst.equalSide = 3.0;
        }
    }
 
}