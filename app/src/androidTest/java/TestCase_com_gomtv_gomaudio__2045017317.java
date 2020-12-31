import android.media.MediaScannerConnection.MediaScannerConnectionClient;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gomtv_gomaudio__2045017317 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(MediaScannerConnectionClient.class);
      String var1 = "android";
      Object var2 = EasyMock.createMock(Uri.class);
      ((MediaScannerConnectionClient)var3).onScanCompleted(var1, (Uri)var2);
   }
}
