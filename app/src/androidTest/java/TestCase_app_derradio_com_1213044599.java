import android.app.DownloadManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_derradio_com_1213044599 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("download");
      DownloadManager var5 = (DownloadManager)var4;
      long var1 = 1L;
      var5.getMimeTypeForDownloadedFile(var1);
   }
}
