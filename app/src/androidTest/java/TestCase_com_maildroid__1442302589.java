import android.media.RingtoneManager;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_maildroid__1442302589 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Uri.class);
      boolean var1 = RingtoneManager.isDefault((Uri)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
