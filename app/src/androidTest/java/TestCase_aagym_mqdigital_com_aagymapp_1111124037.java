import android.graphics.Bitmap;
import android.support.v4.app.NotificationCompat.BigPictureStyle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aagym_mqdigital_com_aagymapp_1111124037 {
   @Test
   public void testCase() throws Exception {
      BigPictureStyle var2 = new BigPictureStyle();
      Object var1 = EasyMock.createMock(Bitmap.class);
      var2.bigPicture((Bitmap)var1);
   }
}
