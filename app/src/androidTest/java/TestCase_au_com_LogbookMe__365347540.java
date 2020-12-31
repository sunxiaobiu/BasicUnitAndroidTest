import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_LogbookMe__365347540 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Spannable.class);
      byte var1 = 1;
      byte var2 = 1;
      Object var3 = EasyMock.createMock(TextPaint.class);
      Layout.getDesiredWidth((CharSequence)var0, var1, var2, (TextPaint)var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
