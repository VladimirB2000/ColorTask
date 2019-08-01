package TestConnection;

import java.io.*;
import java.util.*;
public class ConnectionGitHub {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String s = reader.readLine();
        double t = Double.parseDouble(s);
        double i = t % 5;
        if ((t >= 0 && t < 3) || (i>=0 & i<3))
            System.out.println("зеленый");
        if ( (t>=3 && t < 4) || (i>=3 && i <4))
            System.out.println("жёлтый");
        if ((t>=4 && t< 5) || (i >=4 && i <5))
            System.out.println("красный");
}}
