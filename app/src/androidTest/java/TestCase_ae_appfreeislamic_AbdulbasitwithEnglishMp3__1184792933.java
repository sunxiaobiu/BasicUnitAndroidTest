import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3__1184792933 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      ContentResolver var4 = var3.getContentResolver();
      Object var1 = EasyMock.createMock(Uri.class);
      String var2 = "android";
      var4.delete((Uri)var1, var2, (String[])null);
   }
}
