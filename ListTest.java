import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTest implements StringChecker{

    public boolean checkString (String s) {
        if (s.length() < 1){return false;}
        return true; 
    }
    List <String> list = Arrays.asList({"p","pee", "pea", "caca"});


    
    @Test
    public void testFilter (){
     assertArrayEquals({"pee", "pea", "caca"}, ListExamples.filter(list, new StringChecker()))

    
    }
}
