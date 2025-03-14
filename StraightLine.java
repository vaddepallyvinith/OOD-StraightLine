class StraightLine
{
    int a;
    int b;
    int c;
    int x1;
    int y1;

    StraightLine() 
    {   
        a=1;
        b=1;
        c=1;
    }

    StraightLine(int  a, int  d) 
    {
        this.a = a;
            b=d;
            c=0;
    }
    StraightLine(int  a) 
    {
        this.a = a;
            b=0;
            c=0;
    }

    
    StraightLine(StraightLine c1) 
    {
        this.a = c1.a;
        this.b = c1.b;
        this.c = c1.c;
    }

    StraightLine(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    StraightLine isParalell(StraightLine line1,StraightLine line2)
    {
        double  x1;
        double  y1;
        x1=line2.a/line1.a;
        y1=line2.b/line1.b;
        if( x1 == y1)
        {
            System.out.println("Lines are parallel");
            return line1;
        }
        else
        {
            System.out.println("Lines are not paralell");
            return line1;
        }
    }


    StraightLine isPerpendicular(StraightLine line1,StraightLine line2)
    {
        double  m1;
        double  m2;
        m1=-line1.a/line1.b;
        m2=-line2.a/line2.b;
        if(Math.abs(m1 * m2 + 1) == 0)
        {
            System.out.println("Lines are Perpendicular");
            return line2;
        }
        else
        {
            System.out.println("Lines are not Perpendicular");
            return line2;
        }
    }

    void display()
    {
        if(a>0 && b>0 && c>0)
        {
        System.out.println("Staight line is "+a+"x+"+b+"y+"+c+"=0");
            return;
        }
        if(a>0 && b>0 && c<0)
        {
        System.out.println("Staight line is "+a+"x+"+b+"y-"+-1*c+"=0");
            return;
        }
        if(a>0 && b<0 && c>0)
        {
        System.out.println("Staight line is "+a+"x-"+-1*b+"y+"+c+"=0");
            return;
        }
        if(a<0 && b>0 && c>0)
        {
        System.out.println("Staight line is -"+-1*a+"x+"+b+"y+"+c+"=0");
            return;
        }
        if(a<0 && b<0 && c>0)
        {
        System.out.println("Staight line is -"+-1*a+"x-"+-1*b+"y+"+c+"=0");
            return;
        }
        if(a<0 && b>0 && c<0)
        {
        System.out.println("Staight line is -"+-1*a+"x+"+b+"y-"+-1*c+"=0");
            return;
        }
        if(a>0 && b<0 && c<0)
        {
        System.out.println("Staight line is "+a+"x-"+-1*b+"y-"+-1*c+"=0");
            return;
        }
        if(a<0 && b<0 && c<0)
        {
        System.out.println("Staight line is -"+-1*a+"x-"+-1*b+"y-"+-1*c+"=0");
            return;
        }
    }
}