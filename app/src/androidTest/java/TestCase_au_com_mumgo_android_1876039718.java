import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.URLSpan;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_mumgo_android_1876039718 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Spanned.class);
      SpannableString var2 = new SpannableString((CharSequence)var1);
      var1 = EasyMock.createMock(URLSpan.class);
      var2.getSpanFlags(var1);
   }
}
