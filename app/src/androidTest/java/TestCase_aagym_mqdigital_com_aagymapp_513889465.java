import android.app.Notification.Builder;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aagym_mqdigital_com_aagymapp_513889465 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Builder var1 = new Builder(var2);
      var1 = var1.setUsesChronometer(true);
   }
}
