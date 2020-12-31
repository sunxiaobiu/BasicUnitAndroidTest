import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_and_games505_gemsofwar_601322616 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Drawable.class);
      Object var1 = EasyMock.createMock(Mode.class);
      DrawableCompat.setTintMode((Drawable)var0, (Mode)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
