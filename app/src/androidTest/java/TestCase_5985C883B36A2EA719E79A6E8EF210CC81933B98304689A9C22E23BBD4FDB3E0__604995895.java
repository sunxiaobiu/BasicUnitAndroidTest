import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5985C883B36A2EA719E79A6E8EF210CC81933B98304689A9C22E23BBD4FDB3E0__604995895 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ArgbEvaluator.class);
      Object var1 = null;
      ValueAnimator.ofObject((TypeEvaluator)var0, (Object[])var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
