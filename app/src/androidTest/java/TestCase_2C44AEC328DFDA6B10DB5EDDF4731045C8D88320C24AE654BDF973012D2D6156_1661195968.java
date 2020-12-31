import android.content.res.Resources;
import android.content.res.Resources.Theme;
import androidx.test.runner.AndroidJUnit4;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_2C44AEC328DFDA6B10DB5EDDF4731045C8D88320C24AE654BDF973012D2D6156_1661195968 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Theme.class);
      VectorDrawableCompat.create((Resources)var0, var1, (Theme)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
