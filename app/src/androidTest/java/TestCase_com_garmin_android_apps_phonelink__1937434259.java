import android.location.Address;
import androidx.test.runner.AndroidJUnit4;
import java.util.Locale;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_garmin_android_apps_phonelink__1937434259 {
   @Test
   public void testCase() throws Exception {
      Locale var1 = Locale.getDefault();
      Address var2 = new Address(var1);
      String var3 = "android";
      var2.setPhone(var3);
   }
}
