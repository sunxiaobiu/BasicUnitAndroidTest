import android.content.Context;
import android.support.v4.app.NotificationCompat.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_org_mindthebump__31507154 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Context var1 = InstrumentationRegistry.getTargetContext();
      Builder var3 = new Builder(var1);
      String var4 = "android";
      var3.setContentInfo(var4);
   }
}
