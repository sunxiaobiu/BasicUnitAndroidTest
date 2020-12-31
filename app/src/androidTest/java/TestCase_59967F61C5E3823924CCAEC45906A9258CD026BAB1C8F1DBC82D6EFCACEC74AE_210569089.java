import android.content.Context;
import androidx.core.os.UserManagerCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59967F61C5E3823924CCAEC45906A9258CD026BAB1C8F1DBC82D6EFCACEC74AE_210569089 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      boolean var1 = UserManagerCompat.isUserUnlocked((Context)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
