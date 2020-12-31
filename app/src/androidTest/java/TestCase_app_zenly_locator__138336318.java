import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.Window;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_zenly_locator__138336318 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Window.class);
      Object var1 = EasyMock.createMock(Property.class);
      int[] var2 = new int[1];
      ObjectAnimator.ofArgb(var0, (Property)var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
