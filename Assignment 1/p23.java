class P1{
    public static void main(String args[]){
        int cube, cvol;
        cube=3;
        cvol=cube*cube*cube;
        int cs1,cs2,cs3,csv;
        cs1=15;
        cs2=9;
        cs3=12;
        csv=cs1*cs2*cs3;
        int boxNo=csv/cvol;
        System.out.println("number of small boxex : "+boxNo);
    }
}