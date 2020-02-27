package Proyecto_Integrador2;
import java.awt.Color;

public class GraphingParabolas
{
    public static void main()
    {
        double y;
        double a, h, k;
        
        GraphPaper gp1 = new GraphPaper(-350,600); //Kid @ 30deg
        for ( double x = 0; x<=19.6; x+=0.01 )
        {
            a = -0.029448;
            h = 9.80286; k = 2.82984;
            y = a*Math.pow(x-h,2) + k;
            gp1.drawPoint(x,y);
        }
        
        GraphPaper gp2 = new GraphPaper(-350,600); //Kid @ 45deg
        for ( double x = 0; x<=22.64; x+=0.01 )
        {
            a = -0.044172;
            h = 11.3193; k = 5.65968;
            y = a*Math.pow(x-h,2) + k;
            gp2.drawPoint(x,y);
        }
        
        GraphPaper gp3 = new GraphPaper(-350,600); //Kid @60deg
        for ( double x = 0; x<=19.6; x+=0.01 )
        {
            a = -0.088344;
            h = 9.80286; k = 8.48952;
            y = a*Math.pow(x-h,2) + k;
            gp3.drawPoint(x,y);
        }
        
        GraphPaper gp4 = new GraphPaper(-350,600); //Fan @30deg
        for ( double x = 0; x<=55.2; x+=0.01 )
        {
            a = -0.010461;
            h = 27.597; k = 7.96653;
            y = a*Math.pow(x-h,2) + k;
            gp4.drawPoint(x,y);
        }
        
        GraphPaper gp5 = new GraphPaper(-350,600); //Fan @45deg
        for ( double x = 0; x<=63.7; x+=0.01 )
        {
            a = -0.015691;
            h = 31.8661; k = 15.9331;
            y = a*Math.pow(x-h,2) + k;
            gp5.drawPoint(x,y);
        }
        
        GraphPaper gp6 = new GraphPaper(-350,600); //Fan @60deg
        for ( double x = 0; x<=55.2; x+=0.01 )
        {
            a = -0.031381;
            h = 27.5969; k = 23.8996;
            y = a*Math.pow(x-h,2) + k;
            gp6.drawPoint(x,y);
        }
        
        GraphPaper gp7 = new GraphPaper(-350,600); //Pro @30deg
        for ( double x = 0; x<=79.5; x+=0.01 )
        {
            a = -0.007264;
            h = 39.7394; k = 11.4718;
            y = a*Math.pow(x-h,2) + k;
            gp7.drawPoint(x,y);
        }
        
        GraphPaper gp8 = new GraphPaper(-350,600); //Pro @45deg
        for ( double x = 0; x<=91.8; x+=0.01 )
        {
            a = -0.010896;
            h = 45.8871; k = 22.9436;
            y = a*Math.pow(x-h,2) + k;
            gp8.drawPoint(x,y);
        }
        
        GraphPaper gp9 = new GraphPaper(-350,600); //Pro @60deg
        for ( double x = 0; x<=79.5; x+=0.01 )
        {
            a = -0.021792;
            h = 39.7395; k = 34.4154;
            y = a*Math.pow(x-h,2) + k;
            gp9.drawPoint(x,y);
        }
    }
}