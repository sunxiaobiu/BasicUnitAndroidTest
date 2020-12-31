import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_03AA2E47862E91C338355045A863AC1F1AA336A8039B0D488004AE7E9E993801__1751764510 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Drawable.class);
      Object var1 = EasyMock.createMock(ColorStateList.class);
      DrawableCompat.setTintList((Drawable)var0, (ColorStateList)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
