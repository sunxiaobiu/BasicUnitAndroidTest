import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_br_com_enjoei_app__127942985 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Spanned.class);
      byte var1 = 1;
      byte var2 = 1;
      Object var3 = EasyMock.createMock(SpannableString.class);
      TextUtils.copySpansFrom((Spanned)var0, var1, var2, (Class)null, (Spannable)var3, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
