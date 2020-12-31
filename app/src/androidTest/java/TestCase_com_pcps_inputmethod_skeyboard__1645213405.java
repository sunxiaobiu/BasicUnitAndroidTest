import android.text.AutoText;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_pcps_inputmethod_skeyboard__1645213405 {
   public static void testCase() throws Exception {
      String var0 = "android";
      byte var1 = 1;
      Object var2 = EasyMock.createMock(View.class);
      AutoText.get(var0, 0, var1, (View)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
