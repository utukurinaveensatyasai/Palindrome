/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindrome;

/**
 *
 * @author Naveen
 */
public class Palindrome {

    public static void main(String[] args) 
    {
        String s="MOM";
        String r="";
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            r=ch+r;
        }
        if(s.equals(r))
            System.out.println(s+" Is Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
