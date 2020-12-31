import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_blackberry_calendar_197079745 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Resources.class);
      Drawable var3 = ((Resources)var2).getDrawable(2130837784, (Theme)null);
      GradientDrawable var4 = (GradientDrawable)var3;
      InsetDrawable var1 = new InsetDrawable(var4, 2);
      var1.mutate();
   }
}
