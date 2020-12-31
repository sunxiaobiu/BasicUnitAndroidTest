import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableWrapper;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_kaspersky_qrscanner__1761741829 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Drawable.class);
      DrawableWrapper var2 = (DrawableWrapper)var1;
      Drawable var3 = var2.getWrappedDrawable();
   }
}
