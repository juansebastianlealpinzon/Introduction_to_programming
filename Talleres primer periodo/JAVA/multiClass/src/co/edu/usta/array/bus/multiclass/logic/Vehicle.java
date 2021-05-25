package co.edu.usta.array.bus.multiclass.logic;

public class Vehicle {
    private String serviceType;
    private String color;
    private String brand;
    private float width;
    private float height;
    private int doorsNumber;
    private int wheelsNumber;
    private String plates;
    private char [][] places;
    public void setServiceType(String servicetypeValue){
        serviceType=servicetypeValue;
    }
    public  String getServiceType(){
        return serviceType;
    }
    public void setColor(String colorValue){
        color=colorValue;
    }
    public  String getColor() {
        return color;
    }
    public void setbrand(String brandValue){
        brand=brandValue;
    }
    public String getBrand(){
        return brand;
    }
    public void setWidth(float widthValeu){
        width=widthValeu;
    }
    public float getWidth(){
        return width;
    }
    public void setHeight(float heightValue){
        height=heightValue;
    }
    public float getHeight(){
        return height;
    }
    public void setDoorsNumber(int doorsNumberValue){
        doorsNumber=doorsNumberValue;
    }
    public int getDoorsNumber(){
        return doorsNumber;
    }
    public void setwhellsNumber(int whellsNumberValue){
        wheelsNumber=whellsNumberValue;
    }
    public int getWheelsNumber(){
        return wheelsNumber;
    }
    public void setplates(String platesVoid){
        plates=platesVoid;
    }
    public String getPlates(){
        return plates;
    }
    public void create_Places_Array(String rows){
        int rowsint=Integer.parseInt(rows);
        places=new char[rowsint][4];
    }
    public void Int_places_array(){
        boolean letters=true;
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j <places[0].length; j++) {
                if (letters==true){
                    places[i][j]='D';
                }else{
                    places[i][j]='X';
                }
            }
            if (letters==true){
                letters=false;
            }else{
                letters=true;
            }
        }
    }
    public String array_to_show(){
            String return_string="";
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[0].length; j++) {
                return_string=return_string+places[i][j]+" ";
            }
            return_string=return_string+"\n";
        }
        return return_string;
    }
}
