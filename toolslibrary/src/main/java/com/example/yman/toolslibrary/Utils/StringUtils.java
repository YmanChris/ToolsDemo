package com.example.yman.toolslibrary.Utils;

/**
 * Created by Yman on 2017/12/16.
 * E-Mail : yin_xiangyang@outlook.com
 * WeChat : y22620
 */

public class StringUtils {

    public boolean isEqual(String s1, String s2){
        if(null == s1 && null == s2){
            return true;
        } else if(null == s1 || null == s2){
            return false;
        } else{
            return s1.equals(s2);
        }
    }

    public boolean isEquals(String[] s1, String[] s2){
        if(null == s1 && null == s2){
            return true;
        } else if(null == s1 || null == s2){
            return false;
        } else{
            if(s1.length != s2.length){
                return false;
            } else{
                for(int i = 0 ; i < s1.length ; i ++){
                    if(!isEqual(s1[i], s2[i])){
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public boolean isEmpty(String s1){
        return (null == s1 || s1.equals(""));
    }


}
