import android.content.ContentResolver;
import android.provider.Settings.Secure;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_boostcharge_standard_launcher_1615123031 {
   public static void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ContentResolver.class);
      long var0 = Secure.getLong((ContentResolver)var2, "lockscreen.password_type", 0L);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
