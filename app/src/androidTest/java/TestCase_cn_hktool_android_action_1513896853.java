import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.MediaButtonReceiver;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cn_hktool_android_action_1513896853 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      PendingIntent var1 = MediaButtonReceiver.buildMediaButtonPendingIntent((Context)var0, 1L);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
