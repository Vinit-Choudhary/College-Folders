//public class 
// first letter of any class should be capital, that's why Main
//visibility is public, so that we can access it from anywhere
//static:- it means to call this method we do not need object(read about it in detail)
//String[] args :- array of string , stores string values from command line argument
// what is executable class? if a class has main function/method it is executable

/*public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}*/

// for single line comment ctrl+/ , for mutli-line comment ctrl + shift + /

/*//Program to print table of a number 
public class Main
{   static int x= 3;
	public static void main(String[] args) {
	    for (int i=1;i<=10 ;i++ ){ 
		System.out.print(x);
		System.out.print('x');
		System.out.print(i);
		System.out.print('=');
		System.out.println(x*i);
	}}
}
*/

/*// input taken from command line
public class Main
{   
	public static void main(String[] args) {
	    int x= Integer.parseInt(args[0]); // since args[0] is a string , therfore , we need to convert it into integer
	    for (int i=1;i<=10 ;i++ ){ 
		System.out.print(x);
		System.out.print('x');
		System.out.print(i);
		System.out.print('=');
		System.out.println(x*i);
 		//System.out.printf("%d x %d = %d%n", x, i, x * i); // this single line can be used instaed of using those multiple lines to print a single line statement
	}}
}
*/

