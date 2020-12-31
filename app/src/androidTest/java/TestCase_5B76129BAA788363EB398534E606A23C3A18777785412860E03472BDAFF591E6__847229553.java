import android.content.Context;
import android.content.Intent;
import androidx.core.content.ContextCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5B76129BAA788363EB398534E606A23C3A18777785412860E03472BDAFF591E6__847229553 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(Intent.class);
      ContextCompat.startForegroundService((Context)var0, (Intent)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
