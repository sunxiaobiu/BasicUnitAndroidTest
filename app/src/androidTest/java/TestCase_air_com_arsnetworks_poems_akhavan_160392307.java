import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_arsnetworks_poems_akhavan_160392307 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Uri var1 = RingtoneManager.getActualDefaultRingtoneUri((Context)var0, 2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
