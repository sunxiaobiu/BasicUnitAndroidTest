import android.graphics.drawable.LayerDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_serviceseeking_business_android__1092019674 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(LayerDrawable.class);
      byte var1 = 1;
      ((LayerDrawable)var2).setLayerInset(1, 0, 0, 0, var1);
   }
}
