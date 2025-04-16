package S;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Donut {
String name;
int calories, weight, sugar;



Donut(String nam, int cal, int wht, int sgr) {
name = nam;
calories = cal;
weight = wht;
sugar = sgr;
}

void printstats() {
System.out.println("donut flavor:" + name);
System.out.println("Donut calories:" + calories);
System.out.println("donut weight:" + weight);
System.out.println("donut total sugar:" + sugar);
}

void Drawdonut(int donut_ID) {
JFrame Donut_chocolate = new JFrame();
JPanel panels[] = new JPanel[64];
Container window = Donut_chocolate.getContentPane();


//define behaviors of JFrame and containers
Donut_chocolate.setTitle("Pixel Art");
Donut_chocolate.setSize(660, 600);
Donut_chocolate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setLayout(new GridLayout(8,8));


Color donut_base_color = new Color (185, 123, 85);
Color brown = new Color (56, 32, 18);
Color Blue = new Color (18, 162, 241);
Color Pink = new Color (209, 173, 153);
Color Green = new Color (50, 205, 50);
Color Purple = new Color (90, 37, 99);

//declare count varible for keeping track of panel number
int count = 0;





//declare a 2d array of integers for color-by-number




//declare and define color objects

int pink[][] = {
{0,0,0,0,0,0,0,0},
{0,0,1,1,1,1,0,0},
{0,1,5,5,5,1,1,0},
{1,5,0,0,0,0,1,1},
{1,1,0,0,0,0,5,1},
{1,1,0,0,0,0,5,1},
{0,1,1,1,5,5,1,0},
{0,0,1,1,1,1,0,0},

};
int green[][] = {
{0,0,0,0,0,0,0,0},
{0,0,1,1,1,1,0,0},
{0,1,6,6,6,1,1,0},
{1,6,0,0,0,0,1,1},
{1,1,0,0,0,0,6,1},
{1,1,0,0,0,0,6,1},
{0,1,1,1,6,6,1,0},
{0,0,1,1,1,1,0,0},

};
int Purple_Blue[][] = {
{0,0,0,0,0,0,0,0},
{0,0,4,4,4,4,0,0},
{0,4,7,7,7,4,4,0},
{4,7,0,0,0,0,4,4},
{4,4,0,0,0,0,7,4},
{4,4,0,0,0,0,7,4},
{0,4,4,4,7,7,4,0},
{0,0,4,4,4,4,0,0},

};

int choco[][] = {
{0,0,0,0,0,0,0,0},
{0,0,2,2,2,2,0,0},
{0,2,1,1,1,2,2,0},
{2,1,0,0,0,0,2,2},
{2,2,0,0,0,0,1,2},
{2,2,0,0,0,0,1,2},
{0,2,2,2,1,1,2,0},
{0,0,2,2,2,2,0,0},

};
int Orange[][] = {
{0,0,0,0,0,0,0,0},
{0,0,1,1,1,1,0,0},
{0,1,3,3,3,1,1,0},
{1,3,0,0,0,0,1,1},
{1,1,0,0,0,0,3,1},
{1,1,0,0,0,0,3,1},
{0,1,1,1,3,3,1,0},
{0,0,1,1,1,1,0,0},

};









int drawing[][] = new int[8][8];


// determine drawing
if (donut_ID == 1) {
drawing = choco;
}
else if (donut_ID == 2) {
drawing = pink;
}
else if (donut_ID == 3) {
drawing = Orange;
}
else if (donut_ID == 4) {
drawing = green;
}
else if (donut_ID == 5) {
drawing = Purple_Blue;
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
panels[count].setBackground(donut_base_color);
if(drawing[row] [column] == 2)
panels[count].setBackground(brown);
if(drawing[row] [column] == 3)
panels[count].setBackground(Color.ORANGE);
if(drawing[row] [column] == 4)
panels[count].setBackground(Blue);
if(drawing[row] [column] == 5)
panels[count].setBackground(Pink);
if(drawing[row] [column] == 6)
panels[count].setBackground(Green);
if(drawing[row] [column] == 7)
panels[count].setBackground(Purple);


count++;

}//end of columns
}// end of rows
Donut_chocolate.setVisible(true);
}
}