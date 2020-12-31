import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp_333226425 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      Drawable var1 = ResourcesCompat.getDrawable((Resources)var0, 2131165353, (Theme)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
