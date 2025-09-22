import java.util.Scanner;
class Calculator{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int r=1;
do{
System.out.println("Enter 1st number");
long a=sc.nextLong();
System.out.println("Enter 2nd number");
long b=sc.nextLong();
System.out.println("Enter your choice");
System.out.println("1. Addition\n2.Subtraction\n3.Multiplication\n4.Division");
int ch=sc.nextInt();
switch(ch){
case 1:add(a,b);
	break;
case 2:sub(a,b);
	break;
case 3:mul(a,b);
	break;
case 4:div(a,b);
	break;
default:
	System.out.println("Invalid choice");
}
System.out.println("Enter 1 to continue");
r = sc.nextInt();
}while(r==1);}
public static void add(long a,long b){
long res = a+b;
System.out.println(a+"+"+b+"="+res);
}
public static void sub(long a,long b){
long res = a-b;
System.out.println(a+"-"+b+"="+res);
}
public static void mul(long a,long b){
long res = a*b;
System.out.println(a+"*"+b+"="+res);
}
public static void div(long a,long b){
if(b!=0){
double res = a/b;
System.out.println(a+"/"+b+"="+res);
}
else{ System.out.println("denominator should not be zero");
}
}
}