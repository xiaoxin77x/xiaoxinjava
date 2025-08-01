import org.junit.Test;

import com.xiaoxin.EvenNumberApp;

public class TestEvenNumber {
@Test
public void test1(){
    System.out.println(EvenNumberApp.isevennumber(0));
    System.out.println(EvenNumberApp.isevennumber(11));
    System.out.println(EvenNumberApp.isevennumber(55));
    System.out.println(EvenNumberApp.isevennumber(77));
    System.out.println(EvenNumberApp.isevennumber(88));
    System.out.println(EvenNumberApp.isevennumber(15));
    System.out.println(EvenNumberApp.isevennumber(-5));
}
}
