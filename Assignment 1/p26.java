class P1{
    public static void main(String args[]){
        int pl,ph,pA;
        pl=1200;
        ph=240;
        pA=pl*ph;
        int bl,bh,bA;
        bl=24;
        bh=15;
        bA=bl*bh;
        int brickNo=pA/bA;
        System.out.println("number of bricks : "+brickNo);
    }
}