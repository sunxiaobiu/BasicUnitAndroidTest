import android.app.Notification.BigPictureStyle;
import android.app.Notification.Builder;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone_322128092 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Builder var1 = new Builder(var2);
      BigPictureStyle var3 = new BigPictureStyle(var1);
      Object var4 = EasyMock.createMock(Bitmap.class);
      var3.bigPicture((Bitmap)var4);
   }
}
