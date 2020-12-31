import androidx.core.app.NotificationCompat.Builder;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5ADD71B27FB3875567628E9226907B93235AE62166A86023656C9D2DAA44FBB8__1479576906 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Builder var1 = new Builder(var2);
      var1 = var1.setCategory("service");
   }
}
