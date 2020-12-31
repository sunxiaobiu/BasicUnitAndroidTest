import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_appexpress_com_jbsims_590047098 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(TextPaint.class);
      float var2 = 1.0F;
      Object var3 = EasyMock.createMock(TruncateAt.class);
      TextUtils.ellipsize((CharSequence)var0, (TextPaint)var1, var2, (TruncateAt)var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
