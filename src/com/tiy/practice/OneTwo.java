package com.tiy.practice;

/**
 * Created by crci1 on 12/28/2016.
 */
public class OneTwo {

    public String oneTwoMethod(String letterString) {


        if (letterString.length() < 3) {
            return "";

        } else {
            char[] myChar = letterString.toCharArray();
            StringBuilder sbHolder = new StringBuilder(letterString);
            StringBuilder completeSb = new StringBuilder();

            if (letterString.length() >= 4) {
                int indexPlus = 2;
                for (int index = 0; index < letterString.length() - 1; index++) {

                        if (index == indexPlus) {

                            if (sbHolder.length()< 3){
                                break;
                            }

                            sbHolder.insert(3, sbHolder.charAt(0));
                            sbHolder.deleteCharAt(0);
                            String stringHolder = sbHolder.substring(0, 3);
                            completeSb.append(stringHolder);
                            sbHolder.delete(0, 3);
                            indexPlus += 2;
                        }

                }

            }else {
                sbHolder.insert(3, sbHolder.charAt(0));
                sbHolder.deleteCharAt(0);
                String stringHolder = sbHolder.substring(0, 3);
                completeSb.append(stringHolder);

            }

            String completeString = new String(completeSb);
            return completeString;

        }
    }
}
