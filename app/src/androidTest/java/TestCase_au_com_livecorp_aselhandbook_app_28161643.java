import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_livecorp_aselhandbook_app_28161643 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SpannableStringBuilder.class);
      Object var1 = EasyMock.createMock(URLSpan.class);
      ((SpannableStringBuilder)var2).getSpanFlags(var1);
   }
}
