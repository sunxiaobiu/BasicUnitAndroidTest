import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_serviceseeking_298243604 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Drawable.class);
      LayerDrawable var3 = (LayerDrawable)var2;
      byte var1 = 1;
      var3.getId(var1);
   }
}
