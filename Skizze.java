import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Skizze
{
    double x1 = 100;   // Ball1
    double y1 = 100;
    double v1 = 2;
    
    double x2 = 150;   // Ball2 
    double y2 = 100;
    double v2 = -2;
    
    
    double x3 = 200;    //Ball3
    double y3 = 100;
    double v3 = 0;  
   
    
    double a = 0.1;
 
    // Diese Methode wird immer und immer wieder ausgeführt
    void draw(GraphicsContext gc){
        gc.clearRect(0,0,400,400);
        
        gc.setFill(Color.RED);    // Ball1 zeichnen
        gc.fillOval(x1,y1,20,20); 
        
        gc.setFill(Color.BLUE);   // Ball2 zeichnen
        gc.fillOval(x2,y2,20,20);
        
        gc.setFill(Color.GREEN);   // Ball3 zeichnen
        gc.fillOval(x3,y3,20,20);  
        
        
        v1 = v1 + a;     // Ball1 bewegen
        y1 = y1 + v1; 
        
        if(y1 > 400)  // Ball1 wird am unteren Rand reflektiert
        {
            v1 = -v1;
        }
      
        
        v2 = v2 + a;     // Ball2 bewegen
        y2 = y2 + v2; 
        
        if(y2 > 400)  // Ball3 wird am unteren Rand reflektiert
        {
            v2 = -v2;
        }
        
        v3 = v3 + a;     // Ball3 bewegen
        y3 = y3 + v3; 
        
        if(y3 > 400)  // Ball3 wird am unteren Rand reflektiert
        {
            v3 = -v3;
        }
        
        
    }
    

}
