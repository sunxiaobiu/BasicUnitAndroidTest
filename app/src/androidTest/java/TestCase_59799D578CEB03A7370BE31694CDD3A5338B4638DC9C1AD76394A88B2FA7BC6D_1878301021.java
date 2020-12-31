import android.content.Context;
import androidx.test.runner.AndroidJUnit4;
import androidx.work.Configuration;
import androidx.work.WorkManager;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59799D578CEB03A7370BE31694CDD3A5338B4638DC9C1AD76394A88B2FA7BC6D_1878301021 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(Configuration.class);
      WorkManager.initialize((Context)var0, (Configuration)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
