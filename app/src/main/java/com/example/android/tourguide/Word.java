package com.example.android.tourguide;

/**
 * Created by R.SAI DHIRAJ on 16-09-2017.
 */

public class Word {
    private String engl;
    private int res_id;

    public Word (String eng,int resource_id){
        engl=eng;
        res_id=resource_id;
    }
    public String geteng(){return engl;}
    public int getres_id(){return res_id;}

}
