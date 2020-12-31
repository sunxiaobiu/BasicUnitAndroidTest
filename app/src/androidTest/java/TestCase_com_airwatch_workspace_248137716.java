import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_workspace_248137716 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Drawable.class);
      BitmapDrawable var3 = (BitmapDrawable)var2;
      Object var1 = EasyMock.createMock(DisplayMetrics.class);
      var3.setTargetDensity((DisplayMetrics)var1);
   }
}
