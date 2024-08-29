import java.util.*;
class Amazon
{
    private double width,height,depth;
    Amazon(Amazon ob)
    {
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    Amazon(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    double vol()
    {
      return width*depth*height;
        }

}
class Order extends Amazon
{
    double weight;
    Order(Order obj)
    {
        super(obj);
        weight=obj.weight;
    }
    Order(double w,double h,double d,double m)
    {
        super(w,h,d);
        weight=m;
    }
    double further()
    {
        return weight*vol();
    }
}

class Shipment extends Order
{
    double cost;
    Shipment(Shipment object)
    {
        super(object);
        cost=object.cost;
    }
    Shipment(double w,double h,double d,double m,double c)
    {
        super(w,h,d,m);
        cost=c;
    }
    void cost()
    {
        double amount=cost*further();
        System.out.println("AMOUNT TO BE PAID : "+amount);
    }
}
public class ParcelCostCalculator
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        double w,h,d,m,c;
        System.out.println("ENTER WIDTH \n");
        w=in.nextDouble();
        System.out.println("ENTER HEIGHT \n");
        h=in.nextDouble();
        System.out.println("ENTER DEPTH \n");
        d=in.nextDouble();
        System.out.println("ENTER WEIGHT \n");
        m=in.nextDouble();
        System.out.println("ENTER COST \n");
        c=in.nextDouble();
        Shipment obj=new Shipment(w,h,d,m,c);
        Shipment obj2=new Shipment(obj);
        obj2.cost();
        
    }
    
}
