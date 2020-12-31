import android.content.Context;
import android.os.UserManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah__101731059 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("user");
      UserManager var5 = (UserManager)var4;
      long var1 = 1L;
      var5.getUserForSerialNumber(var1);
   }
}
