public class Property{
    private int address;
    private int width;
    private int length;

    public Property(int address,int width,int length){
        this.address=address;
        this.width=width;
        this.length=length;
    }


    public int getArea(){
        return width*length;
    }

}