import android.text.Layout;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ig_android_ta_1041585240 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(TextView.class);
      Layout var3 = ((TextView)var2).getLayout();
      byte var1 = 1;
      var3.getLineBottom(var1);
   }
}
