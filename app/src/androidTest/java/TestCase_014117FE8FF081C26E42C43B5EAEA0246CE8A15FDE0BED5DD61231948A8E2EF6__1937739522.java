import android.app.ActivityManager;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_014117FE8FF081C26E42C43B5EAEA0246CE8A15FDE0BED5DD61231948A8E2EF6__1937739522 {
   @Test
   public void testCase() throws Exception {
      MyService var1 = new MyService();
      Object var2 = var1.getSystemService("activity");
      ActivityManager var3 = (ActivityManager)var2;
      List var4 = var3.getAppTasks();
   }
}
