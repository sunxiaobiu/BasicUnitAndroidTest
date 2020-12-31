import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_shakthifm_1537733923 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Intent.class);
      PendingIntent.getBroadcast((Context)var0, var1, (Intent)var2, 134217728);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
