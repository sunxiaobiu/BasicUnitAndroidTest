import android.app.Notification.Builder;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aagym_mqdigital_com_aagymapp_867569842 {
   @Test
   public void testCase() throws Exception {
      MyService var1 = new MyService();
      Builder var2 = new Builder(var1);
      byte var3 = 1;
      var2.setSmallIcon(var3);
   }
}
