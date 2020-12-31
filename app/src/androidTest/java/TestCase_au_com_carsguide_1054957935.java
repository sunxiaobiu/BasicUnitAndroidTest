import android.location.Location;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_carsguide_1054957935 {
   @Test
   public void testCase() throws Exception {
      String var1 = "network";
      Location var2 = new Location(var1);
      float var3 = 1.0F;
      var2.setAccuracy(var3);
   }
}
