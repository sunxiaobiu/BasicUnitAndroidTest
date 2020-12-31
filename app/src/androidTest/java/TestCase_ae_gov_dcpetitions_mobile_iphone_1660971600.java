import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone_1660971600 {
   @Test
   public void testCase() throws Exception {
      StateListDrawable var3 = new StateListDrawable();
      int[] var1 = new int[1];
      Object var2 = EasyMock.createMock(Drawable.class);
      var3.addState(var1, (Drawable)var2);
   }
}
