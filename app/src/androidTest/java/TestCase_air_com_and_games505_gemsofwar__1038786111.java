import android.content.Context;
import android.os.UserHandle;
import android.os.UserManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_and_games505_gemsofwar__1038786111 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("user");
      UserManager var4 = (UserManager)var3;
      Object var1 = EasyMock.createMock(UserHandle.class);
      var4.isUserRunning((UserHandle)var1);
   }
}
