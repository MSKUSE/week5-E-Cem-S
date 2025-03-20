public class Rectangle {
    
    private Point topLeft;
    private int SideA, SideB;
    public Rectangle(Point topLeft,int SideA, int SideB){
        this.topLeft = topLeft;
        setSideA(SideA);
        SetSideB(SideB);
    }
    public Rectangle(Point topLeft,int SideA){
        this.topLeft = topLeft;
        setSideA(SideA);
        SetSideB(SideB);
    }
    public Point gettopLeft(){
        return topLeft;
    }
    public void settopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }
    public int getSideA(){
        return SideA;
    }
    public void setSideA(int SideA){
        if (SideA < 0){
            this.SideA = 0;
            System.out.println("SideA  can't be negatif");
        }else{
            this.SideA = SideA;
        }
    }
    public int getSideB(){
        return SideB;
    }
    public void SetSideB(int SideB){
        if (SideB < 0){
            this.SideB = 0;
            System.out.println("SideB  can't be negatif");
        }else{
            this.SideB = SideB;
        }
    }

    public int perimeter(){
        return (2*SideA) + (2*SideB);
    }
    public int area(){
        return SideA*SideB;
    }
}
