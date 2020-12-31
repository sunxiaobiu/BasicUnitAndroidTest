import android.content.Context;
import android.net.Uri;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_MSPMobile__453829673 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var1 = EasyMock.createMock(Uri.class);
      var2.grantUriPermission("com.android.systemui", (Uri)var1, 1);
   }
}
