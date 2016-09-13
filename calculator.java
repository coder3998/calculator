import java.io.*;

class calculator
{
public static void main(String arr[])
{
System.out.println("\t\t\t. . . . . .");
System.out.println("\t\tSagar's calculator");

subCal ob = new subCal();

//type of calculator.

Console c = System.console();
String input = c.readLine("\n\n\t\t1. Simple calculator.\n\t\t2. Scientific calculator.\n\n\t\t");
int x = Integer.parseInt(input);

//choice...

if(x==1){
ob.simple();}

//if(x==2){
//ob.scientific();}
else
{;}
}}

class subCal
{
void simple()
{
Console v = System.console();
System.out.println("\t\tSimple calculator");
System.out.println();
 
String input1 = v.readLine("\n\t\tX = ");
int y = Integer.parseInt(input1);
String input2 = v.readLine("\n\t\tY = ");
int z = Integer.parseInt(input2);


String input0 = v.readLine("\n\t\t1. Addition\n\t\t2. Subtraction\n\t\t3. Division\n\t\t4. Multiplication\n\t\t");
int choice = Integer.parseInt(input0);

switch(choice)
{
case 1 : 
	System.out.println("\n\t\tAddition");
	System.out.println("\n\t\t "+y+" +"+" "+z+" = "+(y+z));
	break;
case 2 :
	System.out.println("\n\t\tSubtraction");
	System.out.println("\n\t\t "+y+"-"+" "+z+" = "+(y-z));
	break;
case 3 :
	System.out.println("\n\t\tDivision");
	System.out.println("\n\t\t "+y+"/"+" "+" = "+(y/z));
	break;
case 4 :
	System.out.println("\n\t\tMultiplication");
	System.out.println("\n\t\t "+y+"*"+" "+"="+(y*z));
default :
	System.out.println("\n\t\tInvalid input");
}
}}