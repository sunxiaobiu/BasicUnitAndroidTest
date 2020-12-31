import android.content.ContentResolver;
import android.provider.Settings.Global;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_paysafecard_android_1357572351 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      String var1 = Global.getString((ContentResolver)var0, "adb_enabled");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
