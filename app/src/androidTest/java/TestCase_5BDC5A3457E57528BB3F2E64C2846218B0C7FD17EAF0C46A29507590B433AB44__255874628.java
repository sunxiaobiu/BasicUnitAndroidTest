import android.app.DownloadManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5BDC5A3457E57528BB3F2E64C2846218B0C7FD17EAF0C46A29507590B433AB44__255874628 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("download");
      DownloadManager var5 = (DownloadManager)var4;
      long var1 = 1L;
      var5.getUriForDownloadedFile(var1);
   }
}
