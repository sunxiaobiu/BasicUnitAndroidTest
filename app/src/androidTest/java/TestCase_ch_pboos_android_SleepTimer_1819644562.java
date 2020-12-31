import android.content.ComponentName;
import android.content.Context;
import android.service.quicksettings.TileService;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_pboos_android_SleepTimer_1819644562 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(ComponentName.class);
      TileService.requestListeningState((Context)var0, (ComponentName)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
