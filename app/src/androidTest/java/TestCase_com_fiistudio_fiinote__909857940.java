import android.graphics.Paint.FontMetricsInt;
import android.text.TextPaint;
import android.text.style.LineHeightSpan.WithDensity;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fiistudio_fiinote__909857940 {
   @Test
   public void testCase() throws Exception {
      Object var8 = EasyMock.createMock(WithDensity.class);
      Object var1 = null;
      byte var2 = 1;
      byte var3 = 1;
      byte var4 = 1;
      byte var5 = 1;
      Object var6 = EasyMock.createMock(FontMetricsInt.class);
      Object var7 = EasyMock.createMock(TextPaint.class);
      ((WithDensity)var8).chooseHeight((CharSequence)var1, var2, var3, var4, var5, (FontMetricsInt)var6, (TextPaint)var7);
   }
}
