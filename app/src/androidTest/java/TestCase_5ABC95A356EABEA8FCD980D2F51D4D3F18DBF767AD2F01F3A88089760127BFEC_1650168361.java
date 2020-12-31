import android.os.BaseBundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5ABC95A356EABEA8FCD980D2F51D4D3F18DBF767AD2F01F3A88089760127BFEC_1650168361 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(BaseBundle.class);
      String var1 = "android";
      byte var2 = 1;
      ((BaseBundle)var3).putInt(var1, var2);
   }
}
