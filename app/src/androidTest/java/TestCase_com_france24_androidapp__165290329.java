import android.support.v4.view.MarginLayoutParamsCompat;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_france24_androidapp__165290329 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(MarginLayoutParams.class);
      byte var1 = 1;
      MarginLayoutParamsCompat.setMarginEnd((MarginLayoutParams)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
