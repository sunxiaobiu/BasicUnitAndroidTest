import android.text.TextPaint;
import android.text.PrecomputedText.Params;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_07C16B43B99BD97478ED1AB0F6F61BDF51478944B849B231FE161536475E37A1_1894813466 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(TextPaint.class);
      var1 = EasyMock.createMock(Params.class);
      TextPaint var2 = ((Params)var1).getTextPaint();
      float var3 = var2.getTextSkewX();
   }
}
