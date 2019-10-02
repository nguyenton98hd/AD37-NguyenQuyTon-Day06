package com.example.btvn_buoi06_bai01;

public class Contact {
    public  boolean lenght (String pass)
    {
        if(pass.length()>=6)
        {
            return true;
        }
        else
            return false;
    }
    public boolean kt(String pass)
    {
        String s="~!@#$%^&*.'";
        int dem=0;
        for(int i=0;i<pass.length();i++)
        {
            if(s.indexOf(pass.charAt(i))!=-1)
            {
                dem++;
            }
        }
        if(dem>0)
            return true;
        else
        return  false;
    }
    public boolean number(String pass)
    {
        int dem=0;
        for(int i=0;i<pass.length();i++)
        {
            if(pass.charAt(i)>='0'&&pass.charAt(i)<='9')
            {
                dem++;
            }
        }
        if(dem>0)
            return true;
        else
            return  false;
    }
    public  boolean caps(String pass)
    {
        int dem=0;
        for(int i=0;i<pass.length();i++)
        {
            if(pass.charAt(i)>='A'&&pass.charAt(i)<='Z')
            {
                dem++;
            }
        }
        if(dem>0)
            return true;
        else
            return  false;
    }
    public boolean enter (String pass)
    {
        int dem=0;
        for(int i=0;i<pass.length();i++)
        {
            if(pass.charAt(i)=='\r')
            {
                dem++;
            }
        }
        if(dem== 0)
            return true;
        else
            return false;
    }
}
