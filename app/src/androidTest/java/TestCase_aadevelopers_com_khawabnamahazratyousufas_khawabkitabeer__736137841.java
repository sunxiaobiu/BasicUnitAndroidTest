import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aadevelopers_com_khawabnamahazratyousufas_khawabkitabeer__736137841 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Intent.class);
      Context var1 = InstrumentationRegistry.getTargetContext();
      PendingIntent var3 = PendingIntent.getService(var1, 0, (Intent)var2, 134217728);
      var3.cancel();
   }
}
