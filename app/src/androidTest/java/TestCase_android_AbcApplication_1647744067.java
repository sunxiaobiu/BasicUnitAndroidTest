import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_android_AbcApplication_1647744067 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Intent[].class);
      PendingIntent.getActivities((Context)var0, var1, (Intent[])var2, 268435456);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
