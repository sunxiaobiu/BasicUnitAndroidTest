import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone_705125490 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("download");
      DownloadManager var4 = (DownloadManager)var3;
      Object var1 = EasyMock.createMock(Request.class);
      var4.enqueue((Request)var1);
   }
}
