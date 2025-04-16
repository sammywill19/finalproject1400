package S;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cake {
      String name;
      int calories, weight, sugar;
      
      
      
      Cake(String nam, int cal, int wht, int sgr) {
            name = nam;
            calories = cal;
            weight = wht;
            sugar = sgr;
      }
      
      void printstats() {
            System.out.println("Cake flavor: " + name);
            System.out.println("Cake calories: " + calories);
            System.out.println("Cake weight: " + weight);
            System.out.println("Cake total sugar: " + sugar);
      }
      
      void DrawCake(int Cake_ID) {
            JFrame Donut_chocolate = new JFrame();
            JPanel panels[] = new JPanel[64];
            Container window = Donut_chocolate.getContentPane();
            
            
            //define behaviors of JFrame and containers
            Donut_chocolate.setTitle("Pixel Art");
            Donut_chocolate.setSize(660, 600);
            Donut_chocolate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setLayout(new GridLayout(8,8));
            
            
            Color Cakebase = new Color (41, 30, 24);
            Color Cakechoco = new Color (0, 0, 0);
            Color yellow = new Color (200, 255, 0);
            Color Orange = new Color (232, 151, 58);
            Color RED = new Color (143, 89, 27);
            Color FlamingFireLightRedCakeCOLOR = new Color (207, 25, 32);
            Color CakeFrosting = new Color (56, 48, 25);
            Color Purple = new Color (128, 32, 99);
            Color magantaPink = new Color (245, 66, 191);
            Color HotPink = new Color (242, 114, 204);
            
            //declare count varible for keeping track of panel number
            int count = 0;
            
            
            
            
            
            //declare a 2d array of integers for color-by-number
            
            
            
            
            //declare and define color objects
            
            int Choco_madnessCake[][] = {
                        {0,0,0,8,8,0,0,0},      
                        {0,0,2,2,2,2,0,0},      
                        {0,0,2,2,2,2,0,0},      
                        {0,1,3,1,3,1,1,0},      
                        {0,1,1,1,1,1,1,0},      
                        {0,1,1,1,3,1,1,0},      
                        {0,1,1,1,1,1,1,0},      
                        {0,1,1,1,1,1,1,0},      
                        
            };
            int PinkCake[][] = {
            		{0,0,0,8,8,0,0,0},      
                    {0,0,4,4,4,4,0,0},      
                    {0,0,4,4,4,4,0,0},      
                    {0,4,5,4,5,4,4,0},      
                    {0,4,4,4,4,4,4,0},      
                    {0,4,4,4,5,4,4,0},      
                    {0,4,4,4,4,4,4,0},      
                    {0,4,4,4,4,4,4,0},      
                       };
            int purple_Cake[][] = {
            		{0,0,0,8,8,0,0,0},      
                    {0,0,7,7,7,7,0,0},      
                    {0,0,7,7,7,7,0,0},      
                    {0,7,7,7,7,7,7,0},      
                    {0,7,7,7,7,7,7,0},      
                    {0,7,7,7,7,7,7,0},      
                    {0,7,7,7,7,7,7,0},      
                    {0,7,7,7,7,7,7,0},      
                        };
            
            int FlamingFireLightRedCake[][] = {
            		{0,0,0,8,8,0,0,0},      
                    {0,0,9,9,9,9,0,0},      
                    {0,0,9,9,9,9,0,0},      
                    {0,9,9,9,9,9,9,0},      
                    {0,9,9,9,9,9,9,0},      
                    {0,9,9,9,9,9,9,0},      
                    {0,9,9,9,9,9,9,0},      
                    {0,9,9,9,9,9,9,0},      
                    
            };
            int Orangyellow[][] = {
            		{0,0,0,8,8,0,0,0},      
                    {0,0,10,10,10,10,0,0},      
                    {0,0,10,10,10,10,0,0},      
                    {0,6,6,6,6,6,6,0},      
                    {0,6,6,6,6,6,6,0},      
                    {0,6,6,6,6,6,6,0},      
                    {0,6,6,6,6,6,6,0},      
                    {0,6,6,6,6,6,6,0},      
                       };
            
            
            
            
            
            
            
            
            
            int drawing[][] = new int[8][8];
            
            
            // determine drawing
            if (Cake_ID == 1) {
                  drawing = Choco_madnessCake ;
            }
            else if (Cake_ID == 2) {
                  drawing = PinkCake ;
            }
            else if (Cake_ID == 3) {
                  drawing = purple_Cake;
            }
            else if (Cake_ID == 4) {
                  drawing = FlamingFireLightRedCake;
            }
            else if (Cake_ID == 5) {
                  drawing = Orangyellow;
            }
            
            
            
            //loop through panels array and initialize
                        for(int i = 0; i < panels.length; i++)
                        {panels[i] = new JPanel();
                        panels[i].setBackground(Color.white);
                              window.add(panels[i]);
                        }
                        //loop through 2D array and color panels by number
                        for (int row = 0; row < drawing.length; row++ ) {
                              for (int column = 0; column < drawing[0].length; column++) {
                                    //look at 2D integer in drawing and color panel
                                    if(drawing[row] [column] == 1)
                                          panels[count].setBackground(Cakebase);
                                    if(drawing[row] [column] == 2)
                                          panels[count].setBackground(CakeFrosting);
                                    if(drawing[row] [column] == 3)
                                          panels[count].setBackground(Cakechoco);
                                    if(drawing[row] [column] == 4)
                                          panels[count].setBackground(magantaPink);
                                    if(drawing[row] [column] == 5)
                                          panels[count].setBackground(HotPink);
                                    if(drawing[row] [column] == 6)
                                          panels[count].setBackground(yellow);
                                    if(drawing[row] [column] == 7)
                                          panels[count].setBackground(Purple);
                                    if(drawing[row] [column] == 8)
                                          panels[count].setBackground(RED);
                                    if(drawing[row] [column] == 9)
                                    	panels[count].setBackground(FlamingFireLightRedCakeCOLOR);
                                    if(drawing[row] [column] == 10)
                                    	panels[count].setBackground(Color.orange);
                                    
                                    
                                    count++;
                                    
                              }//end of columns
                        }// end of rows
                        Donut_chocolate.setVisible(true);
      }
}