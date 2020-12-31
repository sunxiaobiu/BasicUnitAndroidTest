import android.media.MediaScannerConnection.MediaScannerConnectionClient;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gomtv_gomaudio__656190029 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(MediaScannerConnectionClient.class);
      ((MediaScannerConnectionClient)var1).onMediaScannerConnected();
   }
}
