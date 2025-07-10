import java.lang.Math;
class P1{
    public static void main(String args[]){
        int h=5;
        int sl=4;
        float r=(float)(Math.sqrt(h*h-sl*sl));
        float cost=3.14f*r*r*20f;
        System.out.println("Cost pf polish : "+cost);
        
    }
}