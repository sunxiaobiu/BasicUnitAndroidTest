import androidx.core.app.NotificationCompat.Builder;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5AB37E57529D53C3C2F822AE94E747A28C00350DD0D4C2DDA09D266EB16C21B2__1466806964 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Builder var1 = new Builder(var2, "beaconstac_background_notification");
      var1 = var1.setColorized(true);
   }
}
