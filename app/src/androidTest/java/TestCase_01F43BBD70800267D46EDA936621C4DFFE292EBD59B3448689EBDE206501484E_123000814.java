import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01F43BBD70800267D46EDA936621C4DFFE292EBD59B3448689EBDE206501484E_123000814 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Builder.class);
      Object var1 = EasyMock.createMock(Bitmap.class);
      ((Builder)var2).setLargeIcon((Bitmap)var1);
   }
}
