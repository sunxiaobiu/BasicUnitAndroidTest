import android.content.Context;
import android.os.UserHandle;
import android.os.UserManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0597FAC16D970073BC385C825682BCC21E5772FE5F45013D9831E7A32D52D978__1562705546 {
   @Test
   public void testCase() throws Exception {
      Context var4 = InstrumentationRegistry.getTargetContext();
      Object var5 = var4.getSystemService("user");
      UserManager var6 = (UserManager)var5;
      Object var3 = EasyMock.createMock(UserHandle.class);
      var6.getSerialNumberForUser((UserHandle)var3);
   }
}
