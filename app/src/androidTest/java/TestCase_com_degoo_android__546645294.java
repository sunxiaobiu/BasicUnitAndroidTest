import android.os.BaseBundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_degoo_android__546645294 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(BaseBundle.class);
      String var1 = "android";
      String var2 = "android";
      ((BaseBundle)var3).putString(var1, var2);
   }
}
