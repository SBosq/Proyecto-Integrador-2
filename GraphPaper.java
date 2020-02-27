package Proyecto_Integrador2;
import javax.swing.JFrame;
import java.awt.*;

public class GraphPaper extends JFrame
{
    private static Graphics gBuf = null;
    private static GraphPaperCanvas canvas = null;
    private static Image vm = null;
    private int x, y;
    private int w, h;
    
    public GraphPaper( int x, int y )
    {
        if ( canvas == null )
        {
            setTitle("Tiro Parabolico");
            setSize(1800,1000);
            setLocation(-10,50);

            canvas = new GraphPaperCanvas(null);
            getContentPane().add(canvas);
            setVisible(true);

            vm = canvas.createImage(1800,950);
            gBuf = vm.getGraphics();
            canvas.setVm(vm);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        this.x = x;
        this.y = y;
        w = 700;
        h = 700;
        
        gBuf.setColor( Color.RED );
    }
    
    public void setColor( Color c )
    {
        gBuf.setColor(c);
    }
    
    public void drawPoint( double px, double py )
    {
        if ( px >= 92 || px == 0 || py >= 35 || py == 0 )
            return;

        px *= w/40;
        py *= h/40;
        px += w/2 + 2;
        py = h/2 - py + 2;

        gBuf.drawLine( x+(int)px, y+(int)py, x+(int)px, y+(int)py );
        canvas.repaint();
    }
}

class GraphPaperCanvas extends Canvas
{
	private Image vm;
	
	public GraphPaperCanvas( Image vm )
	{
		this.vm = vm;
		setBackground( Color.white );
	}
	
	public void setVm( Image vm )
	{
		this.vm = vm;
	}
	
	public void paint( Graphics g )
	{
		g.drawImage(vm,0,0,this);
	}
	
	public void update(Graphics g) { paint(g); }	// don't clear screen on repaint

}