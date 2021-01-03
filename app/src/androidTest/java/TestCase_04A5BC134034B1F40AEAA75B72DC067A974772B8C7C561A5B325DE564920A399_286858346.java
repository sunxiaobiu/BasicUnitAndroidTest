import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_04A5BC134034B1F40AEAA75B72DC067A974772B8C7C561A5B325DE564920A399_286858346 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      ContentResolver var3 = var2.getContentResolver();
      Object var1 = EasyMock.createMock(Uri.class);
      ContentProviderClient var4 = var3.acquireUnstableContentProviderClient((Uri)var1);
      var1 = EasyMock.createMock(Bundle.class);
      var4.call("grant_perms", (String)"android", (Bundle)var1);
   }
}
