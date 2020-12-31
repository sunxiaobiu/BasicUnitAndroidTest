import android.text.format.Time;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_adsk_sketchbook__1594377361 {
   @Test
   public void testCase() throws Exception {
      Time var2 = new Time("GMT");
      String var1 = "android";
      var2.parse3339(var1);
   }
}
