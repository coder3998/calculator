import java.io.*;

class calculator
{
public static void main(String arr[])
{
System.out.println("\t\t\t. . . . . .");
System.out.println("\t\tSagar's calculator");

//type of calculator.

Console c = System.console();
String input = c.readLine("\t\t1. Simple calculator.\n\t\t2. Scientific calculator. ");
int x = Integer.parseInt(input);

//choice...

if(x==1){
simple();}

if(x==2){
scientific();}

//if user enters other than choice provided....

try
{
