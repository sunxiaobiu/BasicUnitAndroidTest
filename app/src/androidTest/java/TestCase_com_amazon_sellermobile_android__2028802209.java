import android.content.Context;
import android.content.Intent;
import android.os.UserHandle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amazon_sellermobile_android__2028802209 {
   @Test
   public void testCase() throws Exception {
      Context var4 = InstrumentationRegistry.getTargetContext();
      Object var1 = EasyMock.createMock(Intent.class);
      Object var2 = EasyMock.createMock(UserHandle.class);
      String var3 = "android";
      var4.sendBroadcastAsUser((Intent)var1, (UserHandle)var2, var3);
   }
}
