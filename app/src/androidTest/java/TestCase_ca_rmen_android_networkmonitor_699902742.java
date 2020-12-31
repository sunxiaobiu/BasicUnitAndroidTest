import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ca_rmen_android_networkmonitor_699902742 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Uri.class);
      Builder var4 = ContentProviderOperation.newInsert((Uri)var3);
      String var1 = "android";
      String var2 = "android";
      var4.withValue(var1, var2);
   }
}
