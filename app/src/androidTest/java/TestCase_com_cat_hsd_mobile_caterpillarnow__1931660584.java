import android.graphics.drawable.Drawable;
import android.support.design.widget.TextInputLayout;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cat_hsd_mobile_caterpillarnow__1931660584 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(TextInputLayout.class);
      Object var1 = EasyMock.createMock(Drawable.class);
      ((TextInputLayout)var2).setPasswordVisibilityToggleDrawable((Drawable)var1);
   }
}
