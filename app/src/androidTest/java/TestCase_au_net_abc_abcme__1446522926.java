import android.text.Layout;
import android.text.TextPaint;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_net_abc_abcme__1446522926 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(TextPaint.class);
      Layout.getDesiredWidth((CharSequence)var0, (TextPaint)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
