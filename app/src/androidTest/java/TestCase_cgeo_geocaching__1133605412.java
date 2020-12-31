import android.location.Address;
import androidx.test.runner.AndroidJUnit4;
import java.util.Locale;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cgeo_geocaching__1133605412 {
   @Test
   public void testCase() throws Exception {
      Locale var1 = Locale.getDefault();
      Address var3 = new Address(var1);
      byte var4 = 1;
      String var2 = "android";
      var3.setAddressLine(var4, var2);
   }
}
