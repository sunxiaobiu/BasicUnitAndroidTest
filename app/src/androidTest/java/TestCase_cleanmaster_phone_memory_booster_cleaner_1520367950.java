import android.content.ComponentName;
import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cleanmaster_phone_memory_booster_cleaner_1520367950 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ComponentName.class);
      Intent var1 = Intent.makeRestartActivityTask((ComponentName)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
