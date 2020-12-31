import android.util.AttributeSet;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_apex_h_xpressalert_1717054914 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AttributeSet.class);
      float var1 = 1.0F;
      ((AttributeSet)var2).getAttributeFloatValue("http://schemas.android.com/apk/res-auto", "rippleSpeed", var1);
   }
}
