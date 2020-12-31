import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_august_fizika_183691606 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(Property.class);
      int[] var2 = new int[1];
      ObjectAnimator.ofInt(var0, (Property)var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
