class UseStraightLine
{
    public static void main(String[] args) 
    {   
        StraightLine line1 =new StraightLine();
        line1.display();
        StraightLine line2 =new StraightLine(5,6,7);
        line2.display();
        StraightLine line3 = new StraightLine(10,12,14);
        line3.display();
        line1.isParalell(line3,line2);
        StraightLine line4= new StraightLine(1,-1,4);
        line4.display();
        StraightLine line5= new StraightLine(1,1,12);
        line5.display();
        line1.isPerpendicular(line4, line5);
        Coordinate c1=new Coordinate();
        c1.pointDisplay();
        StraightLine line6=new StraightLine(5, -3, -2);
        line6.display();
        c1.isOnLine(c1, line6);
        
    }
}