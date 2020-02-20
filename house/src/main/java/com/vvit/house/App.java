package com.vvit.house;

import java.io.File;
import java.io.FileWriter;
import java.util.*;
class App
{
public static void main(String args[])
{
   Construction house=new Construction();
            String material="",automated="";
            int area=0;
            try
            {
              File fileObj = new File("src/main/java/input.txt");
              Scanner Reader = new Scanner(fileObj);
              material=Reader.nextLine();
              String s=Reader.nextLine();
              area=Integer.parseInt(s);
              automated=Reader.nextLine();
              Reader.close();
            }

            catch(Exception e)
            {
             System.out.println("No file");
            }
            try
            {
            FileWriter Writer = new FileWriter("src/main/java/result.txt");
              Writer.write("Construction cost of the house is:"+house.constructionPrice(material,area,automated));
              Writer.close();
            }
            catch(Exception e)
            {
             System.out.println("no file");
            }
}
}
