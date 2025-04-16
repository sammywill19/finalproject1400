package bakery;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bakery_main {

public static void main(String[] args) {
// TODO Auto-generated method stub
//declare and define bakery objects
	Donut choc = new Donut("chocolate", 45, 22, 17 );
	Donut pink = new Donut("Pink", 41, 25, 15 );
	Donut Orange = new Donut("Orange Frosting", 28, 22, 18 );
	Donut Green = new Donut("Green Frosting", 86, 41, 34 );
	Donut Purple_Blue = new Donut("Purple and blue donut", 45, 12, 46 );

	Cookie chocoChiCookie = new Cookie("Chocolate Chip cookie", 45, 22, 17 );
	Cookie Chocohalic_madness = new Cookie("Chocohalic Madness", 250, 25,70 );
	Cookie purple_Cookie = new Cookie("Thanos Cookie", 19, 4, 3 );
	Cookie FlamingMadness = new Cookie("Flaming Madness", 89, 31, 34 );
	Cookie Brighter_than_sun = new Cookie("Brighter than the sun", 48, 16, 49 );
	
	Cake Choco_madnessCake = new Cake("Chocoholic Madness Cake", 95, 18, 45);
	Cake PinkCake = new Cake("Pink Cake", 40, 12, 5);
	Cake purple_Cake = new Cake("Thanos Cake", 55, 14, 6);
	Cake FlamingFireLightRedCake = new Cake("Flaming Fire Light Red Cake", 108, 24,32);
	Cake Orangyellow = new Cake("Orangey Yellow", 108, 24,32);
	
	Muffin ChocoChipMuffin = new Muffin ("Chocolate Chip Muffin", 80, 12, 5);
	Muffin chocoMuffin = new Muffin ("Chocolate Muffin", 120, 12, 89);
	Muffin PurpleMuffin = new Muffin ("Thanos Muffin", 43, 7, 5);
	Muffin FireRedMuffinColored = new Muffin ("Fire Red Muffin Colored", 99, 8, 6);
	Muffin FallColoredMuffin = new Muffin ("Fall Colored Muffin", 121, 87, 51);


	int flavorchoice = 0;
	int menuChoice;
 Scanner readSimple = new Scanner(System.in);

 do {
	 System.out.println("1) Donuts");
	 System.out.println("2) Cookie");
	 System.out.println("3) Cake");
	 System.out.println("4) Muffins");
// business of out code

	 // read in choice
	 menuChoice = readSimple.nextInt();
// evaluate choice
	 switch (menuChoice) {
	 case 1:
		 System.out.println("What type of donut do you want");
		 System.out.println("1) chocolate ");
		 System.out.println("2) Pink frosting");
		 System.out.println("3) orange frosting");
		 System.out.println("4) green frosting");
		 System.out.println("5) blue and purple donut");

		 flavorchoice = readSimple.nextInt();
	if(flavorchoice == 1) {
choc.printstats();
choc.Drawdonut(1);
}
	else if(flavorchoice == 2) {
pink.printstats();
pink.Drawdonut(2);
}
	else if(flavorchoice ==3) {
Orange.printstats();
Orange.Drawdonut(3);
}
	else if(flavorchoice ==4) {
Green.printstats();
Green.Drawdonut(4);
}
else if(flavorchoice == 5) {
Purple_Blue.printstats();
Purple_Blue.Drawdonut(5);
}
break;

case 2:
System.out.println("What type of Cookie do you want");
System.out.println("1) Chocolate Chip cookie ");
System.out.println("2) Chocohalic Madness");
System.out.println("3) Thanos Cookie");
System.out.println("4) Flaming Madness");
System.out.println("5) Brighter than the sun");


flavorchoice = readSimple.nextInt();
if(flavorchoice == 1) {
chocoChiCookie.printstats();
chocoChiCookie.DrawCookie(1);
}
else if(flavorchoice == 2) {
Chocohalic_madness.printstats();
Chocohalic_madness.DrawCookie(2);
}
else if(flavorchoice == 3) {
purple_Cookie.printstats();
purple_Cookie.DrawCookie(3);
}
else if(flavorchoice == 4) {
FlamingMadness.printstats();
FlamingMadness.DrawCookie(4);
}
else if(flavorchoice == 5) {
Brighter_than_sun.printstats();
Brighter_than_sun.DrawCookie(5);
}
case 3:
	System.out.println("What type of Cake do you want");
	System.out.println("1) Chocoholic Madness Cake ");
	System.out.println("2) Pink Cake ");
	System.out.println("3) Thanos Cake");
	System.out.println("4) Flaming Fire Light Red Cake");
	System.out.println("5) Orangey Yellow");
	
	flavorchoice = readSimple.nextInt();
	if(flavorchoice == 1) {
		Choco_madnessCake.printstats();
	Choco_madnessCake.DrawCake(1);
	}
	if(flavorchoice == 2) {
		PinkCake.printstats();
		PinkCake.DrawCake(2);
	}
	if(flavorchoice == 3) {
		purple_Cake.printstats();
		purple_Cake.DrawCake(3);
	}
	if(flavorchoice == 4) {
		FlamingFireLightRedCake.printstats();
		FlamingFireLightRedCake.DrawCake(4);
	}
	if(flavorchoice == 5) {
		Orangyellow.printstats();
		Orangyellow.DrawCake(5);
	}

break;
case 4:
	System.out.println("What type of Muffin do you want");
	System.out.println("1) Chocolate Chip Muffin ");
	System.out.println("2) Chocolate Muffin ");
	System.out.println("3) Thanos Muffin");
	System.out.println("4) Fire Red Muffin Colored");
	System.out.println("5) Fall Colored Muffin");
	
	flavorchoice = readSimple.nextInt();
	if(flavorchoice == 1) {
		ChocoChipMuffin.printstats();
		ChocoChipMuffin.DrawMuffin(1);
	}
	else if(flavorchoice == 2) {
		chocoMuffin.printstats();
		chocoMuffin.DrawMuffin(2);
	}
	else if(flavorchoice == 3) {
		PurpleMuffin.printstats();
		PurpleMuffin.DrawMuffin(3);
	}
	else if(flavorchoice == 4) {
		 FireRedMuffinColored.printstats();
		 FireRedMuffinColored.DrawMuffin(4);
	}
	else if(flavorchoice == 5) {
		FallColoredMuffin.printstats();
		FallColoredMuffin.DrawMuffin(5);
	}
break;
case 5:
break;
case 6:
break;
case 7:
break;
case 8:
break;
case 9:
System.out.println("welp you ended it what do you do now");

break;
}
}while(menuChoice < 9);



}

}