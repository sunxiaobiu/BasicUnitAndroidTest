import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.PropertyValuesHolder;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5985C883B36A2EA719E79A6E8EF210CC81933B98304689A9C22E23BBD4FDB3E0_1101478398 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      Object var1 = EasyMock.createMock(PropertyValuesHolder[].class);
      ObjectAnimator.ofPropertyValuesHolder(var0, (PropertyValuesHolder[])var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
