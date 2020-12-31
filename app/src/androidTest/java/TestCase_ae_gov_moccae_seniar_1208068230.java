import android.graphics.Canvas;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_moccae_seniar_1208068230 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Canvas.class);
      byte var1 = 1;
      ((Canvas)var2).restoreToCount(var1);
   }
}
