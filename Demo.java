package Proyecto_Integrador2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class Demo here.
 *
 * Ball speeds ranged from a low of 14.9 meters per second in youths aged 10 to 17
 * to 30 meters per second for professional soccer players,
 * with many adult amateurs able to send the ball at 25 meters per second.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demo extends JFrame
{
    JRadioButton jRadioButton1,jRadioButton2,jRadioButton3,jRadioButton4,jRadioButton5,jRadioButton6, jRadioButton7,jRadioButton8;
    JButton jButton;
    ButtonGroup G1,G2,G3;
    JLabel L1,L2,L3;
    int iniTime,finalTime;
    double iniVelo;
    public Demo ()
    {
        this.setLayout(null);
        jRadioButton1=new JRadioButton();
        jRadioButton2=new JRadioButton();
        jRadioButton3=new JRadioButton();
        jRadioButton4=new JRadioButton();
        jRadioButton5=new JRadioButton();
        jRadioButton6=new JRadioButton();
        jRadioButton7=new JRadioButton();
        jRadioButton8=new JRadioButton();

        jButton=new JButton("Seleccionar");

        G1=new ButtonGroup();
        G2=new ButtonGroup();
        G3=new ButtonGroup();

        L1=new JLabel("Quien le pegara al balon? : ");
        jRadioButton1.setText("Niño");
        jRadioButton2.setText("Aficionado");
        jRadioButton3.setText("Profesional");

        L2=new JLabel("A que angulo le pegara? : ");
        jRadioButton4.setText("30");
        jRadioButton5.setText("45");
        jRadioButton6.setText("60");

        L3=new JLabel("Quieres encontrar el area bajo la curva (Integral)?: ");
        jRadioButton7.setText("Si");
        jRadioButton8.setText("No");

        //Bounds Work (x,y,z,?)
        jRadioButton1.setBounds(67,25,50,50); //Kid
        jRadioButton2.setBounds(132,25,90,50); //Fan
        jRadioButton3.setBounds(232,25,90,50); //Pro

        jRadioButton4.setBounds(67,92,40,50); //30
        jRadioButton5.setBounds(152,92,40,50); //45
        jRadioButton6.setBounds(232,92,40,50); //60

        jRadioButton7.setBounds(67,159,40,50); //Si
        jRadioButton8.setBounds(132,159,40,50); //No

        //Click Button
        jButton.setBounds(125,215,125,30);

        //"Quien le pegara al balon?: "
        L1.setBounds(20,8,160,20);

        //"A que angulo le pegara?: "
        L2.setBounds(20,75,150,15);

        //"Quieres encontrar el area bajo la curva (Integral)?: "
        L3.setBounds(20,142,288,15);

        this.add(jRadioButton1);
        this.add(jRadioButton2);
        this.add(jRadioButton3);

        this.add(jRadioButton4);
        this.add(jRadioButton5);
        this.add(jRadioButton6);

        this.add(jRadioButton7);
        this.add(jRadioButton8);

        this.add(jButton);

        this.add(L1);
        this.add(L2);
        this.add(L3);

        G1.add(jRadioButton1);
        G1.add(jRadioButton2);
        G1.add(jRadioButton3);

        G2.add(jRadioButton4);
        G2.add(jRadioButton5);
        G2.add(jRadioButton6);

        G3.add(jRadioButton7);
        G3.add(jRadioButton8);

        jButton.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    String quien = " ";
                    String angulo = " ";
                    String AUC = " ";
                    if (jRadioButton1.isSelected())
                    {
                        if (jRadioButton4.isSelected())
                        {
                            if (jRadioButton7.isSelected())
                            {
                                quien = "Niño";
                                angulo = "30";
                                AUC = "con Integral";
                                iniVelo=14.9; // m/s
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
                                {
                                    System.out.print('\u000c');
                                    double a1 = 0;
                                    double b = 19.6;
                                    TrapezoidalRule hola= new TrapezoidalRule();
                                    System.out.print("Una aproximacion de el area bajo la curva es: " + hola.integrate(a1,b,1000000) + " metros");
                                }
                            }
                            else if (jRadioButton8.isSelected())
                            {
                                quien = "Niño";
                                angulo = "30";
                                AUC = "sin Integral";
                                iniVelo=14.9; // m/s
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
                            }
                            else
                            {
                                quien = "Niño";
                                angulo = "30";
                                AUC="Quieres saber el area bajo la curva?";
                            }
                        }
                        else if (jRadioButton5.isSelected())
                        {
                            if (jRadioButton7.isSelected())
                            {
                                quien = "Niño";
                                angulo = "45";
                                AUC = "con Integral";
                                iniVelo=14.9; // m/s
                                double y;
                                double a, h, k;
                                GraphPaper gp2 = new GraphPaper(-350,600); //Kid @ 45deg
                                for ( double x = 0; x<=22.6; x+=0.01 )
                                {
                                    a = -0.044172;
                                    h = 11.3193; k = 5.65968;
                                    y = a*Math.pow(x-h,2) + k;
                                    gp2.drawPoint(x,y);
                                }
                                {
                                    System.out.print('\u000c');
                                    double a1 = 0;
                                    double b = 22.64;
                                    TrapezoidalRule1 hola= new TrapezoidalRule1();
                                    System.out.print("Una aproximacion de el area bajo la curva es: " + hola.integrate(a1,b,1000000) + " metros");
                                }
                            }
                            else if (jRadioButton8.isSelected())
                            {
                                quien = "Niño";
                                angulo = "45";
                                AUC = "sin Integral";
                                iniVelo=14.9; // m/s
                                double y;
                                double a, h, k;
                                GraphPaper gp2 = new GraphPaper(-350,600); //Kid @ 45deg
                                for ( double x = 0; x<=22.6; x+=0.01 )
                                {
                                    a = -0.044172;
                                    h = 11.3193; k = 5.65968;
                                    y = a*Math.pow(x-h,2) + k;
                                    gp2.drawPoint(x,y);
                                }
                            }
                            else
                            {
                                quien = "Niño";
                                angulo = "45";
                                AUC="Quieres saber el area bajo la curva?";
                            }
                        }
                        else if (jRadioButton6.isSelected())
                        {
                            if (jRadioButton7.isSelected())
                            {
                                quien = "Niño";
                                angulo = "60";
                                AUC = "con Integral";
                                iniVelo=14.9; // m/s
                                double y;
                                double a, h, k;
                                GraphPaper gp3 = new GraphPaper(-350,600); //Kid @60deg
                                for ( double x = 0; x<=19.6; x+=0.01 )
                                {
                                    a = -0.088344;
                                    h = 9.80286; k = 8.48952;
                                    y = a*Math.pow(x-h,2) + k;
                                    gp3.drawPoint(x,y);
                                }
                                {
                                    System.out.print('\u000c');
                                    double a1 = 0;
                                    double b = 19.6;
                                    TrapezoidalRule2 hola= new TrapezoidalRule2();
                                    System.out.print("Una aproximacion de el area bajo la curva es: " + hola.integrate(a1,b,1000000) + " metros");
                                }
                            }
                            else if (jRadioButton8.isSelected())
                            {
                                quien = "Niño";
                                angulo = "60";
                                AUC = "sin Integral";
                                iniVelo=14.9; // m/s
                                double y;
                                double a, h, k;
                                GraphPaper gp3 = new GraphPaper(-350,600); //Kid @60deg
                                for ( double x = 0; x<=19.6; x+=0.01 )
                                {
                                    a = -0.088344;
                                    h = 9.80286; k = 8.48952;
                                    y = a*Math.pow(x-h,2) + k;
                                    gp3.drawPoint(x,y);
                                }
                            }
                            else
                            {
                                quien = "Niño";
                                angulo = "60";
                                AUC="Quieres saber el area bajo la curva?";
                            }
                        }
                        else if (jRadioButton7.isSelected())
                        {
                            quien="Niño";
                            angulo="Elige un angulo";
                            AUC="con Integral";
                        }
                        else if (jRadioButton8.isSelected())
                        {
                            quien="Niño";
                            angulo="Elige un angulo";
                            AUC="sin Integral";
                        }
                        else
                        {
                            quien="Niño";
                            angulo="Elige un angulo";
                            AUC="Quieres saber el area bajo la curva?";
                        }
                    }
                    else if (jRadioButton2.isSelected())
                    {
                        if (jRadioButton4.isSelected())
                        {
                            if (jRadioButton7.isSelected())
                            {
                                quien = "Aficionado";
                                angulo = "30";
                                AUC = "con Integral";
                                iniVelo=25.0; // m/s
                                double y;
                                double a, h, k;
                                GraphPaper gp4 = new GraphPaper(-350,600); //Fan @30deg
                                for ( double x = 0; x<=55.2; x+=0.01 )
                                {
                                    a = -0.010461;
                                    h = 27.597; k = 7.96653;
                                    y = a*Math.pow(x-h,2) + k;
                                    gp4.drawPoint(x,y);
                                }
                                {
                                    System.out.print('\u000c');
                                    double a1 = 0;
                                    double b = 55.2;
                                    TrapezoidalRule3 hola= new TrapezoidalRule3();
                                    System.out.print("Una aproximacion de el area bajo la curva es: " + hola.integrate(a1,b,1000000) + " metros");
                                }
                            }
                            else if (jRadioButton8.isSelected())
                            {
                                quien = "Aficionado";
                                angulo = "30";
                                AUC = "sin Integral";
                                iniVelo=25.0; // m/s
                                double y;
                                double a, h, k;
                                GraphPaper gp4 = new GraphPaper(-350,600); //Fan @30deg
                                for ( double x = 0; x<=55.2; x+=0.01 )
                                {
                                    a = -0.010461;
                                    h = 27.597; k = 7.96653;
                                    y = a*Math.pow(x-h,2) + k;
                                    gp4.drawPoint(x,y);
                                }
                            }
                            else
                            {
                                quien = "Aficionado";
                                angulo = "30";
                                AUC="Quieres saber el area bajo la curva?";
                            }
                        }
                        else if (jRadioButton5.isSelected())
                        {
                            if (jRadioButton7.isSelected())
                            {
                                quien = "Aficionado";
                                angulo = "45";
                                AUC = "con Integral";
                                iniVelo=25.0; // m/s
                                double y;
                                double a, h, k;
                                GraphPaper gp5 = new GraphPaper(-350,600); //Fan @45deg
                                for ( double x = 0; x<=63.7; x+=0.01 )
                                {
                                    a = -0.015691;
                                    h = 31.8661; k = 15.9331;
                                    y = a*Math.pow(x-h,2) + k;
                                    gp5.drawPoint(x,y);
                                }
                                {
                                    System.out.print('\u000c');
                                    double a1 = 0;
                                    double b = 63.7;
                                    TrapezoidalRule4 hola= new TrapezoidalRule4();
                                    System.out.print("Una aproximacion de el area bajo la curva es: " + hola.integrate(a1,b,1000000)+ " metros");
                                }
                            }
                            else if (jRadioButton8.isSelected())
                            {
                                quien = "Aficionado";
                                angulo = "45";
                                AUC = "sin Integral";
                                iniVelo=25.0; // m/s
                                double y;
                                double a, h, k;
                                GraphPaper gp5 = new GraphPaper(-350,600); //Fan @45deg
                                for ( double x = 0; x<=63.7; x+=0.01 )
                                {
                                    a = -0.015691;
                                    h = 31.8661; k = 15.9331;
                                    y = a*Math.pow(x-h,2) + k;
                                    gp5.drawPoint(x,y);
                                }
                            }
                            else
                            {
                                quien = "Aficionado";
                                angulo = "45";
                                AUC="Quieres saber el area bajo la curva?";
                            }
                        }
                        else if (jRadioButton6.isSelected())
                        {
                            if (jRadioButton7.isSelected())
                            {
                                quien = "Aficionado";
                                angulo = "60";
                                AUC = "con Integral";
                                iniVelo=25.0; // m/s
                                double y;
                                double a, h, k;
                                GraphPaper gp6 = new GraphPaper(-350,600); //Fan @60deg
                                for ( double x = 0; x<=55.2; x+=0.01 )
                                {
                                    a = -0.031381;
                                    h = 27.5969; k = 23.8996;
                                    y = a*Math.pow(x-h,2) + k;
                                    gp6.drawPoint(x,y);
                                }
                                {
                                    System.out.print('\u000c');
                                    double a1 = 0;
                                    double b = 55.2;
                                    TrapezoidalRule5 hola= new TrapezoidalRule5();
                                    System.out.print("Una aproximacion de el area bajo la curva es: " + hola.integrate(a1,b,1000000) + " metros");
                                }
                            }
                            else if (jRadioButton8.isSelected())
                            {
                                quien = "Aficionado";
                                angulo = "60";
                                AUC = "sin Integral";
                                iniVelo=25.0; // m/s
                                double y;
                                double a, h, k;
                                GraphPaper gp6 = new GraphPaper(-350,600); //Fan @60deg
                                for ( double x = 0; x<=55.2; x+=0.01 )
                                {
                                    a = -0.031381;
                                    h = 27.5969; k = 23.8996;
                                    y = a*Math.pow(x-h,2) + k;
                                    gp6.drawPoint(x,y);
                                }
                            }
                            else
                            {
                                quien = "Aficionado";
                                angulo = "60";
                                AUC="Quieres saber el area bajo la curva?";
                            }
                        }
                        else if (jRadioButton7.isSelected())
                        {
                            quien="Aficionado";
                            angulo="Elige un angulo";
                            AUC="con Integral";
                        }
                        else if (jRadioButton8.isSelected())
                        {
                            quien="Aficionado";
                            angulo="Elige un angulo";
                            AUC="sin Integral";
                        }
                        else
                        {
                            quien="Aficionado";
                            angulo="Elige un angulo";
                            AUC="Quieres saber el area bajo la curva?";
                        }
                    }
                    else if (jRadioButton3.isSelected())
                    {
                        if (jRadioButton4.isSelected())
                        {
                            if (jRadioButton7.isSelected())
                            {
                                quien = "Profesional";
                                angulo = "30";
                                AUC = "con Integral";
                                iniVelo=30.0; // m/s
                                double y;
                                double a, h, k;
                                GraphPaper gp7 = new GraphPaper(-350,600); //Pro @30deg
                                for ( double x = 0; x<=79.5; x+=0.01 )
                                {
                                    a = -0.007264;
                                    h = 39.7394; k = 11.4718;
                                    y = a*Math.pow(x-h,2) + k;
                                    gp7.drawPoint(x,y);
                                }
                                {
                                    System.out.print('\u000c');
                                    double a1 = 0;
                                    double b = 79.5;
                                    TrapezoidalRule6 hola= new TrapezoidalRule6();
                                    System.out.print("Una aproximacion de el area bajo la curva es: " + hola.integrate(a1,b,1000000) + " metros");
                                }
                            }
                            else if (jRadioButton8.isSelected())
                            {
                                quien = "Profesional";
                                angulo = "30";
                                AUC = "sin Integral";
                                iniVelo=30.0; // m/s
                                double y;
                                double a, h, k;
                                GraphPaper gp7 = new GraphPaper(-350,600); //Pro @30deg
                                for ( double x = 0; x<=79.5; x+=0.01 )
                                {
                                    a = -0.007264;
                                    h = 39.7394; k = 11.4718;
                                    y = a*Math.pow(x-h,2) + k;
                                    gp7.drawPoint(x,y);
                                }
                            }
                            else
                            {
                                quien = "Profesional";
                                angulo = "30";
                                AUC="Quieres saber el area bajo la curva?";
                            }
                        }
                        else if (jRadioButton5.isSelected())
                        {
                            if (jRadioButton7.isSelected())
                            {
                                quien = "Profesional";
                                angulo = "45";
                                AUC = "con Integral";
                                iniVelo=30.0; // m/s
                                double y;
                                double a, h, k;
                                GraphPaper gp8 = new GraphPaper(-350,600); //Pro @45deg
                                for ( double x = 0; x<=91.8; x+=0.01 )
                                {
                                    a = -0.010896;
                                    h = 45.8871; k = 22.9436;
                                    y = a*Math.pow(x-h,2) + k;
                                    gp8.drawPoint(x,y);
                                }
                                {
                                    System.out.print('\u000c');
                                    double a1 = 0;
                                    double b = 91.8;
                                    TrapezoidalRule7 hola= new TrapezoidalRule7();
                                    System.out.print("Una aproximacion de el area bajo la curva es: " + hola.integrate(a1,b,1000000) + " metros");
                                }
                            }
                            else if (jRadioButton8.isSelected())
                            {
                                quien = "Profesional";
                                angulo = "45";
                                AUC = "sin Integral";
                                iniVelo=30.0; // m/s
                                double y;
                                double a, h, k;
                                GraphPaper gp8 = new GraphPaper(-350,600); //Pro @45deg
                                for ( double x = 0; x<=91.8; x+=0.01 )
                                {
                                    a = -0.010896;
                                    h = 45.8871; k = 22.9436;
                                    y = a*Math.pow(x-h,2) + k;
                                    gp8.drawPoint(x,y);
                                }
                            }
                            else
                            {
                                quien = "Profesional";
                                angulo = "45";
                                AUC="Quieres saber el area bajo la curva?";
                            }
                        }
                        else if (jRadioButton6.isSelected())
                        {
                            if (jRadioButton7.isSelected())
                            {
                                quien = "Profesional";
                                angulo = "60";
                                AUC = "con Integral";
                                iniVelo=30.0; // m/s
                                double y;
                                double a, h, k;
                                GraphPaper gp9 = new GraphPaper(-350,600); //Pro @60deg
                                for ( double x = 0; x<=79.5; x+=0.01 )
                                {
                                    a = -0.021792;
                                    h = 39.7395; k = 34.4154;
                                    y = a*Math.pow(x-h,2) + k;
                                    gp9.drawPoint(x,y);
                                }
                                {
                                    System.out.print('\u000c');
                                    double a1 = 0;
                                    double b = 79.5;
                                    TrapezoidalRule8 hola= new TrapezoidalRule8();
                                    System.out.print("Una aproximacion de el area bajo la curva es: " + hola.integrate(a1,b,1000000) + " metros");
                                }
                            }
                            else if (jRadioButton8.isSelected())
                            {
                                quien = "Profesional";
                                angulo = "60";
                                AUC = "sin Integral";
                                iniVelo=30.0; // m/s
                                double y;
                                double a, h, k;
                                GraphPaper gp9 = new GraphPaper(-350,600); //Pro @60deg
                                for ( double x = 0; x<=79.5; x+=0.01 )
                                {
                                    a = -0.021792;
                                    h = 39.7395; k = 34.4154;
                                    y = a*Math.pow(x-h,2) + k;
                                    gp9.drawPoint(x,y);
                                }
                            }
                            else
                            {
                                quien = "Profesional";
                                angulo = "60";
                                AUC="Quieres saber el area bajo la curva?";
                            }
                        }
                        else if (jRadioButton7.isSelected())
                        {
                            quien="Profesional";
                            angulo="Elige un angulo";
                            AUC="con Integral";
                        }
                        else if (jRadioButton8.isSelected())
                        {
                            quien="Profesional";
                            angulo="Elige un angulo";
                            AUC="sin Integral";
                        }
                        else
                        {
                            quien="Profesional";
                            angulo="Elige un angulo";
                            AUC="Quieres saber el area bajo la curva?";
                        }
                    }
                    
                    else if (jRadioButton4.isSelected())
                    {
                        if (jRadioButton7.isSelected())
                        {
                            quien="Elige una persona";
                            angulo="30";
                            AUC="con Integral";
                        }
                        else if (jRadioButton8.isSelected())
                        {
                            quien="Elige una persona";
                            angulo="30";
                            AUC="sin Integral";
                        }
                        else
                        {
                            quien="Elige una persona";
                            angulo="30";
                            AUC="Quieres saber el area bajo curva?";
                        }
                    }
                    else if (jRadioButton5.isSelected())
                    {
                        if (jRadioButton7.isSelected())
                        {
                            quien="Elige una persona";
                            angulo="45";
                            AUC="con Integral";
                        }
                        else if (jRadioButton8.isSelected())
                        {
                            quien="Elige una persona";
                            angulo="45";
                            AUC="sin Integral";
                        }
                        else
                        {
                            quien="Elige una persona";
                            angulo="45";
                            AUC="Quieres saber el area bajo la curva?";
                        }
                    }
                    else if (jRadioButton6.isSelected())
                    {
                        if (jRadioButton7.isSelected())
                        {
                            quien="Elige una persona";
                            angulo="60";
                            AUC="con Integral";
                        }
                        else if (jRadioButton8.isSelected())
                        {
                            quien="Elige una persona";
                            angulo="60";
                            AUC="sin Integral";
                        }
                        else
                        {
                            quien="Elige una persona";
                            angulo="60";
                            AUC="Quieres saber el area bajo la curva?";
                        }
                    }
                    else if (jRadioButton7.isSelected())
                    {
                        quien="Elige una persona";
                        angulo="Elige un angulo";
                        AUC="con Integral";
                    }
                    else if (jRadioButton8.isSelected())
                    {
                        quien="Elige una persona";
                        angulo="Elige un angulo";
                        AUC="sin Integral";
                    }
                    else
                    {
                        quien = "Elige una persona.";
                        angulo = "Elige un angulo";
                        AUC = "Quieres el saber el area bajo la curva?";
                    }
                    JOptionPane.showMessageDialog(Demo.this, "Persona: " + " " + quien + " \n" + "Angulo: " + angulo + " \n" + "AUC: " + AUC);
                }
            });
    }
}