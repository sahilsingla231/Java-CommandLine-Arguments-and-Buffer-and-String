class SumCommandLine
{
    public static void main(String[] args)
    {
        // check if length of args array is
        // greater than 0



        if (args.length > 0)
        {
            System.out.println("The command line"+
                               " arguments sum is:");
 
            // iterating the args array and printing
            // the command line arguments

	int x;
	int sum=0;
            for (String val:args)
	{
		x=Integer.parseInt(val);
		sum+=x;
	}
             System.out.println("Sum is"+sum);    
        }
        else
            System.out.println("No command line "+
                                                                                                 "arguments found.");
    }
}