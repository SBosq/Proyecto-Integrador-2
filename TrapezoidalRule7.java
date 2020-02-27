package Proyecto_Integrador2;
/**
 * Write a description of class TrapezoidalRule here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TrapezoidalRule7
{
    /**********************************************************************
     * Standard normal distribution density function.
     * Replace with any sufficiently smooth function.
     **********************************************************************/
    static double f(double x) //any math expression (function can be placed here) 
    {
        return -0.010896*Math.pow(x,2)+0.999972*x+0.0007; //ideally we want to place the function created by the parabolic throw of the soccer ball
    }
    /**********************************************************************
     * Integrate f from a to b using the trapezoidal rule.
     * Increase N for more precision.
     **********************************************************************/
    static double integrate(double a1, double b, int N) 
    {
        double h = (b - a1) / N;              // step size
        double sum = 0.5 * (f(a1) + f(b));    // area
        for (int i = 1; i < N; i++) {
            double x = a1 + h * i;
            sum = sum + f(x);
        }
        return sum * h;
    }
}