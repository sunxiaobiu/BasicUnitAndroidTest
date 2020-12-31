import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_037B30971A12505AB98C475CAAECCF6FA37CCED16D5FFD304CC9E8A549A7A569_1332138377 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(TypeEvaluator.class);
      Object var2 = null;
      ObjectAnimator.ofObject(var0, "position", (TypeEvaluator)var1, (Object[])var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
