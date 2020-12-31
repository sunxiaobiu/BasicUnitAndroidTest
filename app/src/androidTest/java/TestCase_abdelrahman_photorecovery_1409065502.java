import android.content.Intent;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_1409065502 {
   @Test
   public void testCase() throws Exception {
      Intent var2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
      Object var1 = EasyMock.createMock(Uri.class);
      var2.setData((Uri)var1);
   }
}
