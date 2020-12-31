import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ak_alizandro_smartaudiobookplayer_1712768438 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(Intent.class);
      PendingIntent.getForegroundService((Context)var0, 0, (Intent)var1, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
