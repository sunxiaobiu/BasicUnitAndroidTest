import android.app.Notification;
import android.support.v4.app.NotificationCompat.Builder;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ajeer_provider_prod_859361226 {
   @Test
   public void testCase() throws Exception {
      StringBuilder var2 = new StringBuilder();
      MyService var1 = new MyService();
      Builder var3 = new Builder(var1);
      Notification var4 = var3.getNotification();
   }
}
