import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.UserHandle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amazon_sellermobile_android__963637529 {
   @Test
   public void testCase() throws Exception {
      Context var5 = InstrumentationRegistry.getTargetContext();
      Object var1 = EasyMock.createMock(Intent.class);
      Object var2 = EasyMock.createMock(UserHandle.class);
      String var3 = "android";
      Object var4 = null;
      var5.sendOrderedBroadcastAsUser((Intent)var1, (UserHandle)var2, var3, (BroadcastReceiver)var4, (Handler)null, -1, (String)null, (Bundle)null);
   }
}
