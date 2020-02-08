import java.util.Scanner;
class Calculator
{
double a,b;

Calculator(double x,double y)
{
	a=x;
	b=y;	
}
    
void add()
{
	System.out.println("Result = " + (a+b));
}
    
void sub()
{
    System.out.println("Result = " + (a-b));
}
    
void div()
{
    System.out.println("Result = " + (a/b));
}
void mul()
{
    System.out.println("Result = " + (a*b));
}

}
class test
{
	public static void main(String args[])
	{
		Scanner n = new Scanner(System.in);
        System.out.println("Enter the First number:");
        double a=n.nextDouble();
        System.out.println("Enter the Second number:");
        double b=n.nextDouble();
        Calculator cal=new Calculator(a,b);
            
        System.out.println("Press + for addition");
        System.out.println("Press - for subtraction");
        System.out.println("Press / for division");
        System.out.println("Press * for multiplication");
        n.nextLine();
        String c=n.nextLine();
        switch(c)
        {
            case "+":
                cal.add();
                break;
            case "-":
                cal.sub();
                break;
            case "/":
                cal.div();
                break;
            case "*":
                cal.mul();
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
        
		
		
	}


}
