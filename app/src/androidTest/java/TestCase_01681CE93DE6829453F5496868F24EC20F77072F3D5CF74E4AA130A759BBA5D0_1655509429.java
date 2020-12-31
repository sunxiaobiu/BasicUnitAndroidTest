import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01681CE93DE6829453F5496868F24EC20F77072F3D5CF74E4AA130A759BBA5D0_1655509429 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(RunningAppProcessInfo.class);
      ActivityManager.getMyMemoryState((RunningAppProcessInfo)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
