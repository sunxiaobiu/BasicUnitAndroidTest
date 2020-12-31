import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59BF9E8479F250B0A6759BDAC1A6952CE67D2B9C6578B040058AB5587D1C19DC_1072131945 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      ContentResolver var3 = var2.getContentResolver();
      Object var1 = EasyMock.createMock(Uri.class);
      var3.openFileDescriptor((Uri)var1, "r", (CancellationSignal)null);
   }
}
