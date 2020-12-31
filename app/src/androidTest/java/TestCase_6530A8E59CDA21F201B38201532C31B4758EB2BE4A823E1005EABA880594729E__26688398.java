import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat.WearableExtender;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6530A8E59CDA21F201B38201532C31B4758EB2BE4A823E1005EABA880594729E__26688398 {
   @Test
   public void testCase() throws Exception {
      WearableExtender var2 = new WearableExtender();
      Object var1 = EasyMock.createMock(Bitmap.class);
      var2.setBackground((Bitmap)var1);
   }
}
