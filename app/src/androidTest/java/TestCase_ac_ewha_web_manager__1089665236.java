import android.app.DownloadManager.Request;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ac_ewha_web_manager__1089665236 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(String.class);
      Uri var1 = Uri.parse((String)var2);
      Request var3 = new Request(var1);
      String var4 = "android";
      var3.setMimeType(var4);
   }
}
