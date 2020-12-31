import android.graphics.Region;
import android.inputmethodservice.InputMethodService.Insets;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_facemoji_lite__20226426 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(Insets.class);
      Region var5 = ((Insets)var4).touchableRegion;
      byte var1 = 1;
      byte var2 = 1;
      byte var3 = 1;
      var5.set(0, var1, var2, var3);
   }
}
