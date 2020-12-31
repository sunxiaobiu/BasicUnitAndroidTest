import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A66192E4508E0052850DDCA7EC71CF7151DEDA799F82D65D74853E920499E69_531243566 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Context var3 = var2.getApplicationContext();
      Application var4 = (Application)var3;
      Object var1 = null;
      var4.unregisterComponentCallbacks((ComponentCallbacks)var1);
   }
}
