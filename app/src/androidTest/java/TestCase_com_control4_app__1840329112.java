import android.graphics.Movie;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_control4_app__1840329112 {
   public static void testCase() throws Exception {
      byte[] var0 = new byte[1];
      byte var1 = 1;
      Movie.decodeByteArray(var0, 0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
