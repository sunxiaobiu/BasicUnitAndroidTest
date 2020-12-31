import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_03E3A2E3B45D58DB8159EB2428FDE6937DD8FB711A7004B5840D5B43B1D73D27_2027282901 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      ContentResolver var3 = var2.getContentResolver();
      Object var1 = EasyMock.createMock(Uri.class);
      var3.releasePersistableUriPermission((Uri)var1, 3);
   }
}
