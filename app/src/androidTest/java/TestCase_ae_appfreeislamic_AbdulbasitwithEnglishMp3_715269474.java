import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3_715269474 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Uri.class);
      RingtoneManager.setActualDefaultRingtoneUri((Context)var0, var1, (Uri)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
