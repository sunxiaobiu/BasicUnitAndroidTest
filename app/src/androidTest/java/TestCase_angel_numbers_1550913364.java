import android.app.Activity;
import android.location.Geocoder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import java.util.Locale;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_angel_numbers_1550913364 {
   @Test
   public void testCase() throws Exception {
      Locale var3 = Locale.getDefault();
      Object var4 = EasyMock.createMock(Locale.class);
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var5 = var1.getActivity();
      Geocoder var2 = new Geocoder(var5, (Locale)var4);
      String var6 = "android";
      var2.getFromLocationName(var6, 1);
   }
}
