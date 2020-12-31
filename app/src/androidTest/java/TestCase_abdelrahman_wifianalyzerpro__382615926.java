import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_wifianalyzerpro__382615926 {
   @Test
   public void testCase() throws Exception {
      Paint var2 = new Paint(5);
      Object var1 = EasyMock.createMock(CornerPathEffect.class);
      var2.setPathEffect((PathEffect)var1);
   }
}
