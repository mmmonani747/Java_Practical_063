import java.util.*;
public class prectical15
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float ans;
        float lenght,width;
        System.out.print("Enter the lenght: ");
        lenght=sc.nextFloat();
        System.out.print("Enter the width: ");
        width=sc.nextFloat();
        Area a=new Area(lenght,width);
        ans=a.returnArea();
        System.out.print("Area of rectangle is: "+ans);

    }
}
class Area
{
    Float lenght,width;
    Area()
    {
        lenght=0f;
        width=0f;
    }
    Area(Float l,Float w)
    {
        this.lenght=l;
        this.width=w;  
    }
    Float returnArea() {
        return lenght*width;
        } 
}