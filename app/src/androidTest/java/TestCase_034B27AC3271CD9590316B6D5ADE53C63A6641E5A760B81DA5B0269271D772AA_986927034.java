import android.support.v4.view.ViewCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_034B27AC3271CD9590316B6D5ADE53C63A6641E5A760B81DA5B0269271D772AA_986927034 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      float var1 = 1.0F;
      ViewCompat.setTranslationY((View)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
