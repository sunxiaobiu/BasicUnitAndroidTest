import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_zem_scanarplus_1195567110 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(ContentProviderClient.class);
      Object var1 = EasyMock.createMock(Uri.class);
      Object var2 = EasyMock.createMock(ContentValues.class);
      ((ContentProviderClient)var3).update((Uri)var1, (ContentValues)var2, (String)null, (String[])null);
   }
}
