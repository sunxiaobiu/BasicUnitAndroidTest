import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_echoff_easyswitch_1320132260 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("activity");
      ActivityManager var5 = (ActivityManager)var4;
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Bundle.class);
      var5.moveTaskToFront(var1, 0, (Bundle)var2);
   }
}
