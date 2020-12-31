import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_nk_tools_iTranslate__941961201 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var1 = EasyMock.createMock(Intent.class);
      Object var2 = EasyMock.createMock(BroadcastReceiver.class);
      var3.sendOrderedBroadcast((Intent)var1, (String)null, (BroadcastReceiver)var2, (Handler)null, -1, (String)null, (Bundle)null);
   }
}
