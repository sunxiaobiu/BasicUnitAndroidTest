import android.graphics.Paint.FontMetricsInt;
import android.text.TextPaint;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_07C16B43B99BD97478ED1AB0F6F61BDF51478944B849B231FE161536475E37A1__607093318 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(TextView.class);
      TextPaint var2 = ((TextView)var1).getPaint();
      int var3 = var2.getFontMetricsInt((FontMetricsInt)null);
   }
}
