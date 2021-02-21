package com.example.miwork;

public class FamilyValue {
    private String Englis;
    private  String Hindi;
    private  int ImageId;
    public FamilyValue(String Eng, String hi, int img){
        Englis = Eng;
        Hindi = hi;
        ImageId=img;

    }
    public String Englis(){
        return Englis;
    }
    public String Hindi(){
        return  Hindi;
    }
    public int ImageId(){return ImageId;}
}
