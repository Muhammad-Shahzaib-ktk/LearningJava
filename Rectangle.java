 
 class area{
    double length;
    double width;
    public double getarea(){
        return length * width;
    }
 }


public class Rectangle {
    public static void main(String[] args){

        

        area Area1= new area();
        Area1.length =9.53;
        Area1.width = 11.44;
        System.out.println(Area1.getarea());


    }

}
