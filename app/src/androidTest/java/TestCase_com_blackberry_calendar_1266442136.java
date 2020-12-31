import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_blackberry_calendar_1266442136 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Resources.class);
      Drawable var2 = ((Resources)var1).getDrawable(2130837784, (Theme)null);
      GradientDrawable var3 = (GradientDrawable)var2;
      int var4 = var3.getIntrinsicHeight();
   }
}
