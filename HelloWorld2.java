/**
* This is Hello World 2
*
* @author 	Chau Duong
* @version   1.0
 
*/
public class HelloWorld2
{
    /**The main method checks the argument whether is not null or null or empty.
     * By checking the length of argument.
     *
     * @param   args - is passed from the command line
     */
    public static void main(String[] args)
    {
        if(args.length == 1)
        {
            System.out.println("Hello," + " " + args[0]);
        }

        else if (args.length==0)
        {
            System.out.println("Error, a name is required");
        }
        
        else if(args.length != 0 & args[0].trim().length() ==0)
        {
            System.out.println("Error, please enter a real name");
        }
    }
}
