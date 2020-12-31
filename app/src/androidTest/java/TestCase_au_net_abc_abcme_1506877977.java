import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_net_abc_abcme_1506877977 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Drawable.class);
      BitmapDrawable var2 = (BitmapDrawable)var1;
      Paint var3 = var2.getPaint();
   }
}
