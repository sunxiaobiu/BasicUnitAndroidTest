import android.graphics.Rect;
import android.text.Layout;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_co_acetone_acadly__1736892061 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(TextView.class);
      Layout var4 = ((TextView)var3).getLayout();
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Rect.class);
      var4.getLineBounds(var1, (Rect)var2);
   }
}
