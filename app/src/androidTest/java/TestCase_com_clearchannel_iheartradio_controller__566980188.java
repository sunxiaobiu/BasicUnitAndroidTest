import android.app.Notification.Builder;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_clearchannel_iheartradio_controller__566980188 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Builder var1 = new Builder(var2);
      var1.setChronometerCountDown(true);
   }
}
