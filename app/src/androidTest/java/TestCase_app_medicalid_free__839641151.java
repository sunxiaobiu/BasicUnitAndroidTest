import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.StaticLayout.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_medicalid_free__839641151 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(SpannableStringBuilder.class);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(TextPaint.class);
      byte var3 = 1;
      Builder.obtain((CharSequence)var0, 0, var1, (TextPaint)var2, var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
