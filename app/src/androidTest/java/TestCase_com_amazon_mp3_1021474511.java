import android.media.MediaScannerConnection;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amazon_mp3_1021474511 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(MediaScannerConnection.class);
      boolean var2 = ((MediaScannerConnection)var1).isConnected();
   }
}
