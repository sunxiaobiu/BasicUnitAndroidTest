import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_serviceseeking__1920522467 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Drawable.class);
      LayerDrawable var2 = (LayerDrawable)var1;
      int var3 = var2.getNumberOfLayers();
   }
}
