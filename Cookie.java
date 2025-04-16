package bakery;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cookie {
      String name;
      int calories, weight, sugar;
      
      
      
      Cookie(String nam, int cal, int wht, int sgr) {
            name = nam;
            calories = cal;
            weight = wht;
            sugar = sgr;
      }
      
      void printstats() {
            System.out.println("Cookie flavor: " + name);
            System.out.println("Cookie calories: " + calories);
            System.out.println("Cookie weight: " + weight);
            System.out.println("Cookie total sugar: " + sugar);
      }
      
      void DrawCookie(int Cookie_ID) {
            JFrame Donut_chocolate = new JFrame();
            JPanel panels[] = new JPanel[64];
            Container window = Donut_chocolate.getContentPane();
            
            
            //define behaviors of JFrame and containers
            Donut_chocolate.setTitle("Pixel Art");
            Donut_chocolate.setSize(660, 600);
            Donut_chocolate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setLayout(new GridLayout(8,8));
            
            
            Color Cookiebase = new Color (228, 134, 84);
            Color Cookiechoco = new Color (41, 30, 24);
            Color yellow = new Color (200, 255, 0);
            Color Orange = new Color (232, 151, 58);
            Color RED = new Color (143, 89, 27);
            Color f = new Color (50, 205, 50);
            Color Purple = new Color (90, 37, 99);
            
            //declare count varible for keeping track of panel number
            int count = 0;
            
            
            
            
            
            //declare a 2d array of integers for color-by-number
            
            
            
            
            //declare and define color objects
            
            int Chocohalic_madness[][] = {
                        {0,0,0,0,0,0,0,0},      
                        {0,0,3,3,3,3,0,0},      
                        {0,3,3,3,3,3,3,0},      
                        {3,3,1,3,3,1,3,3},      
                        {3,1,3,3,3,3,3,3},      
                        {3,3,3,4,3,3,1,3},      
                        {0,3,3,3,3,1,3,0},      
                        {0,0,3,3,3,3,0,0},      
                        
            };
            int FlamingMadness[][] = {
                        {0,0,0,0,0,0,0,0},      
                        {0,0,8,8,8,8,0,0},      
                        {0,8,8,8,8,8,8,0},      
                        {8,8,1,8,8,1,8,8},      
                        {8,1,8,8,8,8,8,8},      
                        {8,8,8,1,8,8,1,8},      
                        {0,8,8,8,8,1,8,0},      
                        {0,0,8,8,8,8,0,0},      
            };
            int purple_Cookie[][] = {
                        {0,0,0,0,0,0,0,0},      
                        {0,0,7,7,7,7,0,0},      
                        {0,7,7,7,7,7,7,0},      
                        {7,7,1,7,7,1,7,7},      
                        {7,1,7,7,7,7,7,7},      
                        {7,7,7,1,7,7,1,7},      
                        {0,7,7,7,7,1,7,0},      
                        {0,0,7,7,7,7,0,0},      
            };
            
            int chocoChiCookie[][] = {
                        {0,0,0,0,0,0,0,0},      
                        {0,0,2,2,2,2,0,0},      
                        {0,2,2,2,2,2,2,0},      
                        {2,2,1,2,2,1,2,2},      
                        {2,1,2,2,2,2,2,2},      
                        {2,2,2,1,2,2,1,2},      
                        {0,2,2,2,2,1,2,0},      
                        {0,0,2,2,2,2,0,0},      
                        
            };
            int Brighter_than_sun[][] = {
                        {0,0,0,0,0,0,0,0},      
                        {0,0,6,6,6,6,0,0},      
                        {0,6,6,6,6,6,6,0},      
                        {6,6,5,6,6,5,6,6},      
                        {6,5,6,6,6,6,6,6},      
                        {6,6,6,5,6,6,5,6},      
                        {0,6,6,6,6,5,6,0},      
                        {0,0,6,6,6,6,0,0},
            };
            
            
            
            
            
            
            
            
            
            int drawing[][] = new int[8][8];
            
            
            // determine drawing
            if (Cookie_ID == 1) {
                  drawing = chocoChiCookie;
            }
            else if (Cookie_ID == 2) {
                  drawing = Chocohalic_madness ;
            }
            else if (Cookie_ID == 3) {
                  drawing = purple_Cookie;
            }
            else if (Cookie_ID == 4) {
                  drawing = FlamingMadness;
            }
            else if (Cookie_ID == 5) {
                  drawing = Brighter_than_sun;
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
                                          panels[count].setBackground(Cookiebase);
                                    if(drawing[row] [column] == 3)
                                          panels[count].setBackground(Cookiechoco);
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