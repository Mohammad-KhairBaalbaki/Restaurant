package Restaurant;
public class Main{
    static String username="",password="";
    static boolean guestOrNot;
    public static void main(String []args)
    {
        new LaunchPage(0);
        LogIn.doLogin();
        if(username.equals("admin") && password.equals("adminpass"))
            System.out.println("correct");
    //    new RegistrationForm();
    }
}