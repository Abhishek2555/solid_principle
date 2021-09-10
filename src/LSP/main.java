package LSP;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Member> myList = new ArrayList<Member>();

        myList.add(new lifetime("Abhishek",new Date()));
        myList.add(new Annualmember("Singh",new Date()));
        for (Member c: myList){
            c.addToDatabase();
        }
    }
}