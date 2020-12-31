import android.os.LocaleList;
import android.text.TextPaint;
import android.text.PrecomputedText.Params;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_07C16B43B99BD97478ED1AB0F6F61BDF51478944B849B231FE161536475E37A1_737855690 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(TextPaint.class);
      var2 = EasyMock.createMock(Params.class);
      TextPaint var3 = ((Params)var2).getTextPaint();
      LocaleList var4 = var3.getTextLocales();
      Object var1 = EasyMock.createMock(LocaleList.class);
      var4.equals(var1);
   }
}
