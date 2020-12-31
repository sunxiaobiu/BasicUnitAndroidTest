import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.DynamicLayout.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_07C16B43B99BD97478ED1AB0F6F61BDF51478944B849B231FE161536475E37A1__201353827 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(SpannableStringBuilder.class);
      Object var1 = EasyMock.createMock(TextPaint.class);
      byte var2 = 1;
      Builder.obtain((CharSequence)var0, (TextPaint)var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
