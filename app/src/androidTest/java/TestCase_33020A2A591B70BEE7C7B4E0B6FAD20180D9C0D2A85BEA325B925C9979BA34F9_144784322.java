import android.os.PersistableBundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_33020A2A591B70BEE7C7B4E0B6FAD20180D9C0D2A85BEA325B925C9979BA34F9_144784322 {
   @Test
   public void testCase() throws Exception {
      Object[] var2 = new Object[0];
      Object var3 = EasyMock.createMock(Object[].class);
      var3 = ((Object[])var3)[0];
      PersistableBundle var4 = (PersistableBundle)var3;
      String var1 = "android";
      var4.getBoolean(var1, false);
   }
}
