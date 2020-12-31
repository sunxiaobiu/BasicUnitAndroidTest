import android.content.ContentProviderClient;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_zem_scanarplus__1409804921 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ContentProviderClient.class);
      Object var1 = EasyMock.createMock(Uri.class);
      ((ContentProviderClient)var2).delete((Uri)var1, (String)null, (String[])null);
   }
}
