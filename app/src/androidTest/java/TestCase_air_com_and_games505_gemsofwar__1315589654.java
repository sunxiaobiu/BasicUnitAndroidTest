import android.graphics.Bitmap;
import android.support.v4.app.NotificationCompat.WearableExtender;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_and_games505_gemsofwar__1315589654 {
   @Test
   public void testCase() throws Exception {
      WearableExtender var2 = new WearableExtender();
      Object var1 = EasyMock.createMock(Bitmap.class);
      var2.setBackground((Bitmap)var1);
   }
}
