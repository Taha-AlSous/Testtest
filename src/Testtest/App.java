
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class App {

    static String username="",password="";
    static User user;
    static ArrayList<User>users=new ArrayList<>();

    static void saveUsernamesAndPasswords()
    {
        try
        {
            ObjectOutputStream saveUser = new ObjectOutputStream(new FileOutputStream("UsernamesAndPasswords.dat"));
            saveUser.writeObject(users);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
    static ArrayList<User> loadUsernamesAndPasswords()
    {
        ArrayList<User> usersArray=new ArrayList<>();
        File usernamesAndPasswordsFile = new File("UsernamesAndPasswords.dat");
        if(usernamesAndPasswordsFile.exists())
        {
            try{
                ObjectInputStream loadUser = new ObjectInputStream(new FileInputStream(usernamesAndPasswordsFile));
                usersArray =  (ArrayList<User>) loadUser.readObject();
            }
            catch(IOException | ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }
        return usersArray;
    }

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        new LaunchPage(0);
        Second s=new Second();
       // CreatAccount d =new CreatAccount();
        // Menu m=new Menu();
        //LogIn.doLogin();
    
    }
}
