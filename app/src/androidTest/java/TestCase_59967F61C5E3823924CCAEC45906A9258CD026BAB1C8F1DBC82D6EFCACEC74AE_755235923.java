import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat.BigPictureStyle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59967F61C5E3823924CCAEC45906A9258CD026BAB1C8F1DBC82D6EFCACEC74AE_755235923 {
   @Test
   public void testCase() throws Exception {
      BigPictureStyle var2 = new BigPictureStyle();
      Object var1 = EasyMock.createMock(Bitmap.class);
      var2.bigPicture((Bitmap)var1);
   }
}
