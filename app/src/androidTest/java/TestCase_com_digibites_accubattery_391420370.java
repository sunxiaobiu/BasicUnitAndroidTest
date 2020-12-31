import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_digibites_accubattery_391420370 {
   @Test
   public void testCase() throws Exception {
      SpannableStringBuilder var2 = new SpannableStringBuilder();
      Object var1 = EasyMock.createMock(ImageSpan.class);
      var2.append("[icon]", var1, 33);
   }
}
