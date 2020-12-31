import android.graphics.drawable.Drawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_net_abc_abcme_1958370211 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Drawable.class);
      float var1 = 1.0F;
      float var2 = 1.0F;
      ((Drawable)var3).setHotspot(var1, var2);
   }
}
