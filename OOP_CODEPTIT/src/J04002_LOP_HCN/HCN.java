package J04002_LOP_HCN;

public class HCN {
    private double wight,height;
    private String color;
    public HCN(){
        this.height = this.wight = 1;
    }
    public HCN(double wight,double height,String color){
        this.wight=wight;
        this.height=height;
        this.color = color;

    }
    public double getWight(){
        return  wight;
    }

    public double getHeight(){
        return  height;
    }

    public String getColor(){
        return  color;
    }

    public void setWight(double wight){
        this.wight=wight;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public void setColor(String color){
        this.color=color;
    }

    public double findArea(){
        return this.height * this.wight;
    }

    public double findPerimeter(){
        return (this.height+this.wight)*2;
    }
}
