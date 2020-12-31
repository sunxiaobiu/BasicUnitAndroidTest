import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_595A379329900BEA03111C2A9CDAF3A886A37FDAA8B15F54AD7804F327D9A84F_287122074 {
   @Test
   public void testCase() throws Exception {
      int[] var2 = new int[2];
      Object var1 = EasyMock.createMock(View.class);
      ObjectAnimator var3 = ObjectAnimator.ofInt(var1, "backgroundColor", var2);
      var1 = EasyMock.createMock(ArgbEvaluator.class);
      var3.setEvaluator((TypeEvaluator)var1);
   }
}
