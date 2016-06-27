import org.junit.Test;
import scala.Array;
import scala.collection.immutable.List;

import static org.junit.Assert.*;

/**
 * Created by Forrest on 2016. 6. 28..
 */
public class HelloWorld$Test {
    @Test
    public void main() throws Exception {

        String[] arr = new String[3];
        arr[0] = "123";
        arr[1] = "234";
        arr[2] = "345";

        HelloWorld.main(arr);
    }

}