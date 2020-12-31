import android.text.format.Time;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aafcans_android_1220649716 {
   @Test
   public void testCase() throws Exception {
      String var2 = Time.getCurrentTimezone();
      Time var1 = new Time(var2);
      var2 = var1.toString();
   }
}
