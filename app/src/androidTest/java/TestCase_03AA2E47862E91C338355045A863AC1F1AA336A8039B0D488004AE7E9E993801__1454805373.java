import android.graphics.ColorSpace;
import android.graphics.BitmapFactory.Options;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_03AA2E47862E91C338355045A863AC1F1AA336A8039B0D488004AE7E9E993801__1454805373 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Options.class);
      ColorSpace var2 = ((Options)var1).outColorSpace;
      boolean var3 = var2.isWideGamut();
   }
}
