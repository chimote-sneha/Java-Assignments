class P1{
    public static void main(String args[]){
        int gl,gb,gA;
        gl=30;
        gb=20;
        gA=gl*gb;
        int w1,w2;
        w1=3;
        w2=4;
        int path=(gl*w1)+(gb*w2)-(w1*w2);
        int used=gA-path;
        System.out.println("Usable area : " + used);
    }
}