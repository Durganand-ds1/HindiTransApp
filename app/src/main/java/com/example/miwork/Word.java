package com.example.miwork;

public class Word {
    private String Transation;
    private  String English;
    private int ImageId= NO_IMAGE;
    private int mAudioResourceId;
    private static final int NO_IMAGE=-1;

    public Word(String tran , String eng, int audioResourceId){

        Transation=tran;
        English =eng;
        mAudioResourceId=audioResourceId;
    }


    public Word(String tran, String eng,int img , int audioResourceId){
        Transation=tran;
        English =eng;
        ImageId =img;
        mAudioResourceId=audioResourceId;


    }


    public String Translation(){
        return Transation;
    }
    public String Englis(){
        return English;
    }
    public int Imageid(){
        return ImageId;
    }
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
    //boolean to check the image is present or not
    boolean hasImage(){
        return ImageId !=NO_IMAGE;
    }
}
//