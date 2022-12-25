

import com.sun.opengl.util.FPSAnimator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.media.opengl.*;
import javax.swing.Timer;

/**
 * This is a basic JOGL app. Feel free to
 * reuse this code or modify it.
 */
public class SimpleJoglApp extends JFrame {

    private GLCanvas glCanvas;
    static FPSAnimator animator = null;
    private SimpleGLEventListener listener = new SimpleGLEventListener();


    public static void main(String[] args) {
        final SimpleJoglApp app = new SimpleJoglApp();
          animator.start();
    }

    public SimpleJoglApp() {
        //set the JFrame title
        super("BOUNCE BALL");

        //kill the process when the JFrame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //only three JOGL lines of code ... and here they are
        GLCanvas glcanvas = new GLCanvas();
        glcanvas.addGLEventListener(listener);
        animator = new FPSAnimator(glcanvas,60);

        // add the GLCanvas just like we would	 any Component
        add(glcanvas, BorderLayout.CENTER);
        setSize(600, 600);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        //center the JFrame on the screen
        centerWindow();
        setVisible(true);
        setResizable(false);
        
    }

    public void centerWindow() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize  = this.getSize();

        if (frameSize.width  > screenSize.width ) frameSize.width  = screenSize.width;
        if (frameSize.height > screenSize.height) frameSize.height = screenSize.height;

        this.setLocation (
                (screenSize.width  - frameSize.width ) >> 1,
                (screenSize.height - frameSize.height) >> 1
        );
    }
}


    class SimpleGLEventListener implements GLEventListener , KeyListener {




    public void init(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();

        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);

        gl.glViewport(0, 0, 600, 300);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrtho(-600 , 600.0, -600, 600.0, -600, 600);

    }

    /**
     * Take care of drawing here.
     */
    public void display(GLAutoDrawable drawable) {

        GL gl = drawable.getGL();

        gl.glClear(GL.GL_COLOR_BUFFER_BIT);

        //ball
        gl.glPushMatrix();
        gl.glTranslated(0,-530,0);
        drawcircle(gl,25,Color.YELLOW,360,0,3);
        gl.glPopMatrix();

        //hock
        gl.glPushMatrix();
        gl.glTranslated(0,-435,0);
        drawrectangle(gl,100,Color.GREEN,2,-240,-150);
        gl.glPopMatrix();

        //blocks
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-600,950);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-525,950);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-450,950);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-375,950);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-300,950);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-225,950);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-150,950);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-75,950);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,0,950);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,75,950);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,150,950);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,225,950);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,300,950);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-600,875);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-525,875);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-450,875);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-375,875);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-300,875);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-225,875);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-150,875);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-75,875);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,0,875);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,75,875);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,150,875);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,225,875);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,300,875);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-600,800);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-525,800);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-450,800);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-375,800);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-300,800);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-225,800);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-150,800);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,-75,800);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,0,800);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,75,800);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,150,800);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,225,800);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,-550,0);
        drawrectangle(gl,50,Color.ORANGE,300,800);
        gl.glPopMatrix();



      }


        void drawrectangle(GL gl ,int r, Color c,double sides,int x, int y){

            gl.glColor3fv(c.getColorComponents(null),0);
            gl.glBegin(GL.GL_POLYGON);
            gl.glVertex2i(x+350,y+25);
            gl.glVertex2i(x+350,y+10);
            gl.glVertex2i(x+150,y+10);
            gl.glVertex2i(x+150,y+25);

            gl.glEnd();

        }
        void drawrectangle(GL gl ,int r, Color c,int x, int y){

            gl.glColor3fv(c.getColorComponents(null),0);
            gl.glBegin(GL.GL_POLYGON);
            gl.glVertex2i(x+90,y+100);
            gl.glVertex2i(x+90,y+50);
            gl.glVertex2i(x+150,y+50);
            gl.glVertex2i(x+150,y+100);

            gl.glEnd();

        }
        void drawcircle(GL gl ,int r, Color c,double sides ,double startAngle , int step) {

            gl.glColor3fv(c.getColorComponents(null), 0);


            gl.glBegin(GL.GL_POLYGON);
            for (double i = startAngle ; i < 360*step+startAngle; i+=step*360.0/sides)
                gl.glVertex2d((r * Math.cos(Math.toRadians( i))), (r * Math.sin(Math.toRadians(i))));
            gl.glEnd();

        }
    /**
     * Called when the GLDrawable (GLCanvas
     * or GLJPanel) has changed in size. We
     * won't need this, but you may eventually
     * need it -- just not yet.
     */
    public void reshape(
            GLAutoDrawable drawable,
            int x,
            int y,
            int width,
            int height
    ) {}

    /**
     * If the display depth is changed while the
     * program is running this method is called.
     * Nowadays this doesn't happen much, unless
     * a programmer has his program do it.
     */
    public void displayChanged(
            GLAutoDrawable drawable,
            boolean modeChanged,
            boolean deviceChanged
    ) { }

    public void dispose(GLAutoDrawable arg0) {
        // TODO Auto-generated method stub

    }


        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
}
