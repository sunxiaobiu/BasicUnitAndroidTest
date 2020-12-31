import android.animation.ObjectAnimator;
import android.graphics.Path;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_teovogel_yip__557928196 {
   public static void testCase() throws Exception {
      Object var0 = null;
      String var1 = "android";
      String var2 = "android";
      Object var3 = EasyMock.createMock(Path.class);
      ObjectAnimator.ofFloat(var0, var1, var2, (Path)var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
