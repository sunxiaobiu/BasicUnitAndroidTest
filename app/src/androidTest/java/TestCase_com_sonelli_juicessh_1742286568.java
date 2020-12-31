import android.text.AndroidCharacter;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_sonelli_juicessh_1742286568 {
   public static void testCase() throws Exception {
      char var0 = ' ';
      int var1 = AndroidCharacter.getEastAsianWidth(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
