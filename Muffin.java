package bakery;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Muffin {
      String name;
      int calories, weight, sugar;
      
      
      
      Muffin(String nam, int cal, int wht, int sgr) {
            name = nam;
            calories = cal;
            weight = wht;
            sugar = sgr;
      }
      
      void printstats() {
            System.out.println("Muffin flavor: " + name);
            System.out.println("Muffin calories: " + calories);
            System.out.println("Muffin weight: " + weight);
            System.out.println("Muffin total sugar: " + sugar);
      }
      
      void DrawMuffin(int Muffin_ID) {
            JFrame Donut_chocolate = new JFrame();
            JPanel panels[] = new JPanel[64];
            Container window = Donut_chocolate.getContentPane();
            
            
            //define behaviors of JFrame and containers
            Donut_chocolate.setTitle("Pixel Art");
            Donut_chocolate.setSize(660, 600);
            Donut_chocolate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setLayout(new GridLayout(8,8));
            
            
            Color Muffinbase = new Color (228, 134, 84);
            Color Muffinchoco = new Color (41, 30, 24);
            Color yellow = new Color (200, 255, 0);
            Color Orange = new Color (232, 151, 58);
            Color RED = new Color (143, 89, 27);
            Color f = new Color (50, 205, 50);
            Color Purple = new Color (90, 37, 99);
            
            //declare count varible for keeping track of panel number
            int count = 0;
            
            
            
            
            
            //declare a 2d array of integers for color-by-number
            
            
            
            
            //declare and define color objects
            
            int ChocoChipMuffin[][] = {
                        {0,0,0,2,2,0,0,0},      
                        {0,0,2,3,2,2,0,0},      
                        {0,2,2,2,2,2,2,0},      
                        {0,2,2,2,2,3,2,0},      
                        {0,2,2,2,2,2,2,0},      
                        {0,2,3,3,2,3,2,0},      
                        {0,2,2,2,2,2,2,0},      
                        {0,0,0,0,0,0,0,0},      
                        
            };
            int  FireRedMuffinColored [][] = {
            		{0,0,0,8,8,0,0,0},      
                    {0,0,8,3,8,8,0,0},      
                    {0,8,8,8,8,8,8,0},      
                    {0,8,8,8,8,3,8,0},      
                    {0,8,8,8,8,8,8,0},      
                    {0,8,3,3,8,3,8,0},      
                    {0,8,8,8,8,8,8,0},      
                    {0,0,0,0,0,0,0,0},     
            };
            int PurpleMuffin[][] = {
            		{0,0,0,7,7,0,0,0},      
                    {0,0,7,3,7,7,0,0},      
                    {0,7,7,7,7,7,7,0},      
                    {0,7,7,7,7,3,7,0},      
                    {0,7,7,7,7,7,7,0},      
                    {0,7,3,3,7,3,7,0},      
                    {0,7,7,7,7,7,7,0},      
                    {0,0,0,0,0,0,0,0},      
            };
            
            int chocoMuffin[][] = {
            		{0,0,0,3,3,0,0,0},      
                    {0,0,3,4,3,3,0,0},      
                    {0,3,3,3,3,3,3,0},      
                    {0,3,3,3,3,4,3,0},      
                    {0,3,3,3,3,3,3,0},      
                    {0,3,4,4,3,4,3,0},      
                    {0,3,3,3,3,3,3,0},      
                    {0,0,0,0,0,0,0,0},      
                    
            };
            int FallColoredMuffin[][] = {
               		{0,0,0,6,6,0,0,0},      
                    {0,0,6,5,6,6,0,0},      
                    {0,6,6,6,6,6,6,0},      
                    {0,6,6,6,6,5,6,0},      
                    {0,6,6,6,6,6,6,0},      
                    {0,6,5,5,6,5,6,0},      
                    {0,6,6,6,6,6,6,0},      
                    {0,0,0,0,0,0,0,0},      
                    
            };
            
            
            
            
            
            
            
            
            
            int drawing[][] = new int[8][8];
            
            
            // determine drawing
            if (Muffin_ID == 1) {
                  drawing = ChocoChipMuffin;
            }
            else if (Muffin_ID == 2) {
                  drawing = chocoMuffin ;
            }
            else if (Muffin_ID == 3) {
                  drawing = PurpleMuffin;
            }
            else if (Muffin_ID == 4) {
                  drawing = FireRedMuffinColored;
            }
            else if (Muffin_ID == 5) {
                  drawing = FallColoredMuffin;
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
                                          panels[count].setBackground(Color.black);
                                    if(drawing[row] [column] == 2)
                                          panels[count].setBackground(Muffinbase);
                                    if(drawing[row] [column] == 3)
                                          panels[count].setBackground(Muffinchoco);
                                    if(drawing[row] [column] == 4)
                                          panels[count].setBackground(Color.WHITE);
                                    if(drawing[row] [column] == 5)
                                          panels[count].setBackground(Orange);
                                    if(drawing[row] [column] == 6)
                                          panels[count].setBackground(yellow);
                                    if(drawing[row] [column] == 7)
                                          panels[count].setBackground(Purple);
                                    if(drawing[row] [column] == 8)
                                          panels[count].setBackground(RED);
                                    
                                    
                                    count++;
                                    
                              }//end of columns
                        }// end of rows
                        Donut_chocolate.setVisible(true);
      }
}