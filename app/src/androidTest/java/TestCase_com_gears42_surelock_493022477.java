import android.content.ContentResolver;
import android.provider.Settings.Global;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock_493022477 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      byte var1 = 1;
      Global.putInt((ContentResolver)var0, "airplane_mode_on", var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
