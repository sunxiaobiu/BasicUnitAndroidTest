import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6095738E71518538FC0F3D036BECD9AA2ADA9A97F36E1F35F7D9A97D50731878_714091033 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      Object var1 = EasyMock.createMock(Property.class);
      Object var2 = null;
      Object var3 = EasyMock.createMock(Rect[].class);
      ObjectAnimator.ofObject(var0, (Property)var1, (TypeEvaluator)var2, (Object[])var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
