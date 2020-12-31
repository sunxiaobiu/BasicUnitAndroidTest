import android.app.DownloadManager.Request;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ac_ewha_web_manager_1725191118 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(String.class);
      Uri var1 = Uri.parse((String)var3);
      Request var2 = new Request(var1);
      var2.setDescription((CharSequence)var3);
   }
}
