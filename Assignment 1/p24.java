class P1{
    public static void main(String args[]){
         int wl,wb,wh,wv;
        wl=2000;
        wb=200;
        wh=75;
        wv=wl*wh*wb;
        float bl,bb,bh,bv;
        bl=25f;
        bb=7.5f;
        bh=10f;
        bv=bh*bl*bb;
        int price=(int)((wv/bv)/1000)*900;
        System.out.println("Cost to build the wall : "+price);
             }
}