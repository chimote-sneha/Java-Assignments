class P1{
    public static void main(String args[]){
        int tb1, tb2, th, tw, tA;
        tb1=128;
        tb2=92;
        th=40;
        tw=4;
        tA=(tb1+tb2) * th/2;
        int walkway=th*tw;
        int woodarea=tA-walkway;
        System.out.println("Wooded area : "+woodarea);
    }
}