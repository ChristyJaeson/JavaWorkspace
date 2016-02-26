/*
 * 
 * 
 */

package javaapplication3;
/////////////////any to any//////////////
import java.io.*;
//import java.awt.
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
//import java.util.Scanner;


public class Main
{
  public static void main(String args[]) throws IOException{
    int r,g,b,a;
    System.out.println("Enter image name\n");
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String imageName=bf.readLine();
    File file= new File(imageName);
    String str[]=new String[3];
    str[0]="1";str[1]="2";str[2]="Gray";
    BufferedImage image = ImageIO.read(file);
    System.out.println("Enter image destination name\n");
    imageName=bf.readLine();
    File output = new File(imageName);
    String format=imageName.substring(imageName.length()-3);
    
    System.out.println();
    int i,j,x,y;
    y=image.getHeight();
    x=image.getWidth();
     int arr[][][]=new int[x][y][4];
     int col[][] =new int[x][y];
    System.out.println("img diamension: "+x+" , "+y);

   //File outputx =new File();
    for(i=0;i<x;i++)
    {
        for(j=0;j<y;j++)
        {
    int clr=  image.getRGB(i,j);
    col[i][j]=clr;
    int  red,green,blue,alp;
    alp=(clr & 0xff000000) >> 24;
    red= (clr & 0x00ff0000) >> 16;
    green = (clr & 0x0000ff00) >> 8;
    blue  =  clr & 0x000000ff;
    //System.out.println(((i*y)+j)+": "+red+"   "+green+"  "+blue);
  /*  int temp=red;
    red=green;//(red+20)%256;
    green=blue;//(green+20)%256;
    blue=temp;//(blue)%256;
   */

    arr[i][j][0]=red;
    arr[i][j][1]=green;
    arr[i][j][2]=blue;
    arr[i][j][3]=alp;
   //System.out.println(red+"   "+blue+"  "+green);
    int al=((arr[i][j][3]<<24) &(0xff000000));
    // System.out.println(alp+","+al);
    r= ((arr[i][j][0]<<16) &(0x00ff0000));
    g=((arr[i][j][1]<<8) &(0x0000ff00));
    b= ((arr[i][j][2]) &(0x000000ff));

    int rgb;
    rgb=(al|r|g|b);
    image.setRGB(i,j,rgb);
        }
    }
    output = new File("blur"+imageName);
     for(i=2;i<x;i++)
    {
        for(j=2;j<y;j++)
        {

   // System.out.println(red+"   "+blue+"  "+green);
    int al=(((arr[i][j][3]+arr[i-1][j-1][3])<<24) &(0xff000000));
    // System.out.println(alp+","+al);
    r= ((((arr[i][j][0]+arr[i-1][j-1][0]+arr[i-2][j-2][0])/3)<<16) &(0x00ff0000));
    g=((((arr[i][j][1]+arr[i-1][j-1][1]+arr[i-2][j-2][1])/3)<<8) &(0x0000ff00));
    b= (((arr[i][j][2]+arr[i-1][j-1][2]+arr[i-2][j-2][2])/3) &(0x000000ff));

    int rgb;
    rgb=(r|g|b);
    image.setRGB(i,j,rgb);
        }
    }

   ImageIO.write(image, format, output);
    for(int k=0;k<3;k++)
    {
        File op=new File(imageName.substring(0,imageName.length()-4)+str[k]+imageName.substring(imageName.length()-4));
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
                int temp=arr[i][j][0];
                arr[i][j][0]=arr[i][j][1];
                arr[i][j][1]=arr[i][j][2];
                arr[i][j][2]=temp;
                 
    if(k==2)
        arr[i][j][0]=arr[i][j][1]=arr[i][j][2];
    r= ((arr[i][j][0]<<16) &(0x00ff0000));
    g=((arr[i][j][1]<<8) &(0x0000ff00));
    b= ((arr[i][j][2]) &(0x000000ff));

    int rgb;
    rgb=(r|g|b);
    image.setRGB(i,j,rgb);
            }
        }
         ImageIO.write(image, format, op);
       // rd.next();
    }
    
      
//System.out.println("INVERT\n1.horizantally\n2.vertically\n3.both\n Ur Choice:");
int choice=1;//=rd.nextInt();
 

while(choice<=3)
{
    File op=new File(imageName.substring(0,imageName.length()-4)+"Inv"+choice+imageName.substring(imageName.length()-4));
    for(i=0;i<x;i++)
    {
        for(j=0;j<y;j++)
        {
         

    r= ((arr[i][j][0]<<16) &(0x00ff0000));
    g=((arr[i][j][1]<<8) &(0x0000ff00));
    b= ((arr[i][j][2]) &(0x000000ff));

    int rgb;
    rgb=(r|g|b);
    
    //System.out.println(rgb);
    
    switch(choice)
    {
        case 1:       
        image.setRGB(i,j,col[/*x-1-*/i][y-1-j]);
        break;
        case 2:
        image.setRGB(i,j,col[x-1-i][/*y-1-*/j]);
        break;
        case 3:
        image.setRGB(i,j,col[x-1-i][y-1-j]);
        break;
    }
        }
    }
     ImageIO.write(image, format, op);
     choice++;
}
  //System.out.println("trans value = "+ alpha);C:\\Users\\Guru\\Pictures\\top.jpg
   
     
 // System.out.println("Enter image name\n");
 // BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
/*  String imageName=bf.readLine();
  File input = new File(imageName);
  BufferedImage image = ImageIO.read( input );*/
  //System.out.println("Enter the output image name(.jpg):\n");
  //String imageName1=bf.readLine();


 // System.out.println("Your image has been converted successfully");

   

}
}
