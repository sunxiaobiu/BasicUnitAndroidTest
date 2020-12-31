import android.app.DownloadManager.Request;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ac_ewha_web_manager_1265340723 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(String.class);
      Uri var3 = Uri.parse((String)var2);
      Request var1 = new Request(var3);
      var1.setNotificationVisibility(1);
   }
}
