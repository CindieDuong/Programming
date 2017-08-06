/**
* Exercise - Hello World 3
*
* @author 	Chau Duong
* @version   1.0
*
*/
public class HelloWorld3
{
    /**
    * Check Command Line method. Check the input from user is empty or not
    * 
    * @param inputStr 
    * @return true - if there are 2 input, one is username and one is password
    *         false - if there are 1 or no input.
    */
    public static boolean checkCommandLine (String [] inputStr)
    {
        boolean check_inputStr = false;
        if(inputStr.length == 2)
        {
            check_inputStr = true;
        }
        
        else if (inputStr.length==1)
        {
            check_inputStr = false;
            System.out.println("Error, please enter your username and your password");
        }
        
        else if(inputStr.length ==0)
        {
            check_inputStr = false;
            System.out.println("Error, the username and password are required");
        }
        
        return check_inputStr;
    }
    
    /**
    * Check Password method. Check the user's password is correct or incorrect
    * 
    * @param inputPass 
    * @return true - if the second input of user is same as the constant password
    *         false - if that one is not same
    */
    public static boolean checkPassword (String inputPass)
    {
        boolean check_inputpass = false;
       final String password = "myhouse"; // store a constant password
        if (inputPass.equals(password))
        {
            check_inputpass = true;
        }
        else {
            check_inputpass = false;
        }
        return check_inputpass;
    }
    
    /**
    * The main method.
    *
    * Read the arguments, then check Command Line.
    * If it is ok, say "Welcome"
    * After that, check Password.
    */
    public static void main(String[] args)
    {
        if (checkCommandLine(args))
        {
            System.out.println("Welcome" + "\t" + args[0]);
        }

            
        if (checkPassword(args[1]))
        {
            System.out.println("Your password is good");
        }
        else
        {
            System.out.println("Invalid password");
        }
        
    }
}
