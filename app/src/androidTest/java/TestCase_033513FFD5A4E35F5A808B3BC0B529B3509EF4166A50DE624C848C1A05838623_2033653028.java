import android.content.ContentProviderClient;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_033513FFD5A4E35F5A808B3BC0B529B3509EF4166A50DE624C848C1A05838623_2033653028 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(ContentProviderClient.class);
      Object var1 = EasyMock.createMock(Uri.class);
      String var2 = "android";
      ((ContentProviderClient)var3).query((Uri)var1, (String[])null, var2, (String[])null, (String)null);
   }
}
