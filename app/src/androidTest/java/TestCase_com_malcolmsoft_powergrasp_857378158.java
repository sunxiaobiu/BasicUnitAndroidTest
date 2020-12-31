import android.text.SpannableString;
import android.text.TextUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_malcolmsoft_powergrasp_857378158 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(SpannableString.class);
      CharSequence var1 = TextUtils.stringOrSpannedString((CharSequence)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
