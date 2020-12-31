import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_laola1_laola1tv__364855298 {
   @Test
   public void testCase() throws Exception {
      MyService var1 = new MyService();
      TaskStackBuilder var2 = TaskStackBuilder.create(var1);
      Intent var3 = var2.editIntentAt(1);
   }
}
