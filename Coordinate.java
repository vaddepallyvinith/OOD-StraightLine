class Coordinate
{
    int x;
    int y;
    Coordinate()
    {
        x=1;
        y=1;
    }
    Coordinate(int x, int z) 
    {
        this.x = x;
        y=z;
    }
    Coordinate(int x)
    {
        this.x=x;
        y=0;
    }
    Coordinate(Coordinate c)
    {
        this.y=c.x;
        this.y=c.y;
    }
    Coordinate isOnLine(Coordinate c,StraightLine line1)
    {   
        double k;
        k=line1.a*c.x+line1.b*c.y+line1.c;
        if(k == 0)
        {
            System.out.println("Point is on Line.");
            return c;
        }
        else
        {
            System.out.println("Point is not on Line.");
            return c;
        }

    }
    void pointDisplay()
    {
        System.out.println("Given point is ("+x+","+y+")");
    }
    
}