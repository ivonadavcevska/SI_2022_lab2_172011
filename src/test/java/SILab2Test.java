import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private List<String> makeList(String...elements){
        return new ArrayList<>(Arrays.asList(elements));
    }

    @Test
    void everyStatementTest(){
        RuntimeException runtimeException;

        runtimeException=assertThrows(RuntimeException.class, ()->SILab2.function(makeList()));
        assertTrue(runtimeException.getMessage().contains("List length should be greater than 0"));

        runtimeException=assertThrows(RuntimeException.class, ()->SILab2.function(makeList("0","#","0")));
        assertTrue(runtimeException.getMessage().contains("List length should be a perfect square"));

        ArrayList<Object> result= new ArrayList<Object>();
        result.add(2);
        result.add("#");
        result.add(2);
        result.add("#");
        result.add(4);
        result.add("#");
        result.add(2);
        result.add("#");
        result.add("#");

        ArrayList<String> list=new ArrayList<>();
        result.forEach((xx)->list.add(String.valueOf(xx)));

        assertEquals(list, SILab2.function(makeList("0", "#", "0", "#", "0", "#", "0", "#", "#")));
    }

    @Test
    void everyBranchTest(){
        RuntimeException runtimeException;

        runtimeException=assertThrows(RuntimeException.class, ()->SILab2.function(makeList()));
        assertTrue(runtimeException.getMessage().contains("List length should be greater than 0"));

        runtimeException=assertThrows(RuntimeException.class, ()->SILab2.function(makeList("0","#","0")));
        assertTrue(runtimeException.getMessage().contains("List length should be a perfect square"));

        ArrayList<Object> rezultat= new ArrayList<>();
        rezultat.add(2);
        rezultat.add("#");
        rezultat.add(2);
        rezultat.add("#");
        rezultat.add(4);
        rezultat.add("#");
        rezultat.add(2);
        rezultat.add("#");
        rezultat.add("#");

        ArrayList<String> lista=new ArrayList<>();
        rezultat.forEach((xx)->lista.add(String.valueOf(xx)));

        assertEquals(lista, SILab2.function(makeList("0", "#", "0", "#", "0", "#", "0", "#", "#")));

        ArrayList<Object> result2=new ArrayList<>();
        result2.add(1);
        result2.add("#");
        result2.add(2);
        result2.add(0);
        result2.add(3);
        result2.add("#");
        result2.add(1);
        result2.add("#");
        result2.add("#");

        ArrayList<String> list2=new ArrayList<>();
        result2.forEach((xx)->list2.add(String.valueOf(xx)));

        assertEquals(list2, SILab2.function(makeList("0", "#", "0", "0", "0", "#", "0", "#", "#")));
    }

}