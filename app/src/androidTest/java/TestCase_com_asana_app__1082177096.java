import android.text.Spannable;
import android.text.TextUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_asana_app__1082177096 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Spannable.class);
      byte var1 = 1;
      byte var2 = 1;
      TextUtils.indexOf((CharSequence)var0, '\n', var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
