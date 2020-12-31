import android.os.PersistableBundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_33020A2A591B70BEE7C7B4E0B6FAD20180D9C0D2A85BEA325B925C9979BA34F9_1771693547 {
   @Test
   public void testCase() throws Exception {
      Object[] var4 = new Object[0];
      Object var5 = EasyMock.createMock(Object[].class);
      var5 = ((Object[])var5)[0];
      PersistableBundle var6 = (PersistableBundle)var5;
      String var3 = "android";
      var6.getLong(var3, 0L);
   }
}
