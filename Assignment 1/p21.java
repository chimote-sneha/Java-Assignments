class P1{
    public static void main(String args[]){
        int bl,bb,bh,bv;
        bl=15;
        bb=8;
        bh=5;
        bv=bh*bl*bb;
        int wl,wb,wh,wv;
        wl=1500;
        wb=1000;
        wh=800;
        wv=wl*wh*wb;
        int brickNo=wv/bv;
        System.out.println("Number of bricks : "+ brickNo);
    }
}